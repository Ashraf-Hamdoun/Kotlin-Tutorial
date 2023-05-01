fun main() {
    val myCar = Car(3)
    val schoolBus = Bus(45)

    fun info(vehicle: Vehicle, name: String) {
        with(vehicle) {
            println(name)
            println("=======")
            println("Capacity : $capacity")
            println("Wheels : $numOfWheel")
            println("Number of passengers is $passengers")
            println("Has empty sets ? ${hasEmptySet()}")
            println()
        }
    }

    info(myCar, "My car")
    info(schoolBus, "School bus")
}


abstract class Vehicle(val passengers: Int){
    abstract val numOfWheel: Int
    abstract val capacity: Int

    fun hasEmptySet(): Boolean {
        return passengers < capacity
    }
}

class Car(passengers: Int): Vehicle(passengers) {
    override val capacity = 5
    override val numOfWheel = 4
}

class Bus(passengers: Int): Vehicle(passengers) {
    override val capacity = 50
    override val numOfWheel = 10
}