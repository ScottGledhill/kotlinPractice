abstract class Canine(): Animal() {
    override val food = "canine food"
    override val image: String = "feline"
    override val habitat: String = "fucking anywhere"
    
    override fun roam() {
        println("the canine is roaming")
    }
}