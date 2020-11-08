class Hippo() : Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("HIPPO NOISE")
    }
    override fun eat() {
        println("HIPPO EAT")
    }
}