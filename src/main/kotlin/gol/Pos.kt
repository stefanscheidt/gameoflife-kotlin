package gol

data class Pos(val x: Int, val y: Int) {

    fun neighbours(): Set<Pos> {
        return IntRange(-1, 1)
                .map { dx ->
                    IntRange(-1, 1).map { dy -> Pos(x + dx, y + dy) }
                }
                .flatMap { it }
                .filter { it != this }
                .toSet()
    }

    override fun toString() = "($x, $y)"

}
