class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        //find the last index
        int lastSpaceIndex = s.lastIndexOf(' ');
        String lastWord = s.substring(lastSpaceIndex + 1);
        int length = lastWord.length();
        return length;
    }
}