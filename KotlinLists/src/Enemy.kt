open class Enemy(val name: String, var hitPoints: Int, var lives: Int){
    fun takeDamage(damage: Int){
        val remainingHitPoint = hitPoints - damage
        if(remainingHitPoint > 0){
            hitPoints = remainingHitPoint
            println("$name took $damage points of damage, and has $hitPoints left")
        } else {
            lives-=1
            println("$name lost a life")
        }
    }
}