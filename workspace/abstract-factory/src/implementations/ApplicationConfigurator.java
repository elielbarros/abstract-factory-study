package implementations;

import interfaces.GUIFactory;

public class ApplicationConfigurator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configOS = "Mac";
		
		GUIFactory factory;
		
		if(configOS == "Windows") {
			factory = new WinFactory();
		} else {
			factory = new MacFactory();
		}
		
		Application app = new Application(factory);
		app.createUIButton();
		app.createUICheckbox();
		
		app.paintButton();
		app.paintCheckbox();
	}

}
