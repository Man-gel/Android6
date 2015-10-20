package com.example.contactos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		crearInfo();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void crearInfo()
	{
		final String[] characters = 
		{
				"Albert Einstein",
				"Stephen Hawking",
				"Andy Irons",
				"Kurt Kobain",
				"Pablo Neruda",
				"Richard Stallman",
				"Nikola Tesla",
				"Linus Torvalds"				
		};		
		final Integer[] imageId = 
		{
				R.drawable.einstein,
				R.drawable.hawking,
				R.drawable.irons,
				R.drawable.kobain,
				R.drawable.neruda,
				R.drawable.stallman,
				R.drawable.tesla,
				R.drawable.torvalds					
		};
		MiAdapter adapter = new MiAdapter(MainActivity.this,imageId,characters);
		ListView list = (ListView)findViewById(R.id.lv_personajes);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener()
		{
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
            	Intent intent = new Intent(MainActivity.this, Contacto.class);
            	intent.putExtra("id",String.valueOf(position+1));
				startActivity(intent);
            }
        });
	}
}
