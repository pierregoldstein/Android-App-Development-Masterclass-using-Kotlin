class Player (val name: String, var lives: Int, var level: Int, var score: Int){
    var weapon: Weapon = Weapon("Fist", 1)
    private val inventory = ArrayList<Loot>()
//    fun show(){
//        println("""
//            Name: $name
//            Lives: $lives
//            Level: $level
//            Score: $score
//        """.trimIndent())
//    }
    fun show(){
          if(lives > 0){
              println("$name is alive")
          }else{
              println("$name never dies!")
          }
    }

    override fun toString(): String {
        return("""
            Name: $name
            Lives: $lives
            Level: $level
            Score: $score
            Weapon: ${weapon}
        """.trimIndent())
    }
    fun getLoot(item: Loot){
        inventory.add(item)
    }
    fun dropLoot(item:Loot): Boolean{
        return if(inventory.contains(item)){
            inventory.remove(item)
            true
        }else{
            false
        }
    }
    fun dropLoot(name: String): Boolean{
        println("$name will be dropped")
        return inventory.removeIf{ it.name == name }
    }
    fun showInventory(){
        println("$name's Inventory")
        for(item in inventory){
            println(item)
        }
        println("====================")
    }
}