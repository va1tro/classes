data class Point(val x: Double, val y: Double)

class Triangle(val a: Point, val b: Point, val c: Point) {

    private fun sign(p1: Point, p2: Point, p3: Point): Double {
        return (p1.x - p3.x) * (p2.y - p3.y) - (p2.x - p3.x) * (p1.y - p3.y)
    }

    fun contains(point: Point): Boolean {
        val d1 = sign(point, a, b)
        val d2 = sign(point, b, c)
        val d3 = sign(point, c, a)

        val hasNegative = (d1 < 0) || (d2 < 0) || (d3 < 0)
        val hasPositive = (d1 > 0) || (d2 > 0) || (d3 > 0)

        return !(hasNegative && hasPositive)
    }
}


fun сoordinate(prompt: String): Double {
    while (true) {
        try {
            print(prompt)
            return readLine()?.toDouble() ?: throw Exception("Некорректный ввод")
        } catch (e: Exception) {
            println("Ошибка! Введите числовое значение")
        }
    }
}

fun main() {
    println("Введите координаты вершин треугольника:")
    val ax = сoordinate("Точка A, x: ")
    val ay = сoordinate("Точка A, y: ")
    val bx = сoordinate("Точка B, x: ")
    val by = сoordinate("Точка B, y: ")
    val cx = сoordinate("Точка C, x: ")
    val cy = сoordinate("Точка C, y: ")

    val triangle = Triangle(Point(ax, ay), Point(bx, by), Point(cx, cy))

    println("Введите координаты точки для проверки:")
    val px = сoordinate("Точка P, x: ")
    val py = сoordinate("Точка P, y: ")

    val point = Point(px, py)

    if (triangle.contains(point)) {
        println("Точка находится внутри треугольника")
    } else {
        println("Точка находится не в треугольника")
    }
}
