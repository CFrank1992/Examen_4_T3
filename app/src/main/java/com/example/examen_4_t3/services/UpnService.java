package com.example.examen_4_t3.services;

import com.example.examen_4_t3.entities.Entrenador;
import com.example.examen_4_t3.entities.Pokemon;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UpnService {

    @GET("entrenador/N00109334-2")
    Call<Entrenador> getEntrenador();

    @POST("entrenador/N00109334-2")
    Call<Entrenador> createEntrenador(@Body Entrenador entrenador);

    @GET("entrenador/N00109334-2/pokemones")
    Call<List<Pokemon>> getListCapturedPokemon();

    @POST("pokemons/N00109334-2/crear")
    Call<Pokemon> createPokemon(@Body Pokemon pokemon);

    @GET("pokemons/N00109334-2")
    Call<List<Pokemon>> getListPokemon();

    @GET("pokemones/1")
    Call<Pokemon> getListDetailedPokemon();

    @POST("pokemons/N00109334-2/atrapar/1")
    Call<Pokemon> capturePokemon(@Body Pokemon pokemon);
}
