package com.ash.androidlnavigationbar;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class Info extends Activity {
	
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
				dlgAlert.setIcon(R.drawable.ic_action_about);
				dlgAlert.setPositiveButton("OK",
				new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int which) {
				//dismiss the dialog
				}
				});
				dlgAlert.setCancelable(true);
				dlgAlert.create().show();
				
				return true;}
			default:
				return super.onOptionsItemSelected(item);
	}
}
}
