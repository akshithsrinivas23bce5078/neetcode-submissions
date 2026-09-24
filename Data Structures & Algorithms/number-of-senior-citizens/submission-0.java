class Solution {
    public int countSeniors(String[] details) {
        //7868190130M7522 
        //0 to 9 - phone number
        //10 - Gender
        //11 to 12 - age
        //13 to 14 - Seat alloted
        //Substring syntax = string.substring(startIndex, endIndex)
        int count = 0;
        for(String person : details){
            String age = person.substring(11,13);
            int ageInteger = Integer.parseInt(age);
            if(ageInteger > 60){
                count += 1;
            }
        }
        return count;
    }
}