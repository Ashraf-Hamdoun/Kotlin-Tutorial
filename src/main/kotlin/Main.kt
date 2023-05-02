fun main() {

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