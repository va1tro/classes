import kotlin.math.sqrt

data class Pointtt(val x: Double, val y: Double) {

    fun distanceTo(other: Pointtt): Double {
        return sqrt((other.x - x).pow(2) + (other.y - y).pow(2))
    }

    private fun Double.pow(exponent: Int): Double = this * this
}

