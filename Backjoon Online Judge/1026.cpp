/*
BOJ 1026
sort, search
º¸¹°
*/
#include <stdio.h>	
#include <algorithm>
using namespace std;
int A[55];
int B[55];

bool desc(int a, int b) {
	return a > b;
}

int main() {
	int N;
	int S = 0;
	scanf("%d", &N);
	for (int i = 0; i < N; i++) scanf("%d", &A[i]);
	for (int i = 0; i < N; i++) scanf("%d", &B[i]);
	
	sort(A, A + N, desc);	
	sort(B, B + N);

	for (int i = 0; i < N; i++) {
		S += A[i] * B[i];
	}
	printf("%d\n", S);

	return 0;
}