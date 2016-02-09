package org.gra2mon.example.companies;

import java.io.File;

import gts.modernization.launcher.Gra2MoLEnricher;
import gts.modernization.launcher.Gra2MoLInterpreterLauncher;
import gts.modernization.launcher.Gra2MoLProcessLauncher;

public class CompaniesTester {
		
	static String basePath = "D:/git/gra2mol/examples/Grammar2Model.examples.101companies/";
	
	public static void main(String[] args) {
	
		Gra2MoLInterpreterLauncher interpreter = new Gra2MoLInterpreterLauncher(
				new File(basePath + "gra2mol/src/transformation.g2m"), 
				new File(basePath + "gra2mol/metamodels/Company.ecore"), 
				"company", 
				new File("./resultModel.ecore.xmi"), 
				"Company", 
				"company", 
				new File(basePath + "gra2mol/src/example_big.101"));
		interpreter.setCaseSensitive(true);
		Gra2MoLProcessLauncher processLauncher = new Gra2MoLProcessLauncher(
				new Gra2MoLEnricher(
						"company",
						new File(basePath + "gra2mol/grammars/Company.g"), 
						new File(basePath + "gra2mol/gen/Company.g")), 
						interpreter);
	
		processLauncher.setActivePhase1(false);
		processLauncher.launch();
	}
}
