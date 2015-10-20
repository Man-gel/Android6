package com.example.contactos;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MiAdapter extends ArrayAdapter<String> {
	private Activity contexto;
	private Integer[] idsImagenes;
	private String[] datos;

	public MiAdapter(Activity context, Integer[] imagenes, String[] objects) {
		super(context, R.layout.row_list, objects);
		contexto = context;
		idsImagenes = imagenes;
		datos = objects;
	}
	
	@SuppressLint({ "InflateParams", "ViewHolder" })
	@Override
	public View getView(int position, View view, ViewGroup parent)
	{
		LayoutInflater inflater = contexto.getLayoutInflater();
		View row = inflater.inflate(R.layout.row_list, null,true);
		TextView txtTitle = (TextView) row.findViewById(R.id.txt);
		ImageView imageView = (ImageView) row.findViewById(R.id.img);
		txtTitle.setText(datos[position]);
		imageView.setImageResource(idsImagenes[position]);
		return row;		
	}
}
