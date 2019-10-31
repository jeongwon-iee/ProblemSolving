#include <stdio.h>

int main() {
	int N; 
	int sum;
	int tmp;
	scanf("%d", &N);
	for (int M = 1; M < N; M++) {
		tmp = M; 
		sum = 0;
		while (tmp > 0) {
			sum += tmp % 10;
			tmp /= 10;
		}
		sum += M;
		if (sum == N) {
			printf("%d", M);
			return 0;
		}
	}
	printf("0");
	return 0;
}