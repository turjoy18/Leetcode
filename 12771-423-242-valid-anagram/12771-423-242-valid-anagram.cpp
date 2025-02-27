class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.length() != t.length()) return false;

        quickSort(s, 0, s.length() - 1);
        quickSort(t, 0, t.length() - 1);

        return s == t;
    }

private:
    void quickSort(string& str, int s, int e) {
        if (s >= e) return;

        char pivot = str[e];
        int left = s;

        for (int i = s; i < e; i++) {
            if (str[i] < pivot) {
                char temp = str[left];
                str[left] = str[i];
                str[i] = temp;
                left++;
            }
        }

        str[e] = str[left];
        str[left] = pivot;

        quickSort(str, s, left - 1);
        quickSort(str, left + 1, e);
    }

};