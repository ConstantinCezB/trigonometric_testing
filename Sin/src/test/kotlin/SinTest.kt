import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.math.PI
import kotlin.math.sin

class SinTest {
    private val sinCalculator: Sin = SinImpl()

    /**
     * Testing the axis values of the unit circle
     */
    @ParameterizedTest
    @ValueSource(
        doubles = [
            -PI / 2,
            0.0,
            PI / 2,
            PI,
            3 * PI / 2,
            2 * PI,
        ]
    )
    fun axis_radius(angle: Double) {
        assertEquals(
            sin(angle),
            sinCalculator.calculate(angle),
            0.00000001,
        )
    }

    @ParameterizedTest
    @ValueSource(
        doubles = [
            -90.0,
            0.0,
            90.0,
            180.0,
            270.0,
            360.0,
        ]
    )
    fun axis_degree(angle: Double) {
        assertEquals(
            sin(angle * (PI / 180)) * (180 / PI),
            sinCalculator.calculateDegree(angle),
            0.00000001,
        )
    }

    /**
     * Testing the quadrant 1 values of the unit circle
     */
    @ParameterizedTest
    @ValueSource(
        doubles = [
            PI / 6,
            PI / 4,
            PI / 3,
        ]
    )
    fun quadrant_1_radius(angle: Double) {
        assertEquals(
            sin(angle),
            sinCalculator.calculate(angle),
            0.00000001,
        )
    }

    @ParameterizedTest
    @ValueSource(
        doubles = [
            30.0,
            45.0,
            60.0,
        ]
    )
    fun quadrant_1_degree(angle: Double) {
        assertEquals(
            sin(angle * (PI / 180)) * (180 / PI),
            sinCalculator.calculateDegree(angle),
            0.00000001,
        )
    }

    /**
     * Testing the quadrant 2 values of the unit circle
     */
    @ParameterizedTest
    @ValueSource(
        doubles = [
            2 * PI / 3,
            3 * PI / 4,
            5 * PI / 6,
        ]
    )
    fun quadrant_2_radius(angle: Double) {
        assertEquals(
            sin(angle),
            sinCalculator.calculate(angle),
            0.00000001,
        )
    }

    @ParameterizedTest
    @ValueSource(
        doubles = [
            120.0,
            135.0,
            150.0,
        ]
    )
    fun quadrant_2_degree(angle: Double) {
        assertEquals(
            sin(angle * (PI / 180)) * (180 / PI),
            sinCalculator.calculateDegree(angle),
            0.00000001,
        )
    }

    /**
     * Testing the quadrant 3 values of the unit circle
     */
    @ParameterizedTest
    @ValueSource(
        doubles = [
            7 * PI / 6,
            5 * PI / 4,
            4 * PI / 3,
        ]
    )
    fun quadrant_3_radius(angle: Double) {
        assertEquals(
            sin(angle),
            sinCalculator.calculate(angle),
            0.00000001,
        )
    }

    @ParameterizedTest
    @ValueSource(
        doubles = [
            210.0,
            225.0,
            240.0,
        ]
    )
    fun quadrant_3_degree(angle: Double) {
        assertEquals(
            sin(angle * (PI / 180)) * (180 / PI) ,
            sinCalculator.calculateDegree(angle),
            0.00000001,
        )
    }

    /**
     * Testing the quadrant 4 values of the unit circle
     */
    @ParameterizedTest
    @ValueSource(
        doubles = [
            5 * PI / 3,
            7 * PI / 4,
            11 * PI / 6,
        ]
    )
    fun quadrant_4_radius(angle: Double) {
        assertEquals(
            sin(angle),
            sinCalculator.calculate(angle),
            0.00000001,
        )
    }

    @ParameterizedTest
    @ValueSource(
        doubles = [
            300.0,
            315.0,
            330.0,
        ]
    )
    fun quadrant_4_degree(angle: Double) {
        assertEquals(
            sin(angle * (PI / 180)) * (180 / PI),
            sinCalculator.calculateDegree(angle),
            0.00000001,
        )
    }

}