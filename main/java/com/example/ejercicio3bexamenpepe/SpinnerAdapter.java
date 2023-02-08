package com.example.ejercicio3bexamenpepe;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class SpinnerAdapter  extends ArrayAdapter<Team> {

    LayoutInflater layoutInflater;
    public SpinnerAdapter(@NonNull Context context , int resource , @NonNull List<Team> objects){
        super(context , resource , objects);
        layoutInflater = LayoutInflater.from(context);
    }

    public View getView ( int position , @Nullable View convertView , @NonNull ViewGroup parent){
        View rowView = layoutInflater.inflate(R.layout.elemento,null , true);
        Team team = getItem(position);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.teamPhoto);
        imageView.setImageResource(team.getPhoto());

        TextView city = (TextView) rowView.findViewById(R.id.teamCity);
        city.setText(team.getCity());

        TextView name = (TextView) rowView.findViewById(R.id.teamName);
        name.setText(team.getName());

        TextView country = (TextView) rowView.findViewById(R.id.teamCountry);
        country.setText(team.getCountry());

        TextView year = (TextView) rowView.findViewById(R.id.teamYear);
        year.setText(team.getYear());

        return rowView;
    }

    @Override
    public View getDropDownView( int position , @Nullable View convertView , @NonNull ViewGroup parent){

        if(convertView == null)
            convertView = layoutInflater.inflate(R.layout.elemento, null, true);

        Team team = getItem(position);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.teamPhoto);
        imageView.setImageResource(team.getPhoto());

        TextView city = (TextView) convertView.findViewById(R.id.teamCity);
        city.setText(team.getCity());

        TextView name = (TextView) convertView.findViewById(R.id.teamName);
        name.setText(team.getName());

        TextView country = (TextView) convertView.findViewById(R.id.teamCountry);
        country.setText(team.getCountry());

        TextView year = (TextView) convertView.findViewById(R.id.teamYear);
        year.setText(team.getYear());

        return convertView;
    }


}
