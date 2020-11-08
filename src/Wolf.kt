class Wolf() : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "where ever the fuck it wants, its a wolf"
    override fun makeNoise() {
        println("WOLF NOISE")
    }
    override fun eat() {
        println("WOLF EAT $food")
    }
}