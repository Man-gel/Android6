package com.example.contactos;

import java.util.ArrayList;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

public class MiAdapter extends ArrayAdapter<Person> implements Filterable
{
	
	private static class ViewHolder
	{
		private TextView itmView;
		private ImageView imgView;
	}

	public MiAdapter(Activity context, ArrayList<Person> objects) 
	{
		super(context, 0,objects);
	}	

	@Override
	public View getView(int position, View view, ViewGroup parent)
	{
		ViewHolder viewHolder;
		Person registro = (Person)getItem(position);
		if(view == null)
		{
			view = LayoutInflater.from(getContext()).inflate(R.layout.row_list, parent,false);
			viewHolder = new ViewHolder();
			viewHolder.itmView = (TextView)view.findViewById(R.id.txtV);
			viewHolder.imgView = (ImageView)view.findViewById(R.id.imgV);
			view.setTag(viewHolder);
		}
		else
		{
			viewHolder = (ViewHolder)view.getTag();
		}
		if(registro != null)
		{
			viewHolder.itmView.setText(registro.txtView);
			System.out.format("**MIADAPTER L50: txtV: %s imgV: %d\n",registro.txtView,registro.imgView);
			viewHolder.imgView.setImageResource(registro.imgView);
		}
		return view;		
	}
}