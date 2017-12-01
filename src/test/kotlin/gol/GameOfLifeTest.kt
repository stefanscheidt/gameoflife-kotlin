package gol

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

val block = world(c(0,0), c(1,0), c(0,1), c(1,1))

val blinkerH = world(c(0,1), c(1,1), c(2,1))
val blinkerV = world(c(1,0), c(1,1), c(1,2))

class GameOfLifeTest {

    @Test
    fun emptyWorld() {
        assertThat(World().tick().isEmpty())
                .isTrue()
    }

    @Test
    fun evolveBlock() {
        assertThat(block.tick())
                .isEqualTo(block)
    }

    @Test
    fun evolveBlinker() {
        assertThat(blinkerH.tick())
                .isEqualTo(blinkerV)
    }
}