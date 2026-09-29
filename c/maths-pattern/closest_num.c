#include <limits.h>
#include <stdio.h>
#include <stdlib.h>

// O(m) time, O(1) space
int closest_num(int n, int m) {
  int closest = 0;
  int min_diff = INT_MAX;

  for (int i = n - abs(m); i <= n + abs(m); ++i) {
    if (i % m == 0) {
      int diff = abs(n - i);

      if (diff < min_diff || (diff == min_diff && abs(i) > abs(closest))) {
        closest = i;
        min_diff = diff;
      }
    }
  }

  return closest;
}

// O(1) time, O(1) space
int alt_closest_num(int n, int m) {
  int q = n / m;

  int n1 = m * q;

  int n2 = (n * m) > 0 ? (m * (q + 1)) : (m * (q - 1));

  if (abs(n - n1) < abs(n - n2))
    return n1;

  return n2;
}

int main(int argc, char *argv[]) {

  int n = 13, m = 4;

  printf("closest number: %d\n", closest_num(n, m));
  printf("closest number better: %d\n", alt_closest_num(n, m));

  return 0;
}
