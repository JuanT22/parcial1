def transformarCalificaciones(calificaciones: List[Double], politica: Double => Double): List[Double] = {
  calificaciones.map(politica)
}
val redondear: Double => Double = nota => math.round(nota).toDouble

val bonificacion: Double => Double = nota => nota + 1

val reducirAltas: Double => Double = nota =>
  if (nota > 9) nota - 0.5 else nota

val notas = List(7.4, 8.9, 9.5, 6.2)

val notasRedondeadas = transformarCalificaciones(notas, redondear)
val notasBonificadas = transformarCalificaciones(notas, bonificacion)
val notasAltasReducidas = transformarCalificaciones(notas, reducirAltas)