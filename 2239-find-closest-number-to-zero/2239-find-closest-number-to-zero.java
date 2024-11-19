class Solution {
    public int findClosestNumber(int[] nums) {
        
        List<Integer> closests = new ArrayList<>();
        
        int closest = Math.abs(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < closest) {
                closest = Math.abs(nums[i]);
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i]) == closest)
                closests.add(nums[i]);
        }
        
        int max = closests.get(0);
        for (int i = 1; i < closests.size(); i++) {
            if (closests.get(i) > max) {
                max = closests.get(i);
                break;
            }
        }
        return max;
    }
}