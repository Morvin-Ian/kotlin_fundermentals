package expert

fun longestCommonPrefix(strs: Array<String>): String {
    var result = "";
    for (i in 0..strs[0].length){
        for(s in strs){
            if(i == s.length || s[i] != strs[0][i]){
                return result;
            }
        }

        result += strs[0][i];
    }

    return result;

}
