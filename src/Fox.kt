class Fox(image: String, food: String, habitat: String, hunger: Int) : Animal(image, food, habitat, hunger) {
    override fun makeNoise() {
        println("Fox NOISE")
    }
    override fun eat() {
        println("Fox EAT")
    }
}