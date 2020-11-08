open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    val hunger = 10

    open fun makeNoise() {
        println("roar")
    }
    open fun eat() {
        println("eat ")
    }
    open fun roam() {
        println("roam")
    }
    fun sleep() {
        println("sit down bitch")
    }
}