package com.example.sebastian.webserviceturismo.datosApi;

import com.example.sebastian.webserviceturismo.models.Turismo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sebastian on 19/10/17.
 */

public interface Datos {
    @GET("3v3e-azzg.json")
    Call<List<Turismo>> obtenerListaTurismo();
}
