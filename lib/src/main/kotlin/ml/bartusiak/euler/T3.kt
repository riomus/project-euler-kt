package ml.bartusiak.euler

class T3 {

    companion object{
        @JvmStatic
        fun main(vararg args: String){
            println(T3().solve())
        }
    }

    fun solve(): Long {
        val number = 600851475143L
        return  generateSequence(Pair(2L, number)) { state ->
            val (divisor, n) = state
            if(n%divisor==0L){
                Pair(divisor, n/divisor)
            } else {
                Pair(divisor+1L, n)
            }
        }.dropWhile { it.first<=it.second }.first().first
    }


}

