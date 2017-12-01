package gol

fun world(vararg livingCellCoordinates: Coordinate) = World(setOf(*livingCellCoordinates))

fun willLive(isAlive: Boolean, livingNeighboursCount: Int) =
        when (isAlive) {
            true -> setOf(2, 3).contains(livingNeighboursCount)
            false -> setOf(3).contains(livingNeighboursCount)
        }

data class World(private val livingCellCoordinates: Set<Coordinate> = emptySet<Coordinate>()) {

    fun isEmpty() = livingCellCoordinates.isEmpty()

    fun candidates(): Set<Coordinate> = livingCellCoordinates
            .flatMap { it.neighbours().plus(it) }
            .toSet()

    fun livingNeighboursCount(c: Coordinate) = c.neighbours()
            .intersect(livingCellCoordinates)
            .size

    fun tick() = World(candidates()
            .filter { willLive(livingCellCoordinates.contains(it), livingNeighboursCount(it)) }
            .toSet())

}