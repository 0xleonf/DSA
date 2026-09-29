#include <stdio.h>

// O(1)
int find_sum(int n) {
  int sum = 0;

  for (int i = 1; i <= n; i++) {
    sum += i;
  }

  return sum;
}

// alternative approach O(n)
int alt_find_sum(int n) {
  if (n == 1)
    return 1;

  return n + find_sum(n - 1);
}

// mathematical approach O(1)
int math_find_sum(int n) { return n * (n + 1) / 2; }

int main(int argc, char *argv[]) {

  int n = 5;
  printf("sum: %d\n", find_sum(n));
  printf("sum alt: %d\n", alt_find_sum(n));
  printf("math sum: %d\n", math_find_sum(n));

  return 0;
}
