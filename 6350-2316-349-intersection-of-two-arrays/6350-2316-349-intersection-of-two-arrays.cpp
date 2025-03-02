class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> set1(nums1.begin(), nums1.end());
        unordered_set<int> res;

        for (int num : nums2) {
            if (set1.count(num)) res.insert(num);
        } 

        return vector<int>(res.begin(), res.end());
    }
};