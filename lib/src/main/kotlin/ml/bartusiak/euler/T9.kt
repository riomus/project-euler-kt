package ml.bartusiak.euler

import kotlin.math.ceil
import kotlin.math.sqrt

class T9 {

    companion object{
        @JvmStatic
        fun main(vararg args: String){
            println(T9().solve())
        }
    }

    fun Long.square(): Long = this * this
    fun solve(): Long {
        val range = (1L .. 1000L).asSequence()
        val triples = range.flatMap { a ->
            range.flatMap { b ->
                range.map { c ->
                    Triple(a, b, c)
                }
            }
        }
        val (a,b,c) = triples.filter { (a, b, c) ->
            a+b+c==1000L
        }.first { (a, b, c) ->
            a.square()+b.square() == c.square()
        }
        return a*b*c
    }


}

