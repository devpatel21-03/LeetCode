class Solution {
    public int[] findArray(int[] pref) {
        if(pref.length == 1){
            return pref;
        }
        int[] arr = new int[pref.length];
        arr[0]=pref[0];
        for(int i=1;i<pref.length;i++){
            int x=pref[i]^pref[i-1];
            arr[i]=x;
            
        }
        return arr;
    }
}