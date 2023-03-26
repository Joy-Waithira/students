import kotlin.io.println as println1

/*In a class of 57 students the teacher was collecting data of her students,
 * The data she required was:
 * The gender of the students
 * The course they are doing
 * the feedback on boys playing football
 * the feedback on the ladies playing hockey
 * the feedback on the curriculum
 * Using inheritance represent the gender and the course as
 * properties and the feedback as methods*/
fun main(){
    var printInfo=Students()
    printInfo.gender
    println1("23 Girls play hockey and learn hospitality")
    printInfo.gender
    println1("34 boys play football and learn Hospitality")
}

open class Students {
    var gender:String=""
    fun course(){
        println1("learning,playing")
    }
}
class Boys:Students(){
    var number:Int=34
    private fun play() {
        val boys = play()
        println1(34)
    }
}

class Girls:Students(){
    var totalNumber :Int=23
    private fun play(){
        println1(play())
    }
}
class Hospitality:Students(){
    private var students:String=""
    fun learning(){
        this.students=
            println1(students ).toString()
    }
}






