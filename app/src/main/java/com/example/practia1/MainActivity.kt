package com.example.practia1



import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager


//import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val alumnos = mutableListOf<Alumno>()
    private lateinit var adapter: AlumnoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val btnAgregar: Button = findViewById(R.id.btnAgregar)

        adapter = AlumnoAdapter(alumnos)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        btnAgregar.setOnClickListener {
            // Agregar un nuevo alumno a la lista

            alumnos.add(Alumno("Juan", "123456", R.drawable.image, "juan@ejemplo.com"))
            adapter.notifyDataSetChanged()
            alumnos.add(Alumno("Pedro", "654321", R.drawable.cell, "pedro@ejemplo.com"))
            adapter.notifyDataSetChanged()
            alumnos.add(Alumno("Maria", "987654", R.drawable.a21, "maria@ejemplo.com"))
            adapter.notifyDataSetChanged()
            alumnos.add(Alumno("Jose", "456789", R.drawable.a17, "jose@ejemplo.com"))
        }
    }
}