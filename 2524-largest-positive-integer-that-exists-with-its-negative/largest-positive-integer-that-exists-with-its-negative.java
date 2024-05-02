class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int maxNum =-1;
        for(int num:nums){
            if(set.contains(0-num))
                maxNum=Math.max(Math.abs(num),maxNum);

            set.add(num);    
        }

        return maxNum;    
    }
}