class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> setSeen = new HashSet<>();
        while(n != 1){
            if(setSeen.contains(n)) return false;
            setSeen.add(n);
            int squareSum = 0;
            while(n > 0){
                int digit = n % 10;
                squareSum += Math.pow(digit,2);
                n /= 10;
            }
            n = squareSum;
        }
        return true;    
    }
}
