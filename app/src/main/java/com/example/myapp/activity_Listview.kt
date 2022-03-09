package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class activity_Listview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_listview)
        var datos: ArrayList<DatosListView> = ArrayList()
        datos.add(DatosListView("Text1", R.drawable.cargando1))
        datos.add(DatosListView("Text2", R.drawable.cargando1))
        datos.add(DatosListView("Text3", R.drawable.cargando1))
        datos.add(DatosListView("Text4", R.drawable.cargando1))
        datos.add(DatosListView("Text5", R.drawable.cargando1))
        datos.add(DatosListView("Text6", R.drawable.cargando1))

        val lista = findViewById<ListView>(R.id.lista)

        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        val adaptador = AdaptadorCustomList(this, datos)
        lista.isClickable = true
        lista.adapter = adaptador

        lista.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, datos.get(position).nombre, Toast.LENGTH_LONG).show()


            var intent = Intent(this, activity_Grid::class.java)
            startActivity(intent)


        }
    }
}



