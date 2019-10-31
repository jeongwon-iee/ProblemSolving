#include <stdio.h>
#include <math.h>
void hanoi_tower(int, int, int, int);

int main() {

	int N = 0;
	scanf("%d", &N);
	printf("%d\n", (int)pow(2, N) - 1);
	hanoi_tower(N, 1, 2, 3);
}

//moving N discs from "from" to "to" via "aux" 
void hanoi_tower(int n, int from, int aux, int to) {
	if (n == 1) printf("%d %d\n", from, to);
	else {
		hanoi_tower(n - 1, from, to, aux);
		printf("%d %d\n", from, to);
		hanoi_tower(n - 1, aux, from, to);
	}
}