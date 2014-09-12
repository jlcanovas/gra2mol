package gts.modernization.ui.editors.gra2mol;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.Document;

public class Gra2MoLDocument extends Document {
	private IFile _file;

	public Gra2MoLDocument(IFile file)
	{
		super();
		this._file = file;
	}

	public IFile getFile()
	{
		return _file;
	}
}
