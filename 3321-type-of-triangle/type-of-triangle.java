class Solution {
    public String triangleType(int[] nums) {
        
        int flag=0;
        Set<Integer> a = new HashSet<>();
        for(int n:nums){
            a.add(n);
        }
        

        if(nums[1]+nums[2]>nums[0]){
            if(nums[0]+nums[2]>nums[1]){
                if(nums[0]+ nums[1]>nums[2]){
                    flag=1;
                } 
            }
        }   
        else{
            flag=0;
        }


        if (a.size() == 1 && flag == 1 ){
            return "equilateral";
        }
        else if(a.size() == 2 && flag==1 ){
            return "isosceles";
        }
        else if (a.size() == 3 && flag==1 ){
            return "scalene";
            
        }
        else{
            return "none";
        }
    }
}