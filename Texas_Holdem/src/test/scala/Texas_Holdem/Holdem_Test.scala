package Texas_Holdem

import org.scalatest.FunSpec
import org.scalatest.Matchers

class Holdem_Test extends FunSpec with Matchers {
  describe("The Texas_Holdem Simulation") {
    describe("has a menu") {

      //******* SHOW GAME AREA *******
      it("can show the game area, including the player hands, player stacks, bets, pot, and community cards in each player's hand") {

        val expectedResult =
    "                                               Game Area:\n" +
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

        Holdem.showGameArea should be(expectedResult)
      }

      //******* SHOW PLAYER ORDER *******
      it("can show the player order") {
        val expectedResult = "Player1, Player2, Player3, Player4"
        Holdem.showPlayerOrder should be(expectedResult)
      }

      //******* ADVANCE ORDER *******z
      it("can advance the player order") {
        val expectedResult_0_advances = "Player1, Player2, Player3, Player4"
        val expectedResult_1_advances = "Player2, Player3, Player4, Player1"
        val expectedResult_2_advances = "Player3, Player4, Player1, Player2"
        val expectedResult_4_advances = "Player1, Player2, Player3, Player4"

        Holdem.showPlayerOrder should be(expectedResult_0_advances)

        Holdem.advancePlayerOrder should be(expectedResult_1_advances)

        Holdem.advancePlayerOrder
        Holdem.showPlayerOrder should be(expectedResult_2_advances)

        Holdem.advancePlayerOrder   // 3 advances

        Holdem.advancePlayerOrder
        Holdem.showPlayerOrder should be(expectedResult_4_advances)
        Holdem.showPlayerOrder should be(expectedResult_0_advances)
      }

            //******* CHECK WINNER *******
      it("can check winner") {
        val expectedResult = "Player1 WINS!!!"
        Holdem.checkwinner should be(expectedResult)
      }

          //******* INITIALIZE GAME *******
      it("can initialize game") {
        val expectedResult =
    "                                               Game Area:\n" +
    "\n" +
    "                                                Player1\n" +
    "                                              ----   ----\n" +
    "                                             | As | | 5s |\n" +
    "                                             |    | |    |\n" +
    "                                              ----   ----\n" +
    "                                             Player1 Money: 990\n" +
    "                                             Player1 Bet: 0\n" +
    "\n" +
    "                                             Community Cards:\n" +
    "                                     ----   ----   ----   ----   ----\n" +
    "                                    | 9s | | Ts | | Js | | Qs | | Ks |\n" +
    "                                    |    | |    | |    | |    | |    |\n" +
    "                                     ----   ----   ----   ----   ----\n" +
    "                                               Pot: 40\n" +
    "             Player4                                                               Player2\n" +
    "           ----   ----                                                           ----   ----\n" +
    "          | 4s | | 8s |                                                         | 2s | | 6s |\n" +
    "          |    | |    |                                                         |    | |    |\n" +
    "           ----   ----                                                           ----   ----\n" +
    "\n" +
    "          Player4 Money: 990                                                  Player2 Money: 990\n" +
    "          Player4 Bet: 0                                                      Player3 Bet: 0\n" +
    "\n" +
    "\n" +
    "                                                Player3\n" +
    "                                              ----   ----\n" +
    "                                             | 3s | | 7s |\n" +
    "                                             |    | |    |\n" +
    "                                              ----   ----\n" +
    "\n" +
    "                                             Player4 Money: 990\n" +
    "                                             Player4 Bet: 0\n" +
    "\n" +
    "\n" +
    "Note: This dealing assumes deck begins with a fresh/new deck of standard cards and Player1 is dealt first."

        Holdem.initializegame should be(expectedResult)
      }

        //******* DO MOVE *******
      it("can do move") {
        val expectedResult_p1 =
    "                                               Game Area:\n" +
    "\n" +
    "                                                Player1\n" +
    "                                              ----   ----\n" +
    "                                             | As | | 5s |\n" +
    "                                             |    | |    |\n" +
    "                                              ----   ----\n" +
    "                                             Player1 Money: 0\n" +
    "                                             Player1 Bet: 990\n" +
    "\n" +
    "                                             Community Cards:\n" +
    "                                     ----   ----   ----   ----   ----\n" +
    "                                    | 9s | | Ts | | Js | | Qs | | Ks |\n" +
    "                                    |    | |    | |    | |    | |    |\n" +
    "                                     ----   ----   ----   ----   ----\n" +
    "                                               Pot: 1030\n" +
    "             Player4                                                               Player2\n" +
    "           ----   ----                                                           ----   ----\n" +
    "          | 4s | | 8s |                                                         | 2s | | 6s |\n" +
    "          |    | |    |                                                         |    | |    |\n" +
    "           ----   ----                                                           ----   ----\n" +
    "\n" +
    "          Player4 Money: 990                                                  Player2 Money: 990\n" +
    "          Player4 Bet: 0                                                      Player3 Bet: 0\n" +
    "\n" +
    "\n" +
    "                                                Player3\n" +
    "                                              ----   ----\n" +
    "                                             | 3s | | 7s |\n" +
    "                                             |    | |    |\n" +
    "                                              ----   ----\n" +
    "\n" +
    "                                             Player4 Money: 990\n" +
    "                                             Player4 Bet: 0\n" +
    "\n" +
    "\n" +
    "Note: This dealing assumes deck begins with a fresh/new deck of standard cards and Player1 is dealt first."

        val expectedResult_p2 =
    "                                               Game Area:\n" +
    "\n" +
    "                                                Player1\n" +
    "                                              ----   ----\n" +
    "                                             | As | | 5s |\n" +
    "                                             |    | |    |\n" +
    "                                              ----   ----\n" +
    "                                             Player1 Money: 0\n" +
    "                                             Player1 Bet: 990\n" +
    "\n" +
    "                                             Community Cards:\n" +
    "                                     ----   ----   ----   ----   ----\n" +
    "                                    | 9s | | Ts | | Js | | Qs | | Ks |\n" +
    "                                    |    | |    | |    | |    | |    |\n" +
    "                                     ----   ----   ----   ----   ----\n" +
    "                                               Pot: 2020\n" +
    "             Player4                                                               Player2\n" +
    "           ----   ----                                                           ----   ----\n" +
    "          | 4s | | 8s |                                                         | 2s | | 6s |\n" +
    "          |    | |    |                                                         |    | |    |\n" +
    "           ----   ----                                                           ----   ----\n" +
    "\n" +
    "          Player4 Money: 990                                                  Player2 Money: 0\n" +
    "          Player4 Bet: 0                                                      Player3 Bet: 990\n" +
    "\n" +
    "\n" +
    "                                                Player3\n" +
    "                                              ----   ----\n" +
    "                                             | 3s | | 7s |\n" +
    "                                             |    | |    |\n" +
    "                                              ----   ----\n" +
    "\n" +
    "                                             Player4 Money: 990\n" +
    "                                             Player4 Bet: 0\n" +
    "\n" +
    "\n" +
    "Note: This dealing assumes deck begins with a fresh/new deck of standard cards and Player1 is dealt first."

        val expectedResult_p3 =
    "                                               Game Area:\n" +
    "\n" +
    "                                                Player1\n" +
    "                                              ----   ----\n" +
    "                                             | As | | 5s |\n" +
    "                                             |    | |    |\n" +
    "                                              ----   ----\n" +
    "                                             Player1 Money: 0\n" +
    "                                             Player1 Bet: 990\n" +
    "\n" +
    "                                             Community Cards:\n" +
    "                                     ----   ----   ----   ----   ----\n" +
    "                                    | 9s | | Ts | | Js | | Qs | | Ks |\n" +
    "                                    |    | |    | |    | |    | |    |\n" +
    "                                     ----   ----   ----   ----   ----\n" +
    "                                               Pot: 3010\n" +
    "             Player4                                                               Player2\n" +
    "           ----   ----                                                           ----   ----\n" +
    "          | 4s | | 8s |                                                         | 2s | | 6s |\n" +
    "          |    | |    |                                                         |    | |    |\n" +
    "           ----   ----                                                           ----   ----\n" +
    "\n" +
    "          Player4 Money: 990                                                  Player2 Money: 0\n" +
    "          Player4 Bet: 0                                                      Player3 Bet: 990\n" +
    "\n" +
    "\n" +
    "                                                Player3\n" +
    "                                              ----   ----\n" +
    "                                             | 3s | | 7s |\n" +
    "                                             |    | |    |\n" +
    "                                              ----   ----\n" +
    "\n" +
    "                                             Player4 Money: 0\n" +
    "                                             Player4 Bet: 990\n" +
    "\n" +
    "\n" +
    "Note: This dealing assumes deck begins with a fresh/new deck of standard cards and Player1 is dealt first."

        val expectedResult_p4 =
    "                                               Game Area:\n" +
    "\n" +
    "                                                Player1\n" +
    "                                              ----   ----\n" +
    "                                             | As | | 5s |\n" +
    "                                             |    | |    |\n" +
    "                                              ----   ----\n" +
    "                                             Player1 Money: 0\n" +
    "                                             Player1 Bet: 990\n" +
    "\n" +
    "                                             Community Cards:\n" +
    "                                     ----   ----   ----   ----   ----\n" +
    "                                    | 9s | | Ts | | Js | | Qs | | Ks |\n" +
    "                                    |    | |    | |    | |    | |    |\n" +
    "                                     ----   ----   ----   ----   ----\n" +
    "                                               Pot: 4000\n" +
    "             Player4                                                               Player2\n" +
    "           ----   ----                                                           ----   ----\n" +
    "          | 4s | | 8s |                                                         | 2s | | 6s |\n" +
    "          |    | |    |                                                         |    | |    |\n" +
    "           ----   ----                                                           ----   ----\n" +
    "\n" +
    "          Player4 Money: 0                                                  Player2 Money: 0\n" +
    "          Player4 Bet: 990                                                      Player3 Bet: 990\n" +
    "\n" +
    "\n" +
    "                                                Player3\n" +
    "                                              ----   ----\n" +
    "                                             | 3s | | 7s |\n" +
    "                                             |    | |    |\n" +
    "                                              ----   ----\n" +
    "\n" +
    "                                             Player4 Money: 0\n" +
    "                                             Player4 Bet: 990\n" +
    "\n" +
    "\n" +
    "Note: This dealing assumes deck begins with a fresh/new deck of standard cards and Player1 is dealt first."

        Holdem.initializegame
        Holdem.domove should be(expectedResult_p1)
        Holdem.domove should be(expectedResult_p2)
        Holdem.domove should be(expectedResult_p3)
        Holdem.domove should be(expectedResult_p4)
      }    

          //******* DO TURN *******
      it("can do turn") {
        val expectedResult =
    "                                               Game Area:\n" +
    "\n" +
    "                                                Player1\n" +
    "                                              ----   ----\n" +
    "                                             | As | | 5s |\n" +
    "                                             |    | |    |\n" +
    "                                              ----   ----\n" +
    "                                             Player1 Money: 0\n" +
    "                                             Player1 Bet: 990\n" +
    "\n" +
    "                                             Community Cards:\n" +
    "                                     ----   ----   ----   ----   ----\n" +
    "                                    | 9s | | Ts | | Js | | Qs | | Ks |\n" +
    "                                    |    | |    | |    | |    | |    |\n" +
    "                                     ----   ----   ----   ----   ----\n" +
    "                                               Pot: 4000\n" +
    "             Player4                                                               Player2\n" +
    "           ----   ----                                                           ----   ----\n" +
    "          | 4s | | 8s |                                                         | 2s | | 6s |\n" +
    "          |    | |    |                                                         |    | |    |\n" +
    "           ----   ----                                                           ----   ----\n" +
    "\n" +
    "          Player4 Money: 0                                                  Player2 Money: 0\n" +
    "          Player4 Bet: 990                                                      Player3 Bet: 990\n" +
    "\n" +
    "\n" +
    "                                                Player3\n" +
    "                                              ----   ----\n" +
    "                                             | 3s | | 7s |\n" +
    "                                             |    | |    |\n" +
    "                                              ----   ----\n" +
    "\n" +
    "                                             Player4 Money: 0\n" +
    "                                             Player4 Bet: 990\n" +
    "\n" +
    "\n" +
    "Note: This dealing assumes deck begins with a fresh/new deck of standard cards and Player1 is dealt first."
        Holdem.initializegame
        Holdem.doturn should be(expectedResult)
      }

//******* DO GAME*******
      it("can do game") {
        val expectedResult_win = "Player1 WINS!!!"


        val expectedResult_end =
    "                                               Game Area:\n" +
    "\n" +
    "                                                Player1\n" +
    "                                              ----   ----\n" +
    "                                             | As | | 5s |\n" +
    "                                             |    | |    |\n" +
    "                                              ----   ----\n" +
    "                                             Player1 Money: 4000\n" +
    "                                             Player1 Bet: 0\n" +
    "\n" +
    "                                             Community Cards:\n" +
    "                                     ----   ----   ----   ----   ----\n" +
    "                                    | 9s | | Ts | | Js | | Qs | | Ks |\n" +
    "                                    |    | |    | |    | |    | |    |\n" +
    "                                     ----   ----   ----   ----   ----\n" +
    "                                               Pot: 0\n" +
    "             Player4                                                               Player2\n" +
    "           ----   ----                                                           ----   ----\n" +
    "          | 4s | | 8s |                                                         | 2s | | 6s |\n" +
    "          |    | |    |                                                         |    | |    |\n" +
    "           ----   ----                                                           ----   ----\n" +
    "\n" +
    "          Player4 Money: 0                                                  Player2 Money: 0\n" +
    "          Player4 Bet: 0                                                      Player3 Bet: 0\n" +
    "\n" +
    "\n" +
    "                                                Player3\n" +
    "                                              ----   ----\n" +
    "                                             | 3s | | 7s |\n" +
    "                                             |    | |    |\n" +
    "                                              ----   ----\n" +
    "\n" +
    "                                             Player4 Money: 0\n" +
    "                                             Player4 Bet: 0\n" +
    "\n" +
    "\n" +
    "Note: This dealing assumes deck begins with a fresh/new deck of standard cards and Player1 is dealt first."

        Holdem.dogame should be(expectedResult_end)
        Holdem.checkwinner should be(expectedResult_win)
      }

    }
  }
}
