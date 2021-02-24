import kotlin.math.*

class TanImpl : Tan {

    private val cos: Cos = CosImpl()
    private val sin: Sin = SinImpl()

    /**
     * Returns tan using sin and cos.
     */
    override fun calculate(radian: Double): Double = sin.calculate(radian) / cos.calculate(radian).let { if (it.absoluteValue < 1E-10) Double.NaN else it}

    /**
     * Returns tan using sin and cos in degree.
     */
    override fun calculateDegree(degree: Double): Double = calculate(degree * (PI / 180)) * (180 / PI)
}