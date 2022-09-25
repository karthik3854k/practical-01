import com.sun.jdi.IntegerValue

fun main(){
    print("Enter Month Number :")
    var MonthOftheyear =readLine()!!.toInt()
    var Month = when(MonthOftheyear){
        1->"Januarry"
        2->"February"
        3->"March"
        4->"April"
        5->"May"
        6->"June"
        7->"July"
        8->"August"
        9->"September"
        10->"Octorber"
        11->"November"
        12->"December"
        else->"enter proper month Number"



    }
    print(Month)

}



