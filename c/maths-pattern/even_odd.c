#include <stdbool.h>
#include <stdio.h>

bool is_even(int n) {
  if ((n & 1) == 0)
    return true;
  else
    return false;
}

int main(int argc, char *argv[]) {

  int n = 9998;
  printf("is even or odd?: %d\n", is_even(n));

  return 0;
}
