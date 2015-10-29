package com.example.contactos;

import java.util.ArrayList;

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
		ArrayList<Person> lista = new ArrayList<Person>();
		lista.add( new Person(R.drawable.einstein ,"Albert Einstein","778 2359776") );
		lista.add( new Person(R.drawable.hawking,"Stephen Hawking", "651 5763678") );
		lista.add( new Person(R.drawable.irons ,"Andy Irons", "555 5454267") );
		lista.add( new Person(R.drawable.kobain ,"Kurt Kobain","212 6545746") );
		lista.add( new Person(R.drawable.neruda ,"Pablo Neruda","988 7664327") );
		lista.add( new Person(R.drawable.stallman ,"Richard Stallman","877 6534522") );
		lista.add( new Person(R.drawable.tesla ,"Nikola Tesla","33 12645784") );
		lista.add( new Person(R.drawable.torvalds ,"Linus Torvalds","561 7665430") );		
		lista.trimToSize();
		MiAdapter adapter = new MiAdapter(MainActivity.this,lista);
		ListView list = (ListView)findViewById(R.id.lv_personajes);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener()
		{
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
            	Intent intent = new Intent(MainActivity.this, Contacto.class);
            	intent.putExtra("id",String.valueOf(position));
				startActivity(intent);
            }
        });
	}
}
