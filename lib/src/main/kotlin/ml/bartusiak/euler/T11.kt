package ml.bartusiak.euler

import kotlin.math.ceil
import kotlin.math.sqrt

class T11 {

    companion object{
        @JvmStatic
        fun main(vararg args: String){
            println(T11().solve())
        }
    }

    fun solve(): Long {
        val grid = T8::class.java.getResource("/data/T11.txt")
            .readText().split("\n").
            filter{it.isNotEmpty()}
            .filter{it != "\n"}.
            map { it.split(" ").filter { it.isNotEmpty() }.map { it.toLong() } }
        val range = 0 .. (grid[0].size-1)
        return range.flatMap { x->
            range.flatMap { y ->
                val diagonalRight = if(x+3<20 && y+3<20){ grid[x][y]*grid[x+1][y+1]*grid[x+2][y+2]*grid[x+3][y+3]} else 0
                val diagonalLeft = if(x-3>=0 && y+3<20){ grid[x][y]*grid[x-1][y+1]*grid[x-2][y+2]*grid[x-3][y+3]} else 0
                val down = if(x+3<20){ grid[x][y]*grid[x+1][y]*grid[x+2][y]*grid[x+3][y]} else 0
                val up = if(x-3>=0){ grid[x][y]*grid[x-1][y]*grid[x-2][y]*grid[x-3][y]} else 0
                val right =if(y+3<20){ grid[x][y]*grid[x][y+1]*grid[x][y+2]*grid[x][y+3]} else 0
                val left =if(y-3>=0){ grid[x][y]*grid[x][y-1]*grid[x][y-2]*grid[x][y-3]} else 0
                listOf(diagonalRight, right, left, up, down, diagonalLeft)
        }
        }.maxOrNull()!!

    }

}

