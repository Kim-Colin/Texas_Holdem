package Texas_Holdem

//******* PLAYER_ORDER *******
object Move { //object or class?

  //current player = PlayerOrder.current
  def decide {
    //calls player logic/strategy i.e. PlayerOrder.current.logic
    //will call the functions below
  }

  def raise {
    //raises bet amount
  }

  def check {
    //waits to make decision
  }

  def fold {
    //gives up like the loser they are
  }

}
