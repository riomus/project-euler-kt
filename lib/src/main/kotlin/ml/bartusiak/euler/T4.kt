package ml.bartusiak.euler

class T4 {

    companion object{
        @JvmStatic
        fun main(vararg args: String){
            println(T4().solve())
        }
    }

    fun solve(): Long {
        val range = (1L .. 999L).reversed()
        return range.flatMap { n1 -> range.map { n1 * it } }.sortedDescending().first { it.toString() == it.toString().reversed() }
    }


}

