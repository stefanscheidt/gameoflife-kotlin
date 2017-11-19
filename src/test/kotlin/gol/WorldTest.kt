package gol

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WorldTest {

    @Test
    fun candidates() {
        assertThat(World(Pos(1, 1)).candidates())
                .containsExactlyInAnyOrder(
                        Pos(0,0), Pos(0,1), Pos(0,2),
                        Pos(1,0), Pos(1,1), Pos(1,2),
                        Pos(2,0), Pos(2,1), Pos(2,2))
    }

}