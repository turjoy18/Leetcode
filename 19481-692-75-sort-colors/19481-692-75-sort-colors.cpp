class Solution {
public:
    void sortColors(vector<int>& nums) {
        int counts[] = {0, 0, 0};

        for (int n : nums) {
            counts[n]++;
        }

        int i = 0;
        for (int n = 0; n < sizeof(counts) / sizeof(int); n++) {
            for (int j = 0; j < counts[n]; j++) {
                nums[i] = n;
                i++;
            }
        }
    }
};