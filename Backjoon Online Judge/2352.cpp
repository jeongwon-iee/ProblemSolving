#include <stdio.h>
int port[40004];
int dp[40004] = { 0 };

/* LIS */

int lower_bound(int arr[], int target, int size) {
	int start = 0;
	int end = size - 1;
	int mid;
	while (start < end) {
		mid = (start + end) / 2;
		if (arr[mid] < target) start = mid + 1;
		else end = mid;
	}
	return end;
}

int main() {
	int n;
	int size = 1;
	scanf("%d", &n);
	for (int i = 1; i <= n; i++) {
		scanf("%d", &port[i]);
	}
	dp[1] = port[1];
	for (int i = 2; i <= n; i++) {
		if (dp[size] < port[i]) {
			dp[++size] = port[i];
			continue;
		}
		int pos = lower_bound(dp, port[i], size + 1);
		dp[pos] = port[i];
	}

	printf("%d\n", size);
	return 0;
}