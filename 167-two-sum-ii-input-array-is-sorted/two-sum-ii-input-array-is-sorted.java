class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a=0;
        int b=numbers.length-1;
        while(a<b){
            int s=numbers[a]+numbers[b];
            if(s==target){
                return new int[] {a+1,b+1};
            }else if(s<target){
                a++;
            }else{
                b--;
            }
        } 
        return new int[]{};
        }
    }