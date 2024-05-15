//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main (args: Array<String>){
    val footballTeam = Team<Player>(
        "Arsenal",
        mutableListOf<FootballPlayer>(FootballPlayer("Saka"), (FootballPlayer("Ordegard"), (FootballPlayer("Havertz"))))
    val gamesTeam = Team<CounterStrikePlayer>(
        "man u",
        mutableListOf<GamesPlayer>(GamesPlayer("garnacho")),GamesPlayer("martial")

    )
}
class Team<T: Player>(val name: String, val players: MutableList<out T>) {
    fun addPlayer(player: T){
        if(players.contains(player)){
            println("Player: ${player.name} is already in the team ${this.name}")
        } else {
            players.add(player)
            println("Player: ${player.name} was added to the team ${this.name}")
        }
    }

}

open class Player ( val name: String)

class FootballPlayer(name: String): Player(name)
class BaseballPlayer(name: String): Player(name)
open class GamesPlayer(name: String): Player(name)
class CounterStrikePlayer(name: String): GamesPlayer(name)


