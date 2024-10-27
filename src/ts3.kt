
fun main() {
    print("Введите количество точек (больше 2): ")
    val n = readLine()?.toIntOrNull() ?: 0
    if (n <= 2) {
        println("Ошибка: количество точек должно быть больше двух")
        return
    }

    val points = mutableListOf<Pointtt>()
    for (i in 1..n) {
        print("Введите координаты точки $i (через пробел): ")
        val (x, y) = readLine()?.split(" ")?.map { it.toDoubleOrNull() ?: 0.0 } ?: listOf(0.0, 0.0)
        points.add(Pointtt(x, y))
    }

    var minDistance = Double.MAX_VALUE
    var maxDistance = Double.MIN_VALUE

    for (i in 0 until points.size - 1) {
        for (j in i + 1 until points.size) {
            val distance = points[i].distanceTo(points[j])
            if (distance < minDistance) minDistance = distance
            if (distance > maxDistance) maxDistance = distance
        }
    }

    println("Минимальное расстояние между точками: $minDistance")
    println("Максимальное расстояние между точками: $maxDistance")
}
