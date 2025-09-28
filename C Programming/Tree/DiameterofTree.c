#include<stdio.h>
#include<stdlib.h>
#include<math.h>

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
int Height(struct Node* root){
    if(root == NULL) return 0;
    int LeftHeight = Height(root->left);
    int RightHeight = Height(root->right);

    int myHeight;
    if(LeftHeight > RightHeight){
        myHeight = LeftHeight + 1;
    }
    else{
        myHeight  = RightHeight + 1;
    }
    return myHeight;
}
int Diameter(struct Node* root){
  if(root == NULL) return 0;
  int diam1 = Diameter(root->left);
  int diam2 = Diameter(root->right);
  int diam3 = ;
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
    int Nodes = Height(Root);
    printf("%d", Nodes);
    return 0;
}