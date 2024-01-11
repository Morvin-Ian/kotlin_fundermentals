package intermediate

fun hasAverage(list:List<Int>, avg:Double):Boolean {

    for(index in 0..list.lastIndex){
        for(x in (index+1)..list.lastIndex){
            if(list[index]/list[x].toDouble() == avg || list[x]/list[index].toDouble() == avg ){
                return true
            }else{
                continue
            }
        }
    }

    return false
}