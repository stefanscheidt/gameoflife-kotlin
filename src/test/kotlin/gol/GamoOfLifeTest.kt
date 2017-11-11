package gol

import assertk.assert
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


class GamoOfLifeTest {

    @Test
    @DisplayName("empty world should stay empty")
    fun emptyWorld() {
        assert(emptyWorld.tick()).isEqualTo(emptyWorld)
    }

    @Test
    @DisplayName("block should stay block")
    fun block() {
        assert(block.tick()).isEqualTo(block)
    }

}