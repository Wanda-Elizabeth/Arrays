fun main(){
    getnames(arrayOf("khloe","rehema","robert","nyambura"))
     cities(arrayOf("harare","mumbai","dodoma","jakarta"))
    numbers(arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))
    ladies(arrayOf("Khloe","Nyambura","Wanjiru"))

}
fun getnames(name:Array<String>){
    println(name.contentToString())
}
fun cities(cities:Array<String>){
    cities.forEach {city->
        println(city.capitalize())

    }
}
fun numbers(num:Array<Int>){
    var sum=num[2]+num[5]
    println(sum)

    var No=num.indexOf(158)
    println(No)

    var num=num.sortedArray()
    println(num.contentToString())

}
fun ladies(name: Array<String>):Array<String>{
    var names=name
    println(name.contentToString())
    return name

}

