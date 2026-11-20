class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val length = s.length
        if(t.length != length) return false
        val map1 = hashMapOf<Char, Int>()
        val map2 = hashMapOf<Char, Int>()
        for(i in 0 until length){
            map1[s[i]] = (map1[s[i]] ?: 0) + 1
            map2[t[i]] = (map2[t[i]] ?: 0) + 1
        }

        if(map1.size != map2.size) return false
        for((letter, count) in map1){
            if(map2[letter] != count) return false
        }
        return true
    }
}
