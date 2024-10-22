abstract class Animal(val name: String) {
    abstract fun makeSound()
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("Woof!")
    }
}

class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println("Meow!")
    }
}

fun animalSounds(animals: List<Animal>) {
    for (animal in animals) {
        println("${animal.name} faz:")
        animal.makeSound()
    }
}

fun main() {
    val animals = listOf(Dog("Rex"), Cat("Whiskers"), Dog("Buddy"), Cat("Mittens"))
    animalSounds(animals)
}
