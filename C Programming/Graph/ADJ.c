#include <stdio.h>
#include <stdlib.h>

struct Graph
{
    int V;
    int E;
    int **Adj;
};

struct Graph *adjMatrix()
{
    int u, v, i, j;
    struct Graph *G = (struct Graph *)malloc(sizeof(struct Graph *));
    if (G == NULL)
    {
        printf("No Memory Allocated");
        exit(1);
    }
    printf("Enter Number of Nodes and Edges");
    scanf("%d %d", &G->V, &G->E);
    G->Adj = (int **)malloc(G->V * sizeof(int *));
    for (int i = 0; i < G->V; i++)
    {
        G->Adj[i] = (int *)malloc(G->V * sizeof(int));
    }
    for (i = 0; i < G->V; i++)
    {
        for (j = 0; j < G->E; j++)
        {
            G->Adj[i][j] = 0;
        }
    }
    printf("Enter edges (u v): \n");
    for (i = 0; i < G->E; i++)
    {
        scanf("%d %d", &u, &v);
        if (u >= G->V || v >= G->V)
        {
            printf("Invalid edge: %d %d\n", u, v);
            continue;
        }
        G->Adj[u][v] = 1;
        G->Adj[v][u] = 1;
    }

    return G;
}
void printAdjMatrix(struct Graph *G)
{
    int i, j;
    printf("Adjacency Matrix:\n");
    for (i = 0; i < G->V; i++)
    {
        for (j = 0; j < G->V; j++)
        {
            printf("%d ", G->Adj[i][j]);
        }
        printf("\n");
    }
}

int main()
{
    struct Graph *G = adjMatrix();
    printAdjMatrix(G);
    return 0;
}