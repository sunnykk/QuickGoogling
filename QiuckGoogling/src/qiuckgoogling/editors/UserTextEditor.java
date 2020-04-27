package qiuckgoogling.editors;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditor;

public class UserTextEditor extends AbstractDecoratedTextEditor {
	@Override
	protected void editorContextMenuAboutToShow(IMenuManager menu) {
		super.editorContextMenuAboutToShow(menu);
		addAction(menu, "ContentAssistProposal"); 
		addAction(menu, "ContentAssistTip"); 
		addAction(menu, "test"); 
	}
}