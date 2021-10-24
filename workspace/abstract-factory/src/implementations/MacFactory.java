package implementations;

import interfaces.GUIFactory;

public class MacFactory implements GUIFactory {

	@Override
	public MacButton createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public MacCheckbox createCheckbox() {
		// TODO Auto-generated method stub
		return new MacCheckbox();
	}

}
