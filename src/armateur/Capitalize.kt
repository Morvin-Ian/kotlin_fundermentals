package armateur

fun capitalize(sentence:String):String {
    val words = sentence.split(" ")
    val capitalized = mutableListOf<String>()

    words.forEach {
        capitalized.add(it[0].uppercase()+it.substring(1))
    }

    return capitalized.joinToString(" ")
}