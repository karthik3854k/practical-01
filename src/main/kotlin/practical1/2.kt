fun main(){
    val a: Int = 10
    val b: Double = a.toDouble()
    val c: String = "10"
    val f: String = "11.12"
    val d: Int = c.toInt()
    val e: Double =f.toDouble()
    println("Integer Value : $a")
    println("Double Value (from integer) : $b")
    println("String Value : $c")
    println("Integer Value (from String): $d")
    println("Double Value (from string) : $e")
}