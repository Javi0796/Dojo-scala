import scala.collection.mutable
object ejercicio {
    def main(args: Array[String]): Unit = {  
        val numeros = List(4, 8, 15, 16, 23, 42);
        val dobles = numeros.map{x => 2*x}
        println(dobles)
    }
}