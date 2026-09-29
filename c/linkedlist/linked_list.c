#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
  int data;
  struct Node *next;
} Node;

struct Node *create_node(int value) {
  struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));

  new_node->data = value;
  new_node->next = NULL;

  return new_node;
}

void insert(Node **head, int value) {
  Node *new_node = create_node(value);

  if (*head == NULL) {
    *head = new_node;
    return;
  }

  Node *tail = *head;
  tail->next = new_node;
  tail = new_node;
}

void display(Node *head) {
  Node *current = head;

  while (current != NULL) {
    printf("%d->", current->data);
    current = current->next;
  }
  printf("null\n");
}

int main(int argc, char *argv[]) {

  Node *head = NULL;

  insert(&head, 20);
  insert(&head, 45);
  display(head);
  return 0;
}
