abstract class Feline(): Animal() {
    override val image: String = "feline"
    override val food: String = "meat"
    override val habitat: String = "fucking anywhere"

    override fun makeNoise() {
        println("the feline is making noise")
    }
    override fun eat() {
        println("the feline is eating")
    }
}