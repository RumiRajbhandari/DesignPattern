import abstractfactory.DSE
import abstractfactory.STL
import builderpattern.Sku
import staticdemo.StaticModel

fun main(args: Array<String>) {
    println("Main function")
    initializeAbstractFactory()
    initBuilderPattern()
    initStaticModel()
}

fun initializeAbstractFactory(){
    val stl = STL()
    println("stl's user role is ${stl.getUserRole()}")
    val dse = DSE()
    println("dse's role is ${dse.getUserRole()}")
}

fun initBuilderPattern(){
    val sku = Sku.SkuBuilder().id(1)
            .name("Shampoo")
            .quantity(25)
            .build()
    println(sku)
}

fun initStaticModel(){
    StaticModel.incrementCountStaticMethod()
    StaticModel.incrementCountStaticMethod()
    val staticModel = StaticModel()
    staticModel.incrementCountNonStaticMethod()
    StaticModel.incrementCountStaticMethod()

}