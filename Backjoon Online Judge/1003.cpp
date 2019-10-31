/*
BOJ 1003
Dynamic Programming
Fibonacci
*/
#include <stdio.h>
int dp[42][2] = { {1, 0}, {0, 1}, }; //dp[0][i]=i번째 피보나치 fib(i) 호출 시 0과 1이 호출되는 횟수

int fib0(int N) {
	if (N < 2) return dp[N][0];
	if (dp[N][0] != 0) return dp[N][0];
	dp[N][0] = fib0(N - 1) + fib0(N - 2);
	return dp[N][0];
}

int fib1(int N) {
	if (N < 2) return dp[N][1];
	if (dp[N][1] != 0) return dp[N][1];
	dp[N][1] = fib1(N - 1) + fib1(N - 2);
	return dp[N][1];
}

int main() {
	int T, N;
	scanf("%d", &T);
	for (int testcase = 1; testcase <= T; testcase++) {
		scanf("%d", &N);
		fib0(N);
		fib1(N);
		printf("%d %d\n", dp[N][0], dp[N][1]);
	}
	return 0;
}