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