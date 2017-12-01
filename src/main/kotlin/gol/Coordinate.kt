package gol

fun c(x: Int, y: Int) = Coordinate(x, y)

data class Coordinate(private val x: Int, private val y: Int) {

    fun neighbours(): Set<Coordinate> = IntRange(-1, 1)
            .flatMap { dx ->
                IntRange(-1, 1).map { dy -> c(x + dx, y + dy) }
            }
            .filter { it != this }
            .toSet()

    override fun toString() = "($x, $y)"
}
