import com.sun.jdi.connect.Connector.StringArgument
import java.util.Scanner

fun countVowels(line: String):Int {
    var count = 0
    val check = arrayOf('a', 'e', 'i', 'o', 'u')
    for(i in line)
    {
        if (i in check)
            count += 1
    }
    return count
}

fun main() {
    val input = Scanner(System.`in`)
    println(countVowels(input.nextLine()))
}