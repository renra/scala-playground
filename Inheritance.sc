class Fighter {
  var id = "fighter"
  def fight() = println("The " + id + " delivers a heavy blow")
}

class WeaponMaster extends Fighter {
  id = "weapon master"
  override def fight() = println("The " + id  +  " master dances through the battle fields like a wind")
}

trait Teleportable {
  def teleport() = println("He has just vanished to an unknown location")
}

class WingMaker extends WeaponMaster with Teleportable {
  id = "WingMaker"
}

object Inheritance extends App {
  val f = new Fighter()
  f.fight

  val w = new WeaponMaster()
  w.fight()

  val wi = new WingMaker()
  wi.fight()
  wi.teleport()
}
