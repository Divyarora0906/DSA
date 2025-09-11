#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
};
struct Node *CreateNode(int data)
{
    struct Node *p = (struct Node *)malloc(sizeof(struct Node));
    p->data = data;
    p->left = NULL;
    p->right = NULL;
    return p;
}
void PrintLeaf(struct Node *Root)
{
    if (Root == NULL) return;

    if(Root->left == NULL && Root->right == NULL){
        printf("%d \n",Root->data);
        return;
    }
    PrintLeaf(Root->left);
    PrintLeaf(Root->right);
}
int main()
{
    struct Node *Root = CreateNode(15);
    struct Node *L1 = CreateNode(10);
    struct Node *R1 = CreateNode(5);
    struct Node *Left = CreateNode(11);
    struct Node *LeftRight = CreateNode(7);
    struct Node *Right = CreateNode(99);
    struct Node *RightRight = CreateNode(100);
    Root->left = L1;
    Root->right = R1;
    L1->left = Left;
    L1->right = LeftRight;
    R1->left = Right;
    R1->right = RightRight;
    PrintLeaf(Root);
    return 0;
}