class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0]=0;

        for(int i=1;i<n+1;i++){
            if(i%2==0){
                int b = i/2;
                int c = ans[b];
                ans[i]=c;
            }
            else{
                int b1 = i/2;
                int c1 = ans[b1]+1;
                ans[i] = c1;
            }

        }
        return ans;
    }
}