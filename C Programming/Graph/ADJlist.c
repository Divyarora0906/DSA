#include <stdio.h>
#include <stdlib.h>

// Node for adjacency list
struct Node {
    int dest;
    struct Node* next;
};


struct Graph {
    int V;            
    struct Node** adj;  
};

struct Node* createNode(int dest) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->dest = dest;
    newNode->next = NULL;
    return newNode;
}

// Create a graph with V vertices
struct Graph* createGraph(int V) {
    struct Graph* graph = (struct Graph*)malloc(sizeof(struct Graph));
    graph->V = V;

    // Create an array of adjacency lists (size V)
    graph->adj = (struct Node**)malloc(V * sizeof(struct Node*));

    // Initialize all lists as empty
    for (int i = 0; i < V; i++) {
        graph->adj[i] = NULL;
    }

    return graph;
}

// Add edge (undirected graph)
void addEdge(struct Graph* graph, int src, int dest) {
    // Add dest to src's list
    struct Node* newNode = createNode(dest);
    newNode->next = graph->adj[src];
    graph->adj[src] = newNode;

    // Add src to dest's list (because undirected)
    newNode = createNode(src);
    newNode->next = graph->adj[dest];
    graph->adj[dest] = newNode;
}

// Print adjacency list
void printGraph(struct Graph* graph) {
    for (int v = 0; v < graph->V; v++) {
        struct Node* temp = graph->adj[v];
        printf("Adjacency list of vertex %d: ", v);
        while (temp) {
            printf(" -> %d", temp->dest);
            temp = temp->next;
        }
        printf("\n");
    }
}

int main() {
    int V, E, u, v;
    printf("Enter number of vertices and edges: ");
    scanf("%d %d", &V, &E);

    struct Graph* graph = createGraph(V);

    printf("Enter edges (u v):\n");
    for (int i = 0; i < E; i++) {
        scanf("%d %d", &u, &v);
        addEdge(graph, u, v);
    }

    printGraph(graph);

    return 0;
}
