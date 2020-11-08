class Lynx(image: String, food: String, habitat: String, hunger: Int) : Animal(image, food, habitat, hunger) {
    override fun makeNoise() {
        println("Lynx NOISE")
    }
    override fun eat() {
        println("Lynx EAT")
    }
}