import kotlin.concurrent.thread

fun main() {
    val alarm1 = Alarm(5, "БИБ")
    val alarm2 = Alarm(7, "цзынь")
    val alarm3 = Alarm(10, "БРРРР")

    thread { alarm1.start() }
    thread { alarm2.start() }
    thread { alarm3.start() }
}

class Alarm(private val seconds: Int, private val sound: String) {
    fun start() {
        Thread.sleep(seconds * 1000L)
        println(sound)
    }
}