/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* insertionSortList(ListNode* head) {
        if (!head) return nullptr;

        ListNode* sorted = nullptr;
        ListNode* curr = head;
        while (curr) {
            ListNode* next = curr->next;
            sorted = insert(sorted, curr);
            curr = next;
        }

        return sorted;
    }

private:
    ListNode* insert(ListNode* sorted, ListNode* newNode) {
        if (!sorted || newNode->val < sorted->val) {
            newNode->next = sorted;
            return newNode;
        }

        ListNode* curr = sorted;
        while (curr->next && curr->next->val < newNode->val) {
            curr = curr->next;
        }

        newNode->next = curr->next;
        curr->next = newNode;

        return sorted;
    }

};