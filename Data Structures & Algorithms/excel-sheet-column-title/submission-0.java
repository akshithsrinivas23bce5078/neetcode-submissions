class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";
        while(columnNumber > 0){
            columnNumber--;
            result += (char) ('A' + (columnNumber % 26));
            columnNumber /= 26;
        }
        return new StringBuilder(result).reverse().toString();
    }
}