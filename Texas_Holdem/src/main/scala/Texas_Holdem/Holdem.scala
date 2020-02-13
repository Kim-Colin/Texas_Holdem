package Texas_Holdem

object Holdem {
  var order = List("Player1", "Player2", "Player3", "Player4")
  def showGameArea : String = {
    val a = "                                               Game Area:\n" +
    "\n" +
    "                                                Player1\n" +
    "                                              ----   ----\n" +
    "                                             | #1 | | #2 |\n" +
    "                                             |    | |    |\n" +
    "                                              ----   ----\n" +
    "                                             Player1 Money: money\n" +
    "                                             Player1 Bet: bet\n" +
    "\n" +
    "                                             Community Cards:\n" +
    "                                     ----   ----   ----   ----   ----\n" +
    "                                    | #1 | | #2 | | #3 | | #4 | | #5 |\n" +
    "                                    |    | |    | |    | |    | |    |\n" +
    "                                     ----   ----   ----   ----   ----\n" +
    "                                               Pot: pot\n" +
    "             Player4                                                               Player2\n" +
    "           ----   ----                                                           ----   ----\n" +
    "          | #1 | | #2 |                                                         | #1 | | #2 |\n" +
    "          |    | |    |                                                         |    | |    |\n" +
    "           ----   ----                                                           ----   ----\n" +
    "\n" +
    "          Player4 Money: money                                                  Player2 Money: money\n" +
    "          Player4 Bet: bet                                                      Player3 Bet: bet\n" +
    "\n" +
    "\n" +
    "                                                Player3\n" +
    "                                              ----   ----\n" +
    "                                             | #1 | | #2 |\n" +
    "                                             |    | |    |\n" +
    "                                              ----   ----\n" +
    "\n" +
    "                                             Player4 Money: money\n" +
    "                                             Player4 Bet: bet\n" +
    "\n" +
    "\n" +
    "Note: This dealing assumes deck begins with a fresh/new deck of standard cards and Player1 is dealt first."
          a
  }

  def showPlayerOrder : String = {
    order.mkString(", ")
  }

  def advancePlayerOrder : String = {
    val first = order.head
    val second = order.tail
    order = second:+first
    order.mkString(", ")

  }
  def checkwinner{}
  def domove{}
  def doturn{}
  def dogame{}
  def initializegame{}
}
