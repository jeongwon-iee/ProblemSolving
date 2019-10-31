#include <stdio.h>
int sum = 0;
int triple[3] = { 0 };

void Triple(int N, int low, int index) {
	if (sum == N*N*N && index == 3) {
		if (triple[0] <= triple[1] && triple[1] <= triple[2])
			printf("Cube = %d, Triple = (%d,%d,%d)\n", N, triple[0], triple[1], triple[2]);
		return;
	}
	else if (index == 3) return;

	for (int i = low; i < N; i++) {
		sum += i*i*i;
		triple[index++] = i;
		Triple(N, low + 1, index);
		sum -= i*i*i;
		index--;
	}
}

int main() {
	for (int cube = 1; cube <= 100; cube++) {
		Triple(cube, 2, 0);
	}
	return 0;
}