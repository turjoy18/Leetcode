#include <string>
using namespace std;

class BrowserHistory {
    struct ListNode {
        string url;
        ListNode* next;
        ListNode* prev;

        ListNode(string s) : url(s), next(nullptr), prev(nullptr) {} 
    };

private:
    ListNode* head;
    ListNode* curr;

public:
    BrowserHistory(string homepage) {
        head = new ListNode(homepage);
        curr = head;
    }
    
    void visit(string url) {
        ListNode* newNode = new ListNode(url);
        curr->next = newNode;
        newNode->prev = curr;
        curr = newNode;
    }
    
    string back(int steps) {
        while (steps > 0 && curr->prev != nullptr) {
            curr = curr->prev;
            steps--;
        }
        return curr->url;
    }
    
    string forward(int steps) {
        while (steps > 0 && curr->next != nullptr) {
            curr = curr->next;
            steps--;
        }
        return curr->url;
    }
};

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory* obj = new BrowserHistory(homepage);
 * obj->visit(url);
 * string param_2 = obj->back(steps);
 * string param_3 = obj->forward(steps);
 */