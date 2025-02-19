#include <stack>
#include <string>
using namespace std;

class Solution {
public:
    bool isValid(string s) {
        stack<char> stack;

        for (char c : s) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty() || !isMatchingPair(stack.top(), c)) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.empty();
    }

private:
    bool isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }
};