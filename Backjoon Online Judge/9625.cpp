#include <stdio.h>
int K;
int cntA = 1;
int cntB = 0;

void trans(int A, int B) {
	while (A > 0) {
		cntA -= 1;
		cntB += 1;
		A--;
	}
	while (B > 0) {
		cntA += 1;
		B--;
	}
}

int main() {
	
	scanf("%d", &K);
	for (int i = 0; i < K; i++) {
		trans(cntA, cntB);
	}
	printf("%d %d", cntA, cntB);
	return 0;
}