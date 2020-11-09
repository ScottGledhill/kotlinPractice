interface Roamable {
    var velocity: Int
        get() = 20
        set(value) {
          println("unable to update velocity")
        }
    fun roam() {
        println("roam eyoo roamable")
    }// interpreter knows all interface functions are abstract
}