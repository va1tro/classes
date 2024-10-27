fun main() {
    print("Введите координаты первой точки:\nX1: ")
    val x1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Y1: ")
    val y1 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Введите координаты второй точки:\nX2: ")
    val x2 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Y2: ")
    val y2 = readLine()?.toDoubleOrNull() ?: 0.0

    val point1 = Pointt(x1, y1)
    val point2 = Pointt(x2, y2)

    val distance = point1.distanceTo(point2)
    println("Расстояние между точками: $distance")
}
