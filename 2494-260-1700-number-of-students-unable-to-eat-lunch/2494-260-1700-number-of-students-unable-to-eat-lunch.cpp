#include <vector>
#include <queue>
using namespace std;

class Solution {
public:
    int countStudents(vector<int>& students, vector<int>& sandwiches) {
        int n = students.size();
        int unfed = n;
        queue<int> q;

        for (int student : students) {
            q.push(student);
        }

        for (int sandwich : sandwiches) {
            int count = 0;
            while (count < n && q.front() != sandwich) {
                q.push(q.front());
                q.pop();
                count++;
            }
            if (q.front() == sandwich) {
                q.pop();
                unfed--;
            } else {
                break;
            }
        }

        return unfed;
    }
};