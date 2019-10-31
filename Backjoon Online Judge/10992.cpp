#include <stdio.h>
/*
    *
   * *
  *   *
 *     *
i 5-i
1 4   *
2 3   *1*
3 2   *3*
4 1
5 *
*/

int main() {
	int N;
	scanf("%d", &N);
	for (int line = 1; line <= N; line++) {
		if (line < N) {
			for (int i = 1; i <= N - line; i++)
				printf(" ");
			printf("*");
			if (line != 1) {
				for (int i = 1; i <= (line - 1) * 2 - 1; i++)
					printf(" ");
				printf("*");
			}
		}
		else {
			for (int i = 1; i <= 2*N-1; i++) 
				printf("*");
			
		}
		printf("\n");
	}
	return 0;
}