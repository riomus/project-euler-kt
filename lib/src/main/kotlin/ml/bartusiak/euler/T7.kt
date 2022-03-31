package ml.bartusiak.euler

import kotlin.math.ceil
import kotlin.math.sqrt

class T7 {

    companion object{
        @JvmStatic
        fun main(vararg args: String){
            println(T7().solve())
        }
    }
    fun Long.square(): Long = this * this

    fun solve(): Long {
        return generateSequence(2L) { t -> t + 1L }.filter(::isPrime).drop(10000).first()
    }

    private fun isPrime(n: Long): Boolean{
        if(n==1L) return false
        if(n==2L) return true
        return (2 ..  ceil(sqrt(n.toDouble())).toLong()).none { n%it==0L }
    }


}

