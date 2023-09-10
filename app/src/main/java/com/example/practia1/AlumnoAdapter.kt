package com.example.practia1

/*
class AlumnoAdapter {
}
*/
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



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

