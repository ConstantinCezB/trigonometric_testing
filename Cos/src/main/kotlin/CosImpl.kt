import kotlin.math.PI
import kotlin.math.absoluteValue
import kotlin.math.pow

class CosImpl : Cos {

    companion object {
        const val PRECISION: Int = 150
    }

    /**
     * Returns the Taylor series for cos.
     * found on: https://people.math.sc.edu/girardi/m142/handouts/10sTaylorPolySeries.pdf
     */
    override fun calculate(radian: Double): Double = (0..PRECISION).map {
        (-1.0).pow(it) * (radian.pow(2 * it) / factorial(2 * it))
    }.sum()

    /**
     * Returns the Taylor series for COS in degree
     */
    override fun calculateDegree(degree: Double): Double = calculate(degree * (PI / 180)) * (180 / PI)

    /**
     * Returns the factorial of the int.
     */
    private fun factorial(num: Int): Double {
        var result = 1.0
        for (i in 2..num) result *= i
        return result
    }
}