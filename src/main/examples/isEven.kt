import kotlin.math.absoluteValue

fun main() {

    fun isEven(number: Any): Boolean {
        return when(number) {
            is Byte, is Short, is Int, is Long -> {
                val num = number.toString()
                val longNum = num.toLong().absoluteValue
                longNum.toInt() % 2 == 0
            }
            else -> false
        }
    }

    print(isEven(-2))


}
