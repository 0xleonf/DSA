#include <stdio.h>

int sum(int n) {
  if (n == 1)
    return 1;

  return n + sum(n - 1);
}

int factorial(int n) {
  if (n == 0)
    return 1;

  return n * factorial(n - 1);
}

int fibonacci(int n) {
  if (n == 0)
    return 0;

  if (n == 1 || n == 2)
    return 1;

  else
    return (fibonacci(n - 1) + fibonacci(n - 2));
}

// substitution method for recurrences
void fun(int n) {
  if (n <= 0)
    return;

  printf("CFG ");

  fun(n / 2);
  fun(n / 2);
}

int main(int argc, char *argv[]) {

  int n = 5;
  printf("sum: %d\n", sum(n));
  printf("factorial: %d\n", factorial(n));

  for (int i = 0; i < n; i++) {
    printf("fibonacci: %d ", fibonacci(i));
  }
  printf("\n");

  fun(n);

  return 0;
}
