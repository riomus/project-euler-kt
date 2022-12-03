package ml.bartusiak.euler

import kotlin.math.ceil
import kotlin.math.sqrt

class T8 {

    companion object{
        @JvmStatic
        fun main(vararg args: String){
            println(T8().solve())
        }
    }
    fun Long.square(): Long = this * this

    fun solve(): Long {
        return T8::class.java.getResource("/data/T8.txt")
            .readText().split("", "\n").
            filter{it.isNotEmpty()}
                .filter{it != "\n"}.
            map { it.toLong() }.windowed(13).maxOf { it.reduce{a, b -> a*b} }
    }


}

