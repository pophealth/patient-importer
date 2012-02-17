package org.mitre.pophealth.client;

import org.apache.log4j.xml.DOMConfigurator;
import org.mitre.pophealth.client.ui.ImporterFrame;
import org.mitre.pophealth.client.ui.ImporterFrameLogic;

public class Main {

	public static void main(String[] args) throws Exception {
		
        DOMConfigurator.configure(Main.class.getClassLoader().getResource("log4j.xml"));

		ImporterFrame frame = new ImporterFrameLogic();
		frame.setVisible(true);
	}
	
}
