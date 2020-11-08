class Lion(image: String, food: String, habitat: String, hunger: Int) : Animal(image, food, habitat, hunger) {
    override fun makeNoise() {
        println("LION NOISE")
    }
    override fun eat() {
        println("LION EAT")
    }

}