val callback:((Int) -> Boolean) = { it > 3 }

fun anyCallBack(list:List<Int>, callback: ((Int) -> Boolean)):Boolean{
    if(list.isEmpty()) return false

    for(data in list){
        if (callback(data)){
            return true
        }else{
            continue
        }
    }

    return false
}