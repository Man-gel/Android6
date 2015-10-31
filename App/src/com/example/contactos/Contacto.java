package com.example.contactos;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Contacto extends Activity 
{
	private String nombre;
	private String numero;
	private Integer idImg;
	private TextView tvNombre;
	private TextView tvNumero;
	private ImageView ivImagen;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contacto);
		
		tvNombre = (TextView)findViewById(R.id.tv_nombre);
		tvNumero = (TextView)findViewById(R.id.tv_phone);
		ivImagen = (ImageView)findViewById(R.id.iv_detalleImg);
		obtenerYajustar();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contacto, menu);
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
	
	private void obtenerYajustar()
	{
		Bundle recibido = getIntent().getExtras();
		nombre = recibido.getString("nombre");
		numero = recibido.getString("phone");
		idImg = recibido.getInt("idImagen");
		tvNombre.setText(nombre);
		tvNumero.setText(numero);
		ivImagen.setImageResource(idImg);
	}
	
}
