package gol

val emptyWorld = World()
val block = World(listOf(pos(1, 1), pos(1, 2), pos(2, 1), pos(2, 2)))

data class World(val livingCells: List<Coordinate> = emptyList()) {
    fun tick() = World(livingCells)

    override fun toString() = livingCells.toString()
}