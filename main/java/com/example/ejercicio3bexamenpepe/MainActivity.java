package com.example.ejercicio3bexamenpepe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //preparamos objetos a cargar
        ArrayList<Team> elementos = crearTeam();
        SpinnerAdapter adaptador = new com.example.ejercicio3bexamenpepe.SpinnerAdapter(this,0,elementos);

        Spinner sp = findViewById(R.id.spinner);

        //creamos un adaptador, indicando el contexto, tiramos de un elemento prefabricado del sistema y cargamos de nuestro array de elementos
        sp.setAdapter(adaptador);
        sp.setSelection(0,false);

        //preparando un listener
       sp.setOnItemSelectedListener(this);
    }

    public ArrayList<Team> crearTeam(){
        ArrayList<Team> clubs = new ArrayList<>();
        Team club1 = new Team(R.drawable.barcelona , "Barcelona Handball", "Barcelona", "España", "1942");
        clubs.add(club1);
        Team club2 = new Team(R.drawable.montpellier , "Montpellier Handball", "Montpellier", "Francia", "1982");
        clubs.add(club2);
        Team club3 = new Team(R.drawable.telekom , "Telekom Veszprém", "Veszprem", "Hungria", "1977");
        clubs.add(club3);
        Team club4 = new Team(R.drawable.thw , "THW Kiel", "Kiel", "Alemania", "1904");
        clubs.add(club4);
        Team club5 = new Team(R.drawable.vivekielce, "KS Vive Handball", "Kielce", "Polonia", "1965");
        clubs.add(club5);
        return clubs;
    }



    //@Override
    public void onItemSelected(AdapterView<?> adapterView, View view , int i , long l){
        //su codigo aquí
        ImageView imageView = findViewById(R.id.logo);
        TextView textView = findViewById(R.id.team);
        //pillamos el team en la posicion 1
        Team club = (Team) adapterView.getItemAtPosition(i);

        //con los getters aporpiaos seteamos el nombre y el logo
        textView.setText(club.getName().toString());
        imageView.setImageResource(club.getPhoto());
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        TextView textView = findViewById(R.id.team);
        textView.setText("No Seleccionado");
    }


}