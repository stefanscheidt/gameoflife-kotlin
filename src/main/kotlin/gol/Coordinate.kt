package gol

fun pos(x: Int, y: Int) = Coordinate(x, y)

data class Coordinate(val x: Int, val y: Int) {
    override fun toString() = "($x, $y)"
}
