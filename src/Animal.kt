abstract class Animal(val image: String, val food: String, val habitat: String, val hunger: Int) {
    open fun makeNoise() {
        println("roar")
    }
    open fun eat() {
        println("eat ")
    }
    fun roam() {
        println("roam")
    }
    fun sleep() {
        println("sit down bitch")
    }
}