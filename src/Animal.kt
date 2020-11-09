abstract class Animal: Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger: Int = 10

    abstract fun makeNoise()
    abstract fun eat()
    override fun roam() {
        println("animal roaming")
    }
    open fun sleep() {
        println("animal sleeping")
    }


}