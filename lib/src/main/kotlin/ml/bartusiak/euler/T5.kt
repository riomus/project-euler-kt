package ml.bartusiak.euler

class T5 {

    companion object{
        @JvmStatic
        fun main(vararg args: String){
            println(T5().solve())
        }
    }

    fun solve(): Long {
        val divisors = (2L..20L).toList()
        return (22L .. Long.MAX_VALUE).first{n -> divisors.all { n%it==0L }}
    }


}

