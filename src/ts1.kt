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
        println("Точка находится не в треугольнике")
    }
}
