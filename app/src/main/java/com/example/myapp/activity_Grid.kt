package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.ListView
import android.widget.Toast

class activity_Grid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)



        var datoss = ArrayList<DatosGrid>()
        datoss.add(DatosGrid("Text1", R.drawable.cargando2))
        datoss.add(DatosGrid("Text2", R.drawable.cargando2))
        datoss.add(DatosGrid("Text3", R.drawable.cargando2))
        datoss.add(DatosGrid("Text4", R.drawable.cargando2))

        var grid: GridView = findViewById(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        val adaptador = AdaptadorCustomGrid(this, datoss)
        grid.adapter =adaptador

        grid.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, datoss.get(position).nombre, Toast.LENGTH_LONG).show()
        }
    }
}

