package ml.bartusiak.euler

import kotlin.math.ceil
import kotlin.math.sqrt

class T10 {

    companion object{
        @JvmStatic
        fun main(vararg args: String){
            println(T10().solve())
        }
    }

    fun solve(): Long {
        val range = (1L .. 2000000L).asSequence()
        return range.filter(::isPrime).sum()
    }

    private fun isPrime(n: Long): Boolean{
        if(n==1L) return false
        if(n==2L) return true
        return (2 ..  ceil(sqrt(n.toDouble())).toLong()).none { n%it==0L }
    }

}

