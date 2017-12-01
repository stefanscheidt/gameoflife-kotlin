package gol

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CoordinateTest {

    @Test
    fun neighbours() {
        assertThat(c(1, 1).neighbours())
                .containsExactlyInAnyOrder(
                        // @formatter:off
                        c(0, 0), c(1, 0), c(2, 0),
                        c(0, 1),          c(2, 1),
                        c(0, 2), c(1, 2), c(2, 2))
                        // @formatter:on
    }
}