package ml.bartusiak.euler

class T1 {

    companion object{
        @JvmStatic
        fun main(vararg args: String){
            println(T1().solve())
        }
    }

    fun solve(): Long {
        val upTo = 1000;
        return (1L until upTo).asSequence().filter { it % 3 == 0L ||  it % 5 == 0L }.sum()
    }


}

