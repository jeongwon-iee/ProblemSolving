#include <stdio.h>
#include <stdlib.h>
#include <algorithm>

int main() {
	int N = 0, M = 0;
	scanf("%d %d", &N, &M);
	int* arr = (int*)malloc(sizeof(int)*(N + M));

	for (int i = 0; i < N + M; i++) scanf("%d", &arr[i]);
	std::sort(arr, arr + (N + M));
	for (int i = 0; i < N + M; i++) printf("%d ", arr[i]);
	printf("\n");
	return 0;
}
