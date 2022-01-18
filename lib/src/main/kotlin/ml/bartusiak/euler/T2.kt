package ml.bartusiak.euler

class T2 {

    companion object{
        @JvmStatic
        fun main(vararg args: String){
            println(T2().solve())
        }
    }

    fun solve(): Long {
        return generateSequence(Pair(1L,2L)){
            Pair(it.second, it.first+it.second)
        }.map { it.first }.takeWhile { it<4_000_000 }.filter { it%2==0L }.sum()
    }


}

