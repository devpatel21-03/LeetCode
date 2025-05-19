import java.util.ArrayList;

class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder str = new StringBuilder();
        int count=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                count++;
            }
            
        }
        for(int i=0;i<count-1;i++){
            str.append('1');
        }
        for(int i=0;i<s.length()-count;i++){
            str.append('0');
        }
        str.append('1');
        return str.toString();
    }
}