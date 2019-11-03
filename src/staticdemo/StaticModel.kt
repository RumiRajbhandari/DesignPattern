package staticdemo

class StaticModel {

    companion object {
        var count = 0
        fun incrementCountStaticMethod(){
            count++
            println("count is $count")
        }
    }

    fun incrementCountNonStaticMethod(){
        count++
        println("count is $count")
    }
}