class Solution {
public:
    vector<int> sortArray(vector<int>& nums) {
        if (nums.empty()) return {};

        mergeSort(nums, 0, nums.size() - 1);
        return nums;
    }

private:
    void mergeSort(vector<int>& nums, int s, int e) {
        if (s >= e) return;

        int m = (s + e) / 2;

        mergeSort(nums, s, m);
        mergeSort(nums, m + 1, e);

        merge(nums, s, m, e);
    }

    void merge(vector<int>& nums, int s, int m, int e) {
        vector<int> L = {nums.begin() + s, nums.begin() + m + 1};
        vector<int> R = {nums.begin() + m + 1, nums.begin() +  e + 1};

        int i = 0, j = 0, k = s;
        while (i < L.size() && j < R.size()) {
            if (L[i] <= R[j]) nums[k++] = L[i++];
            else nums[k++] = R[j++];
        }

        while (i < L.size()) nums[k++] = L[i++];
        while (j < R.size()) nums[k++] = R[j++];
    }

};