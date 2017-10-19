package com.example.sebastian.webserviceturismo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.sebastian.webserviceturismo.datosApi.Datos;
import com.example.sebastian.webserviceturismo.models.Adaptador;
import com.example.sebastian.webserviceturismo.models.Turismo;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Retrofit retrofit;
    private RecyclerView view;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view=(RecyclerView)findViewById(R.id.Recicler);
        view.setLayoutManager(new LinearLayoutManager(this));

        retrofit=new Retrofit.Builder().baseUrl("https://www.datos.gov.co/resource/").addConverterFactory(GsonConverterFactory.create()).build();

        obtenerDatos();
    }

    public void obtenerDatos() {

        Datos service = retrofit.create(Datos.class);
        final Call<List<Turismo>> turismoCall = service.obtenerListaTurismo();

        turismoCall.enqueue(new Callback<List<Turismo>>() {
            @Override
            public void onResponse(Call<List<Turismo>> call, Response<List<Turismo>> response) {

                if (response.isSuccessful()) {
                    List turismos = response.body();
                    for (int i = 0; i < turismos.size(); i++) {
                        Turismo t = (Turismo) turismos.get(i);
                        adaptador = new Adaptador(turismos);
                        view.setAdapter(adaptador);
                    }
                } else {

                    Toast notificacion = Toast.makeText(MainActivity.this, "Error!!!!", Toast.LENGTH_LONG);
                    notificacion.show();
                    //Log.e(TAG,"OnResponse "+response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<List<Turismo>> call, Throwable t) {

                Toast notificacion = Toast.makeText(MainActivity.this, "Error!!!!", Toast.LENGTH_LONG);
                notificacion.show();
            }
        });
    }
}
