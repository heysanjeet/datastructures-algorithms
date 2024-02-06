package leetcode.feb;

public class FindFirstUniqueCharInString {
    public static void main(String[] args) {
        /*Input: s = "leetcode"
        Output: 0

        Input: s = "loveleetcode"
        Output: 2  */
    }

    //Time O(n)
    public int firstUniqChar(String s) {
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;//get frequency for all character
        }

        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) {//get character that has one frequency
                return i;
            }
        }
        return -1;
    }

}
