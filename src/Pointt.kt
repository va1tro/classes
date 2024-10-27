import kotlin.math.sqrt

data class Pointt(val x: Double, val y: Double) {

    fun distanceTo(other: Pointt): Double {
        return sqrt((other.x - x).pow(2) + (other.y - y).pow(2))
    }

    private fun Double.pow(exponent: Int): Double = this.let { it * it }
}
