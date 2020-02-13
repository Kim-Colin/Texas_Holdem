package Texas_Holdem

//******* PLAYER_ORDER *******
object PlayerOrder extends scala.collection.mutable.Queue[Player] {

  this += new Player("Player1")
  this += new Player("Player2")
  this += new Player("Player3")
  this += new Player("Player4")

  def advancePlayerOrder {
    this += this.dequeue
  }

  def showPlayerOrder : String = {
    var result = ""
    for (p <- this.toArray)
      result += p.name + ", "
    result.substring(0, result.length-2)
  }

  def current : Player = {
    return this.head
  }
}
