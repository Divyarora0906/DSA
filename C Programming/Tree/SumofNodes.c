#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
};
struct Node *CreateNode(int data)
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
}

int SumofAllNodes(struct Node *root)
{
    if(root == NULL) return 0;
    int LeftNode = SumofAllNodes(root->left);
    int RightNode = SumofAllNodes(root->right);
    return LeftNode + RightNode + root->data;
}

int main()
{
    struct Node *Root = CreateNode(50);
    struct Node *One = CreateNode(30);
    struct Node *Two = CreateNode(20);
    struct Node *Three = CreateNode(10);
    struct Node *Four = CreateNode(60);
    struct Node *Five = CreateNode(90);
    struct Node *Six = CreateNode(100);
    Root->left = One;
    Root->right = Two;
    One->left = Three;
    One->right = Four;
    Two->left = Five;
    Two->right = Six;
    int Nodes = SumofAllNodes(Root);
    printf("%d", Nodes);
    return 0;
}