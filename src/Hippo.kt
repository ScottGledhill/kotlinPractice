class Hippo(image: String, food: String, habitat: String, hunger: Int) : Animal(image, food, habitat, hunger) {
    override fun makeNoise() {
        println("HIPPO NOISE")
    }
    override fun eat() {
        println("HIPPO EAT")
    }
}