sealed class Usuario {

    class Visitante(val nombre:String, val id:String, val carrera:String) : Usuario()

    class Estudiante(val nombre:String, val id:String, val carrera:String) : Usuario()

    class Profesor(val nombre:String, val id:String, val carrera:String) : Usuario()

    fun tomarPrestado() :String{
        if (Usuario == Usuario.Profesor){
            return "Puedes tomarlo prestado por un tiempo alargado"
        }
    }
}