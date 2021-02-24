class Trigonometry {
    companion object{
        private val cos: Cos = CosImpl()
        private val sin: Sin = SinImpl()
        private val tan: Tan = TanImpl()

        /**
         * methods put together from the module
         */
        fun cos(radius: Double) = cos.calculate(radius)
        fun cosDegree(degree: Double) = cos.calculateDegree(degree)

        fun sin(radius: Double) = sin.calculate(radius)
        fun sinDegree(degree: Double) = sin.calculateDegree(degree)

        fun tan(radius: Double) = tan.calculate(radius)
        fun tanDegree(degree: Double) = tan.calculateDegree(degree)

    }
}