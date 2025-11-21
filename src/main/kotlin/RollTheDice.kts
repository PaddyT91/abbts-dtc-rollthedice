import kotlin.random.Random

/**
 * Simuliert ein einfaches Würfelspiel zwischen dem
 * Computer und einem Spieler
 *
 * Autor: Andreas Wassmer
 * Version: 20241129
 */

fun main() {

    val aDie = Random

    val playerScore = aDie.nextInt(1,7)
    val computerScore = aDie.nextInt(1,7)
    // Todo: Den Fehler im Programm finden und beheben
    // Todo: Den Spieler nach dem Namen fragen
    // Todo: Solange spielen bis Spieler abbricht
    // Todo: Ausgeben, wer mehr Runden gewonnen hat
    println(" Spielername hinzufügen: ")
    var spielerName:String = readln()


    println("Du würfelst: $playerScore  --  Computer würfelt: $computerScore")
    when {
        playerScore > computerScore -> println("Du gewinnst")
        playerScore < computerScore -> println("Der Computer gewinnt")
        else -> println("Unentschieden")
    }
}

main()