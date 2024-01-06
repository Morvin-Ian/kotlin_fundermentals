fun factorial(value:Int):Int{
    var result:Int = 0
    if (value == 1){
        result =  1
    }else{
        result = value * factorial(value-1)
    }
    return  result
}