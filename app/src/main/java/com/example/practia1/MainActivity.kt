package com.example.practia1

/*
data class Alumno(
    val nombre: String,
    val cuenta: String,
    val imagen: Int, // Esto será un recurso drawable
    val correo: String
)
*/


/*
class AlumnoAdapter(private val alumnos: List<Alumno>) : RecyclerView.Adapter<AlumnoAdapter.AlumnoViewHolder>() {

    inner class AlumnoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val tvNombre: TextView = itemView.findViewById(R.id.tvNombre)
        val tvCuenta: TextView = itemView.findViewById(R.id.tvCuenta)
        val tvCorreo: TextView = itemView.findViewById(R.id.tvCorreo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_alumno, parent, false)
        return AlumnoViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlumnoViewHolder, position: Int) {
        val alumno = alumnos[position]
        holder.imageView.setImageResource(alumno.imagen)
        holder.tvNombre.text = alumno.nombre
        holder.tvCuenta.text = alumno.cuenta
        holder.tvCorreo.text = alumno.correo
    }

    override fun getItemCount() = alumnos.size
}
*/

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
            // Aquí puedes agregar un nuevo alumno a la lista y notificar al adaptador
            // Por ejemplo:
            alumnos.add(Alumno("Juan", "123456", R.drawable.ic_launcher_foreground, "juan@example.com"))
            adapter.notifyDataSetChanged()
            alumnos.add(Alumno("Pedro", "654321", R.drawable.ic_launcher_foreground, "pedro@example.com"))
            adapter.notifyDataSetChanged()
            alumnos.add(Alumno("Maria", "987654", R.drawable.ic_launcher_foreground, "maria@example.com"))
            adapter.notifyDataSetChanged()
        }
    }
}