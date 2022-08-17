import java.util.*

fun main(args: Array<String>) {

    val read = Scanner(System.`in`)

    println("Input 2 numbers: ")

    var num1 = read.nextDouble();
    val num2 = read.nextDouble();

    while(true){
        num1 = num1-num2

        if(num1 < 0 )
            break

        println(num1)
    }

}