class PlayerDefault (val name: String, var lives: Int = 3, var levels: Int = 1, var score: Int = 0){
    var weapon: Weapons = Weapons("Fist", 1)


    fun show(){
        println("""
            name: $name
            lives: $lives
            levels: $levels
            score: $score
        """.trimIndent())
    }
}