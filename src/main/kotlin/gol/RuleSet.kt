package gol

interface RuleSet {

    fun willBeAlive(alive: Boolean, livingNeighboursCount: Int): Boolean

}