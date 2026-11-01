package edu.iesam.moviekata.domain

import android.util.Log
import com.google.gson.Gson


data class Movie(val id: String, val title: String, val year: Int, val director: Director)
data class Director(val id: String, val name: String, val country: String)

fun runGson() {
    val pelicula1 = Movie(
        "1", "El amor de mi vida", 2026,
        Director("2", "Intissar Agoubi", "Tunisia")
    )
    //serializando un obj
    val gson = Gson()
    val json = gson.toJson(pelicula1)
    Log.d("Pelicula", json)
    //deserializar un obj

    val recuperarMovie = gson.fromJson(json, Movie::class.java)
    Log.d("Pelicula", recuperarMovie.toString())

}