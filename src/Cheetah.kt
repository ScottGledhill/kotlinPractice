class Cheetah(image: String, food: String, habitat: String, hunger: Int) : Animal(image, food, habitat, hunger) {
    override fun makeNoise() {
        println("Cheetah NOISE")
    }
    override fun eat() {
        println("Cheetah EAT")
    }
}