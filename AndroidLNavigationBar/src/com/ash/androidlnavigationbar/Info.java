package com.ash.androidlnavigationbar;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.ash.androidlnavigationbar.AlertDialogRadio.AlertPositiveListener;

public class Info extends Activity implements AlertPositiveListener {
	
	int position = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.info);
		
		ActionBar ab = getActionBar();
		ab.setTitle("Android L NavBar");
		ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1f5161")));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    // Inflate the menu items for use in the action bar
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.act, menu);
	    return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle presses on the action bar items
		switch (item.getItemId()) {
			case R.id.about:{
				AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
				final TextView message = new TextView(this);
				message.setMovementMethod(LinkMovementMethod.getInstance());
				message.setText(R.string.xda);
				message.setGravity(Gravity.CENTER);

				dlgAlert.setView(message);
				dlgAlert.setTitle("About");
				dlgAlert.setIcon(R.drawable.infoimg);
				dlgAlert.setPositiveButton("OK",
				new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int which) {
				//dismiss the dialog
				}
				});
				dlgAlert.setCancelable(true);
				dlgAlert.create().show();
				
				return true;}
			
			case R.id.lsettings:{
				
				/** Getting the fragment manager */
                FragmentManager manager = getFragmentManager();
 
                /** Instantiating the DialogFragment class */
                AlertDialogRadio alert = new AlertDialogRadio();
 
                /** Creating a bundle object to store the selected item's index */
                Bundle b  = new Bundle();
 
                /** Storing the selected item's index in the bundle object */
                b.putInt("position", position);
 
                /** Setting the bundle object to the dialog fragment object */
                alert.setArguments(b);
 
                /** Creating the dialog fragment object, which will in turn open the alert dialog window */
                alert.show(manager, "alert_dialog_radio");
				
				return true;}
			default:
				return super.onOptionsItemSelected(item);
	}
}

	@Override
	public void onPositiveClick(int nposition) {
		this.position = nposition;
		Toast.makeText(getBaseContext(), "Reboot to see changes" , Toast.LENGTH_SHORT).show(); 
		
		SharedPreferences prefs = this.getSharedPreferences("myPrefsKey",Context.MODE_PRIVATE);
		Editor editor = prefs.edit();
		
		editor.putInt("style", this.position);
		editor.commit();
	}
}
