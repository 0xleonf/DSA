#include <stdbool.h>
#include <stdio.h>

// O(n^2) time, O(1) space
bool is_sum_consecutive(int n) {
  for (int i = 1; i < n; i++) {
    int sum = 0;

    for (int j = i; j < n; j++) {
      sum += j;

      if (sum == n && j > i) {
        return true;
      }

      if (sum > n) {
        break;
      }
    }
  }

  return false;
}

bool alt_is_sum_consecutive(int n) {
  if (n == 1) {
    return false;
  }

  if ((n & (n - 1)) == 0) {
    return false;
  }

  return true;
}

int main(int argc, char *argv[]) {
  int n = 256;
  printf("sum consecutive: %d\n", is_sum_consecutive(n));
  printf("alt sum consec: %d\n", alt_is_sum_consecutive(n));
  return 0;
}
