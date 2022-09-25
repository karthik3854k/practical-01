import com.sun.jdi.Value

fun main() {
    print("enter number :")
    val a = Integer.valueOf(readLine())
    if (a % 2 == 0) {
        print("$a is even")
    } else{
        println("$a is odd")
    }
}