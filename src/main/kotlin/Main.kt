import java.util.*

fun main(args: Array<String>) {

    val read = Scanner(System.`in`)

    println("Input 2 numbers: ")

    var num1 = read.nextBigDecimal().setScale(2);
    val num2 = read.nextBigDecimal().setScale(2);

    while(true){
        num1 = num1-num2

        if(num1.compareTo(num2-num2) < 0 )
            break

        println(num1)
    }

}