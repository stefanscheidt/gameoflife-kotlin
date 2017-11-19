package gol

data class World(private val livingCells: Set<Pos> = emptySet()) {

    constructor(vararg livingCells: Pos): this(setOf(*livingCells))

    internal val ruleSet: RuleSet = DefaultRuleSet()

    fun tick() = World(candidates()
            .filter { ruleSet.willBeAlive(isAliveAt(it), livingNeighboursCountAt(it)) }
            .toSet())

    internal fun livingNeighboursCountAt(pos: Pos) = pos
            .neighbours()
            .filter { isAliveAt(it) }
            .count()

    internal fun candidates() = livingCells
            .map { it.neighbours().plus(it) }
            .flatMap { it }

    private fun isAliveAt(it: Pos) = livingCells.contains(it)

    override fun toString() = livingCells.toString()

}