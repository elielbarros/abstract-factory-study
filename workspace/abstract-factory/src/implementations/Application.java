package implementations;

import interfaces.Button;
import interfaces.Checkbox;
import interfaces.GUIFactory;

public class Application {
	private GUIFactory factory;
	private Button button;
	private Checkbox checkbox;

	public Application(GUIFactory factory) {
		// TODO Auto-generated constructor stub
		this.factory = factory;
	}

	public void createUIButton() {
		this.button = factory.createButton();
	}

	public void createUICheckbox() {
		this.checkbox = factory.createCheckbox();
	}

	public void paintButton() {
		this.button.paint();
	}

	public void paintCheckbox() {
		this.checkbox.paint();
	}
}
