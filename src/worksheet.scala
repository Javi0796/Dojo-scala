object worksheet{
  def main(args: Array[String]): Unit = {
    val n = 5
    if (n == 5) {
      print("Sí, n vale 5")
    } else {
      println("Tiene otro valor")
    }  
  
    

   println(n match {
      case 1 => "Uno"
      case 2 => "Dos"
      case 3 => "Tres"
      case 4 => "Cuatro"
      case 5 => "Cinco"
      case 6 => "Seis"
      //El case _ funciona como un default
      case _ => "Ninguno"
   })

  }
  
}
