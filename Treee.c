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
void PreOrder(struct Node *Root)
{
    if (Root != NULL)
    {
        printf("%d \n", Root->data);
        PreOrder(Root->left);
        PreOrder(Root->right);
    }
}
void PostOrder(struct Node *Root)
{
    if (Root != NULL)
    {
        PostOrder(Root->left);
        PostOrder(Root->right);
        printf("%d \n", Root->data);
    }
}
void Inorder(struct Node *Root)
{
    if (Root != NULL)
    {
        Inorder(Root->left);
        printf("%d \n", Root->data);
        Inorder(Root->right);
    }
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
    Inorder(Root);
    return 0;
}