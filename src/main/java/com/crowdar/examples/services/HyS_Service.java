package com.crowdar.examples.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.HyS_Constants;

public class HyS_Service {

	private HyS_Service() {}

	public static void menugeneral() {
		ActionManager.click(HyS_Constants.CLICKMENU);
    	ActionManager.click(HyS_Constants.MENUGENERAL);
		ActionManager.click(HyS_Constants.MENUTURNOWEB);



    }
    


}
