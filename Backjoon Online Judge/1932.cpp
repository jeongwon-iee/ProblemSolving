#include <stdio.h>
int dp[504][504];
/*
dp[i][j]: sum of paths including the jth element in the ith layer
dp[n-1][] Сп max
*/
int Max(int a, int b) {
	return (a > b) ? a : b;
}

int main() {
	int n;
	int max;
	scanf("%d", &n);
	for (int i = 1; i <= n; i++)
		for (int j = 1; j <= i; j++)
			scanf("%d", &dp[i][j]);
	for (int i = 2; i <= n; i++) {
		for (int j = 1; j <= i; j++) {
			if (j == 1) dp[i][j] = dp[i - 1][j] + dp[i][j];
			else if (j == i) dp[i][j] = dp[i - 1][j - 1] + dp[i][j];
			else dp[i][j] = Max(dp[i - 1][j] + dp[i][j], dp[i - 1][j - 1] + dp[i][j]);
		}
	}
	max = dp[n][1];

	for (int j = 1; j <= n; j++) {
		if (dp[n][j] > max) max = dp[n][j];
	}

	printf("%d\n", max);
	return 0;

}