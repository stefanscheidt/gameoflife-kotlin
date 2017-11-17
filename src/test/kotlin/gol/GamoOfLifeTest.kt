package gol

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


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