/*
BOJ 2579
Dynamic Programming
*/
#include <stdio.h>
int stairs[301] = { 0 };
int dp[301] = { 0 };

int Max(int a, int b) {
	return a > b ? a : b;
}

int main() {
	int N;
	scanf("%d", &N);
	for (int i = 1; i <= N; i++) scanf("%d", &stairs[i]);
	dp[1] = stairs[1];
	if (N > 1) dp[2] = stairs[1] + stairs[2]; 
	for (int i = 3; i <= N; i++) {
		dp[i] = Max(dp[i - 2] + stairs[i], dp[i - 3] + stairs[i - 1] + stairs[i]);
	}
	printf("%d\n", dp[N]);
	return 0;
}
