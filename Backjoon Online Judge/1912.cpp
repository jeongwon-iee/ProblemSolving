#include <stdio.h>
int arr[100010];
int dp[100010];

int max(int a, int b) {
	return (a > b) ? a : b;
}

int main() {
	int N;
	int MAX;
	scanf("%d", &N);

	for (int i = 0; i < N; i++) scanf("%d", &arr[i]);

	/*  dp[i]: the maximum of the contiguous sum up to the ith element
		dp[i]=max(dp[i-1]+arr[i],dp[i-1])
	*/

	dp[0] = arr[0];
	MAX = dp[0];
	for (int i = 1; i < N; i++) {
		dp[i] = max(dp[i - 1] + arr[i], arr[i]);
		if (MAX < dp[i]) MAX = dp[i];
	}

	printf("%d\n", MAX);
	return 0;
}