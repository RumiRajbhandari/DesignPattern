import abstractfactory.DSE
import abstractfactory.STL

fun main(args: Array<String>) {
    println("Main function")
    initializeAbstractFactory()
}

fun initializeAbstractFactory(){
    val stl = STL()
    println("stl's user role is ${stl.getUserRole()}")
    val dse = DSE()
    println("dse's role is ${dse.getUserRole()}")
}