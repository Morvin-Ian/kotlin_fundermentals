package expert

fun <T:Comparable<T>>getSubtraction(list1:List<T>, list2:List<T>):List<T> {
    val list = list1.toMutableList()
    for ( data in list2){
        if(data in list1){
            val toBeRemovedIndex = list.indexOf(data)
            list.removeAt(toBeRemovedIndex)
        }else{
            continue
        }
    }

    return list
}