package com.ash.androidlnavigationbar;

import android.content.res.XModuleResources;
import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_InitPackageResources.InitPackageResourcesParam;


public class HookClass implements IXposedHookZygoteInit, IXposedHookInitPackageResources {
    private static String MODULE_PATH = null;

    @Override
    public void initZygote(StartupParam startupParam) throws Throwable {
        MODULE_PATH = startupParam.modulePath;
    }

    @Override
    public void handleInitPackageResources(InitPackageResourcesParam resparam) throws Throwable {
        
        XModuleResources modRes = XModuleResources.createInstance(MODULE_PATH, resparam.res);
        
        try {
			
        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_ime", modRes.fwd(R.drawable.ic_sysbar_back_ime));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_ime_land", modRes.fwd(R.drawable.ic_sysbar_back_ime_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_land", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_side", modRes.fwd(R.drawable.ic_sysbar_back_side));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_highlight", modRes.fwd(R.drawable.ic_sysbar_highlight));} catch (Exception e) {XposedBridge.log("icons have pooped");}

        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_highlight_land", modRes.fwd(R.drawable.ic_sysbar_highlight_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_land", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}

        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_big", modRes.fwd(R.drawable.ic_sysbar_menu_big));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_big_land", modRes.fwd(R.drawable.ic_sysbar_menu_big_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_land", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_land", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_side", modRes.fwd(R.drawable.ic_sysbar_recent_side));} catch (Exception e) {XposedBridge.log("icons have pooped");}

        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_search", modRes.fwd(R.drawable.ic_sysbar_search));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_search_land", modRes.fwd(R.drawable.ic_sysbar_search_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_search_side", modRes.fwd(R.drawable.ic_sysbar_search_side));} catch (Exception e) {XposedBridge.log("icons have pooped");}

        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
        	 //******************************htc icons**********************************//
        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "navigation_icon_back", modRes.fwd(R.drawable.navigation_icon_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}

        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "navigation_icon_recent_apps", modRes.fwd(R.drawable.navigation_icon_recent_apps));} catch (Exception e) {XposedBridge.log("icons have pooped");}

        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "navigation_icon_menu", modRes.fwd(R.drawable.navigation_icon_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}

        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "navigation_icon_home", modRes.fwd(R.drawable.navigation_icon_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}

        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "navigation_icon_down", modRes.fwd(R.drawable.navigation_icon_down));} catch (Exception e) {XposedBridge.log("icons have pooped");}

        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "navigation_icon_search", modRes.fwd(R.drawable.navigation_icon_search));} catch (Exception e) {XposedBridge.log("icons have pooped");}
 
        	 //some other alien phone
          	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "system_bar_icon_menu", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
      	 
        	 
        	 //******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal_trans", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal_trans", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_normal_trans", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal_trans", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	 
          	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_normal", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	 
          	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_normal", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	 //******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_pressed_land", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_pressed", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_pressed_land", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_pressed", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		     
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	    	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       
	       	 
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_pressed_land", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_pressed", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_pressed_land", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_pressed", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

         	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
       	 
         	 
          	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal_trans", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal_trans", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_normal_trans", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal_trans", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	 
          	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_normal", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	 
          	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_normal", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal_trans", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal_trans", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_normal_trans", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal_trans", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	 
          	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_normal", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	 
          	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_normal", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal_trans", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal_trans", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_normal_trans", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal_trans", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	 
          	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_normal", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	 
          	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_normal", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal_trans", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal_trans", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_normal_trans", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal_land_trans", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal_trans", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	 
          	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_normal", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	 
          	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_normal", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	 
          	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_pressed_land", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_pressed", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_pressed_land", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_pressed", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		     
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	    	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_pressed_land", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_pressed", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_pressed_land", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_pressed", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}

         	 
         	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_pressed_land", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_pressed", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_pressed_land", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_pressed", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		     
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	    	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_pressed_land", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_pressed", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_pressed_land", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_pressed", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}

         	 
         	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_pressed_land", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_pressed", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_pressed_land", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_pressed", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		     
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	    	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_pressed_land", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_pressed", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_pressed_land", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_pressed", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}

         	 
         	//******************************lg g2****************************//
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_pressed_land", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_pressed", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_back_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_back));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_pressed_land", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_pressed", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		     
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_home_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	    	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_home));} catch (Exception e) {XposedBridge.log("icons have pooped");}
		       
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_pressed_land", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_pressed", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_menu_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_menu));} catch (Exception e) {XposedBridge.log("icons have pooped");}
	
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_pressed_land", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_pressed", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}
        	 
          	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_pressed_land_trans", modRes.fwd(R.drawable.ic_sysbar_recent_land));} catch (Exception e) {XposedBridge.log("icons have pooped");}

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_pressed_trans", modRes.fwd(R.drawable.ic_sysbar_recent));} catch (Exception e) {XposedBridge.log("icons have pooped");}

          	 
        } catch (Exception e) {XposedBridge.log("this is the END!!");}
    }
}
