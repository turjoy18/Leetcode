class ProductOfNumbers {
    
    int[] nums;
    int count;

    public ProductOfNumbers() {
        nums = new int[0];
        count = 0;
    }
    
    public void add(int num) {
        int[] newNums = new int[count + 1];
        for (int i = 0; i < count; i++) {
            newNums[i] = nums[i];
        }
        newNums[count] = num;
        nums = newNums;
        count++;
    }
    
    public int getProduct(int k) {
        int product  = 1;
        for (int i = nums.length - 1; i >= nums.length - k; i--) {
            product *= nums[i];
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */