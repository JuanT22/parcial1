def myMethod(datos: List[Double]): Double = {
  val promedio = datos.sum / datos.size

  val sumaCuadrados = datos.map(d => math.pow(d - promedio, 2)).sum

  math.sqrt(sumaCuadrados / datos.size)
}