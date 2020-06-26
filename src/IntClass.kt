import kotlin.Int

class IntClass() {
    fun main() {
        println("Tipe Data Angka di Kotlin")

        var data1: String = "1. Tipe data Int"
        println(data1)

        val imin: Int = Int.MIN_VALUE
        println("Nilai Min = $imin")

        val imax: Int = Int.MAX_VALUE
        println("Nilai Max = $imax")
    }
}