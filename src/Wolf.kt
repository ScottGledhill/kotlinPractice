class Wolf(image: String, food: String, habitat: String, hunger: Int) : Animal(image, food, habitat, hunger) {
    override fun makeNoise() {
        println("WOLF NOISE")
    }
    override fun eat() {
        println("WOLF EAT")
    }
}