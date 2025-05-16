class Solution {
    public boolean isBalanced(String num) {
        StringBuilder sb = new StringBuilder(num);
        int even=0;
        int odd=0;
        for(int i=0;i<num.length();i++){
            int digit=num.charAt(i)-'0';
            if(i%2==0){
                even+=digit;
            }
            else{
                odd+=digit;
            }
        }
        
        if(odd != even){
            return false;
        }
        else{
            return true;
        }
    }
}