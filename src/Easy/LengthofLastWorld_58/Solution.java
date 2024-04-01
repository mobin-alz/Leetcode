package Easy.LengthofLastWorld_58;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        String testCase_1 = "Hello World";
        String testCase_2 = "   fly me   to   the moon  ";
        String testCase_3 = "luffy is still joyboy";
        String[] testCases = {testCase_1, testCase_2, testCase_3};
        for (String testCase : testCases){
            System.out.print("s = " + testCase + ":");
            System.out.println(s1.lengthOfLastWord(testCase));

        }
    }
}
