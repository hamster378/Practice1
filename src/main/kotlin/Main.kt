import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    //Z1
   val exercises: Int = 13
    var exercisesSolved: Int = 0
    exercisesSolved+=1

    //Z2
    val myAge: Int = 18
    exercisesSolved+=1

    //Z3
    var srAge: Double = 18.0
    srAge = (30.0+srAge)/2
    println(srAge)
    exercisesSolved+=1

    //Z4
 val testNumber: Int = 8
 val evenOdd: Double = testNumber%2.toDouble()
 exercisesSolved+=1
 /* у меня все хорошо было, после того, как я поменяла значение переменной*/

  //Z5
 var answer: Int = 0
 answer+=1
 answer+=10
 answer*=10
 answer shr 3
 println(answer)
 exercisesSolved+=1
 // ответ 808

  //Z6
 var age =1
 print(age)
 age = 30
 println(age)
 exercisesSolved+=1
 //изпользовала var, так как значение age мы после вывода изменяем

 //Z7
 val a: Int = 46
 val b: Int = 10
 //1
 val answer1: Int = (a*100)+b
 //2
 val answer2: Int = (a*100)+(b*100)
 //3
 val answer3: Int = (a*100)+(b/10)
 exercisesSolved+=1
 //????

 //Z8
 (5*3)-((4/2)*2)
 exercisesSolved+=1
 //Z9
 val a1: Double = 66.8
 val b2: Double = 21.9
 val averge: Double = (a1+b2)/2
println(averge)
 exercisesSolved+=1

 //Z10
 val fahrenheit: Double = 185.68
 val celcius: Double = (fahrenheit-32)/18
 println(celcius)
 exercisesSolved+=1

 //Z11


  //Z12
val degrees: Double = 44.378
 val radians: Double = (degrees * PI)/180
 println(radians)
 exercisesSolved+=1

 //Z13
 val x1: Double = 3.5
 val y1: Double = -4.7
 val x2: Double = 8.2
 val y2: Double = -1.9
 val distance: Double = sqrt((x2-x1)*2+(y2-y1)*2)
 println(distance)
 exercisesSolved+=1

}