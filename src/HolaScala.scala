object HolaScala {
    def main(args: Array[String]): Unit = {
        println("Hola mundoski!")
        println(factorial(4))
        val persona = new Persona("Pepito", Some("Arnulfo"), "Pérez")
persona.nombreCompleto //Retorna "Pepito Arnulfo Pérez"

      val otraPersona = new Persona("Juan", None, "Gutiérrez")
      otraPersona.nombreCompleto //Retorna "Pepito Arnulfo Pérez"

     print(persona.nombreCompleto)
     print(otraPersona.nombreCompleto)
     }

      def factorial(i:Int):Int = if (i==0) 1 else i*factorial(i-1)


}