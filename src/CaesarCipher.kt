// In cryptography, a Caesar cipher is a simple encryption technique
// that shifts every letter in a message by a certain number of letters.
// The number of letters to shift is known as the key or shift parameter.

val alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

fun caesarCipherEncrypt(text:String, key:Int):String{
    val encryptedText = StringBuilder()

    for (char in text){
        if (char.isWhitespace()){
            encryptedText.append(" ")
        }else{
            val charValue = alphabets.indexOf(char)
            val shiftCharacter = (charValue + key).mod(alphabets.length)
            encryptedText.append(alphabets[shiftCharacter])
        }
    }
    return encryptedText.toString()
}

fun caesarCipherDecrypt(text:String, key:Int):String{
    val decryptedText = StringBuilder()

    for (char in text){
        if (char.isWhitespace()){
            decryptedText.append(" ")
        }else{
            val charValue = alphabets.indexOf(char)
            val shiftCharacter = (charValue - key).mod( alphabets.length)
            decryptedText.append(alphabets[shiftCharacter])
        }
    }
    return decryptedText.toString()
}


