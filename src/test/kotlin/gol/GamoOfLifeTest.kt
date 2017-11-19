package gol

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

val emptyWorld = World()
val block = World(Pos(1, 1), Pos(1, 2), Pos(2, 1), Pos(2, 2))

class GamoOfLifeTest {

    @Test
    @DisplayName("empty world should stay empty")
    fun emptyWorld() {
        assertThat(emptyWorld.tick()).isEqualTo(emptyWorld)
    }

    @Test
    @DisplayName("block should stay block")
    fun block() {
        assertThat(block.tick()).isEqualTo(block)
    }

}