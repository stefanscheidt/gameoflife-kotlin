package gol

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class WorldTest {

    @Test
    fun candidates() {
        val world = world(c(1, 1), c(2, 2))
        assertThat(world.candidates())
                .containsExactlyInAnyOrder(
                        // @formatter:off
                        c(0, 0), c(1, 0), c(2, 0),
                        c(0, 1), c(1, 1), c(2, 1), c(3, 1),
                        c(0, 2), c(1, 2), c(2, 2), c(3, 2),
                                 c(1, 3), c(2, 3), c(3, 3)
                        // @formatter:on
                )
    }

    @Test
    fun livingNeighboursCount() {
        val world = world(c(1, 1), c(2, 2))
        assertThat(world.livingNeighboursCount(c(1,1)))
                .isEqualTo(1)
    }

    @Test
    fun rules() {
        assertThat(willLive(true, 0)).isEqualTo(false)
        assertThat(willLive(true, 1)).isEqualTo(false)
        assertThat(willLive(true, 2)).isEqualTo(true)
        assertThat(willLive(true, 3)).isEqualTo(true)
        assertThat(willLive(true, 4)).isEqualTo(false)
        assertThat(willLive(true, 5)).isEqualTo(false)
        assertThat(willLive(true, 6)).isEqualTo(false)
        assertThat(willLive(true, 7)).isEqualTo(false)
        assertThat(willLive(true, 8)).isEqualTo(false)

        assertThat(willLive(false, 0)).isEqualTo(false)
        assertThat(willLive(false, 1)).isEqualTo(false)
        assertThat(willLive(false, 2)).isEqualTo(false)
        assertThat(willLive(false, 3)).isEqualTo(true)
        assertThat(willLive(false, 4)).isEqualTo(false)
        assertThat(willLive(false, 5)).isEqualTo(false)
        assertThat(willLive(false, 6)).isEqualTo(false)
        assertThat(willLive(false, 7)).isEqualTo(false)
        assertThat(willLive(false, 8)).isEqualTo(false)
    }

}