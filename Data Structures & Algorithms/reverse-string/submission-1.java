class Solution {
    public void reverseString(char[] s) {
        char[] reversed = new StringBuilder(new String(s)).reverse().toString().toCharArray();
        System.arraycopy(reversed,0,s,0,s.length);
    }
}