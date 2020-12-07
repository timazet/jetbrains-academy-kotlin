import java.util.*

data class Client(val name: String, val age: Int, val balance: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Client

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val client1 = Client(input.next(), input.nextInt(), input.nextInt())
    val client2 = Client(input.next(), input.nextInt(), input.nextInt())
    println(client1.equals(client2))
}
