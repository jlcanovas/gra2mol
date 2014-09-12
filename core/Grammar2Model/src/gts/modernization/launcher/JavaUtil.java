/*******************************************************************************
 * Copyright (c) 2008, 2011
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Javier Canovas (jlcanovas@um.es) 
 *******************************************************************************/


package gts.modernization.launcher;

import gts.modernization.interpreter.Gra2MoLLogger;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import java.util.Locale;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

/**
 * Utility class used for applying some tweaks in Java
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class JavaUtil {
	private static final Class[] parameters = new Class[]{URL.class};

	/**
	 * Adds a String (must be a path to a jar or a directory) to the classpath
	 * @param s
	 * @throws IOException
	 */
	public static void addFileToClassPath(String s) throws IOException {
		File f = new File(s);
		addFileToClassPath(f);
	}

	/**
	 * Adds a File (must be a jar or a directory) to the classpath
	 * @param f
	 * @throws IOException
	 */
	public static void addFileToClassPath(File f) throws IOException {
		addURLToClassPath(f.toURI().toURL()); 
	}


	/**
	 * Modifies the classpath to take into account the new element received as parameter
	 * @param u
	 * @throws IOException
	 */
	public static void addURLToClassPath(URL u) throws IOException {
		URLClassLoader sysloader = (URLClassLoader) ClassLoader.getSystemClassLoader(); 
		Class sysclass = URLClassLoader.class;
		try {
			Method method = sysclass.getDeclaredMethod("addURL", parameters);
			method.setAccessible(true);
			method.invoke(sysloader,new Object[]{ u });
		} catch (Throwable t) {
			t.printStackTrace();
			throw new IOException("Error, could not add URL to system classloader");
		}
	}
	
	/**
	 * Compilas a list of files dinamycally
	 * @param files
	 */
	public static void compile(List<File> files) {
		try {
			JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();       
			// Diagnostics class
			DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
			// FileManagar class
			StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);	
			// Obtaining compilationUnits
			Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjectsFromFiles(files);
						
			// Compiling
//			System.out.println(compiler.getTask(null, fileManager, diagnostics, null, null, compilationUnits).call());
			// The fileManager will allow me to control the destination path, for now, it's enough
			compiler.getTask(null, null, diagnostics, null, null, compilationUnits).call();	
//			compiler.run(null, null, null, "./src/delphiLexer.java", "./src/delphiParser.java");

			for (Diagnostic diagnostic : diagnostics.getDiagnostics()) {
				Gra2MoLLogger.getInstance().print(diagnostic.getMessage(Locale.ENGLISH));
			} 
			
			fileManager.flush();
			fileManager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
