package gol

private val fertileNeighbourCount = hashMapOf(
        true to listOf(2, 3),
        false to listOf(3))

class DefaultRuleSet : RuleSet {

    override fun willBeAlive(alive: Boolean, livingNeighboursCount: Int) =
            fertileNeighbourCount[alive]?.contains(livingNeighboursCount) ?: false

}