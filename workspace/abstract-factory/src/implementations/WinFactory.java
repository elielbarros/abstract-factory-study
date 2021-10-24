package implementations;

import interfaces.GUIFactory;

public class WinFactory implements GUIFactory {

	@Override
	public WinButton createButton() {
		// TODO Auto-generated method stub
		return new WinButton();
	}

	@Override
	public WinCheckbox createCheckbox() {
		// TODO Auto-generated method stub
		return new WinCheckbox();
	}

}
