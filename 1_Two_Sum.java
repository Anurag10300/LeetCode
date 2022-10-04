class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int first_index = -1;
        int second_index = -1;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        for(int i = 0 ; i<nums.length ; i++){

            if(map.containsKey(target - nums[i])){
                
                second_index = i;
                first_index = map.get(target-nums[i]);
                break;
                
            }
            
                map.put(nums[i],i);
            }
        
        
        int[] solution = {first_index,second_index};
        
        return solution;
        
    }
}