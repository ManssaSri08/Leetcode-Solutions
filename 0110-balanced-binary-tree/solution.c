#include <stdbool.h>
#include <stdlib.h>
#include <math.h>
int checkHeight(struct TreeNode* root) {
    if (root == NULL)
        return 0;
    int left = checkHeight(root->left);
    int right = checkHeight(root->right);
    if (left == -1 || right == -1)
        return -1;
    if (abs(left - right) > 1)
        return -1;
    return 1 + (left > right ? left : right);
}
bool isBalanced(struct TreeNode* root) {
    return checkHeight(root) != -1;
}
