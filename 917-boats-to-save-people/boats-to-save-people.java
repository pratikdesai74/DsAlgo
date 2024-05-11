class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        Arrays.sort(people);
        int start=0;
        int end=people.length-1;

        while(start<end){
            int sum=people[start] + people[end];
            
            if(people[start]==limit){
                count++;
                start++;
            }
            else if(people[end]==limit){
                count++;
                end--;
            }
            else if( sum >limit){
                count++;
                end--;
            }
            else if( sum <=limit){   
                start++;
                end--;
                count++;
            }
        }

        if(start==end)
            count++;

        return count;
    }
}