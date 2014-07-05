package com.ash.androidlnavigationbar;

import android.content.res.XModuleResources;
import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XSharedPreferences;
import de.robv.android.xposed.callbacks.XC_InitPackageResources.InitPackageResourcesParam;


public class HookClass implements IXposedHookInitPackageResources,IXposedHookZygoteInit {
    
    private static String MODULE_PATH = null;

    @Override
    public void initZygote(StartupParam startupParam) throws Throwable {
        MODULE_PATH = startupParam.modulePath;
        
        prefs = new XSharedPreferences("com.ash.androidlnavigationbar","myPrefsKey");
        
        style = prefs.getInt("style", 0);
    }
    
    int down,back,home,menu,recent,search;
	int style;
	public XSharedPreferences prefs;

    @Override
    public void handleInitPackageResources(InitPackageResourcesParam resparam) throws Throwable {
    	
        XModuleResources modRes = XModuleResources.createInstance(MODULE_PATH, resparam.res);
        
        
        switch (style) 
        {
			case 0:
			{
				home = R.drawable.sh_home;
				recent = R.drawable.sh_recent;
				back = R.drawable.sh_back;
			}
			break;
	
			case 1: 
			{
				home = R.drawable.trad_home;
				recent = R.drawable.trad_recent;
				back = R.drawable.trad_back;
			}
			break;
			
			default:
			{
				home = R.drawable.sh_home;
				recent = R.drawable.sh_recent;
				back = R.drawable.sh_back;
			}
				break;
		}
        
        down = R.drawable.down;
        menu = R.drawable.menu;
        
        try {
       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_ime", modRes.fwd(down));} catch (Exception e) { }
       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back", modRes.fwd(back));} catch (Exception e) { }
       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_ime_land", modRes.fwd(down));} catch (Exception e) { }

       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_land", modRes.fwd(back));} catch (Exception e) { }
       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_side", modRes.fwd(back));} catch (Exception e) { }

       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_land", modRes.fwd(home));} catch (Exception e) { }
       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu", modRes.fwd(menu));} catch (Exception e) { }

       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_big", modRes.fwd(menu));} catch (Exception e) { }
       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_big_land", modRes.fwd(menu));} catch (Exception e) { }
       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_land", modRes.fwd(menu));} catch (Exception e) { }

       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent", modRes.fwd(recent));} catch (Exception e) { }
       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_land", modRes.fwd(recent));} catch (Exception e) { }
       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_side", modRes.fwd(recent));} catch (Exception e) { }
			 
       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home", modRes.fwd(home));} catch (Exception e) { }
       	 
       	 
       	 //******************************htc icons**********************************//
       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "navigation_icon_back", modRes.fwd(back));} catch (Exception e) { }

       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "navigation_icon_recent_apps", modRes.fwd(recent));} catch (Exception e) { }

       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "navigation_icon_menu", modRes.fwd(menu));} catch (Exception e) { }

       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "navigation_icon_home", modRes.fwd(home));} catch (Exception e) { }

       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "navigation_icon_down", modRes.fwd(down));} catch (Exception e) { }

       	 //some other alien phone
         	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "system_bar_icon_menu", modRes.fwd(menu));} catch (Exception e) { }
     	 
       	 
       	 //******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal_land_trans", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal_trans", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal_land_trans", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal_trans", modRes.fwd(home));} catch (Exception e) { }
		       	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_normal_land_trans", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_normal_trans", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal_land_trans", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal_trans", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	 
         	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal", modRes.fwd(home));} catch (Exception e) { }
		       	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_normal", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	 
         	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal", modRes.fwd(home));} catch (Exception e) { }
		       	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_normal", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	 //******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_pressed_land", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_pressed", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_pressed_land_trans", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_pressed_trans", modRes.fwd(back));} catch (Exception e) { }
	
	       	 
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_pressed_land", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_pressed", modRes.fwd(home));} catch (Exception e) { }
		     
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_pressed_land_trans", modRes.fwd(home));} catch (Exception e) { }
	    	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_pressed_trans", modRes.fwd(home));} catch (Exception e) { }
		       
	       	 
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_pressed_land", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_pressed", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_pressed_land_trans", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_menu_pressed_trans", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 
	       	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_pressed_land", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_pressed", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_pressed_land_trans", modRes.fwd(recent));} catch (Exception e) { }

        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_pressed_trans", modRes.fwd(recent));} catch (Exception e) { }
      	 
        	 
         	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal_land_trans", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal_trans", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal_land_trans", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal_trans", modRes.fwd(home));} catch (Exception e) { }
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_normal_land_trans", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_normal_trans", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal_land_trans", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal_trans", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	 
         	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal", modRes.fwd(home));} catch (Exception e) { }
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_normal", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	 
         	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal", modRes.fwd(home));} catch (Exception e) { }
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_normal", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal_land_trans", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal_trans", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal_land_trans", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal_trans", modRes.fwd(home));} catch (Exception e) { }
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_normal_land_trans", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_normal_trans", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal_land_trans", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal_trans", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	 
         	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal", modRes.fwd(home));} catch (Exception e) { }
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_normal", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	 
         	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal", modRes.fwd(home));} catch (Exception e) { }
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_normal", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal_land_trans", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal_trans", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal_land_trans", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal_trans", modRes.fwd(home));} catch (Exception e) { }
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_normal_land_trans", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_normal_trans", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal_land_trans", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal_trans", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	 
         	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal", modRes.fwd(home));} catch (Exception e) { }
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_normal", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	 
         	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal", modRes.fwd(home));} catch (Exception e) { }
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_normal", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal_land_trans", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal_trans", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal_land_trans", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal_trans", modRes.fwd(home));} catch (Exception e) { }
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_normal_land_trans", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_normal_trans", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal_land_trans", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal_trans", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	 
         	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal", modRes.fwd(home));} catch (Exception e) { }
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_normal", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	 
         	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal", modRes.fwd(home));} catch (Exception e) { }
		       	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_normal_land", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_normal", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	 
         	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_pressed_land", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_pressed", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_pressed_land_trans", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_pressed_trans", modRes.fwd(back));} catch (Exception e) { }
	
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_pressed_land", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_pressed", modRes.fwd(home));} catch (Exception e) { }
		     
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_pressed_land_trans", modRes.fwd(home));} catch (Exception e) { }
	    	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_pressed_trans", modRes.fwd(home));} catch (Exception e) { }
		       
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_pressed_land", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_pressed", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_pressed_land_trans", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_menu_pressed_trans", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_pressed_land", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_pressed", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_pressed_land_trans", modRes.fwd(recent));} catch (Exception e) { }

        	 try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_pressed_trans", modRes.fwd(recent));} catch (Exception e) { }

        	 
        	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_pressed_land", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_pressed", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_pressed_land_trans", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_pressed_trans", modRes.fwd(back));} catch (Exception e) { }
	
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_pressed_land", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_pressed", modRes.fwd(home));} catch (Exception e) { }
		     
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_pressed_land_trans", modRes.fwd(home));} catch (Exception e) { }
	    	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_pressed_trans", modRes.fwd(home));} catch (Exception e) { }
		       
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_pressed_land", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_pressed", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_pressed_land_trans", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_menu_pressed_trans", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_pressed_land", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_pressed", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_pressed_land_trans", modRes.fwd(recent));} catch (Exception e) { }

        	 try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_pressed_trans", modRes.fwd(recent));} catch (Exception e) { }

        	 
        	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_pressed_land", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_pressed", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_pressed_land_trans", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_pressed_trans", modRes.fwd(back));} catch (Exception e) { }
	
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_pressed_land", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_pressed", modRes.fwd(home));} catch (Exception e) { }
		     
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_pressed_land_trans", modRes.fwd(home));} catch (Exception e) { }
	    	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_pressed_trans", modRes.fwd(home));} catch (Exception e) { }
		       
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_pressed_land", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_pressed", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_pressed_land_trans", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_menu_pressed_trans", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_pressed_land", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_pressed", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_pressed_land_trans", modRes.fwd(recent));} catch (Exception e) { }

        	 try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_pressed_trans", modRes.fwd(recent));} catch (Exception e) { }

        	 
        	//******************************lg g2****************************//
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_pressed_land", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_pressed", modRes.fwd(back));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_pressed_land_trans", modRes.fwd(back));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_pressed_trans", modRes.fwd(back));} catch (Exception e) { }
	
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_pressed_land", modRes.fwd(home));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_pressed", modRes.fwd(home));} catch (Exception e) { }
		     
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_pressed_land_trans", modRes.fwd(home));} catch (Exception e) { }
	    	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_pressed_trans", modRes.fwd(home));} catch (Exception e) { }
		       
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_pressed_land", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_pressed", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_pressed_land_trans", modRes.fwd(menu));} catch (Exception e) { }

	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_menu_pressed_trans", modRes.fwd(menu));} catch (Exception e) { }
	
	       	 
	       	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_pressed_land", modRes.fwd(recent));} catch (Exception e) { }

         	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_pressed", modRes.fwd(recent));} catch (Exception e) { }
       	 
         	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_pressed_land_trans", modRes.fwd(recent));} catch (Exception e) { }

        	 try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_pressed_trans", modRes.fwd(recent));} catch (Exception e) { }

        	 
        	 //*****************************miui******************************************//
        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "screen_key_back_settings", modRes.fwd(back));} catch (Exception e) { }

        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "screen_key_recent_apps_settings", modRes.fwd(recent));} catch (Exception e) { }

        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "screen_key_menu_settings", modRes.fwd(menu));} catch (Exception e) { }

        	 try {resparam.res.setReplacement("com.android.systemui", "drawable", "screen_key_home_settings", modRes.fwd(home));} catch (Exception e) { }

         	 
       } catch (Exception e) {  }
   }

	
}
