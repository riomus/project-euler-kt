package ml.bartusiak.euler

class T6 {

    companion object{
        @JvmStatic
        fun main(vararg args: String){
            println(T6().solve())
        }
    }
    fun Long.square(): Long = this * this

    fun solve(): Long {
        val range = (1L..100L)
        return range.sum().square() - range.sumOf{it * it}
    }


}

