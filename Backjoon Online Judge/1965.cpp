#include <stdio.h>
int box[1009];
int dp[1009];
/* 
	최장증가부분수열
	LIS(Longest Increasing Subsequence) & DP

	dp[i]=the maximum number incrementing to the ith number (1 if not)

	>> LIS with O(N^2)
	for(int i=1;i<=n;i++) {
		d[i]=1; //initialize
		for(int j=1;j<i;j++) {
			if(a[j]<a[i]&&dp[i]<dp[j]+1) {
				dp[i]=dp[j]+1
			}
		}
		if(max<dp[i]) max=dp[i]; 
	}

	>> LIS with O(NlogN)
	dp[1]=box[1]; size=1;
	for(int i=2;i<=n;i++) {
		if(dp[size]<box[i]) {
			size++;
			dp[size]=box[i];
			continue;
		}
		it = lower_bound(dp+1,dp+size+1,box[i])-dp; 
		dp[it]=box[i];
	}
	*/

int lower_bound(int arr[], int target, int size) {
	int start = 0;
	int end = size - 1;
	while (start < end) {
		int mid = (start + end) / 2;
		if (arr[mid] < target) start = mid + 1;
		else end = mid;
	}
	return end;
}

int main() {

	int n;
	int size;
	scanf("%d", &n);
	for (int i = 1; i <= n; i++) scanf("%d", &box[i]);
	dp[1] = box[1];
	size = 1;
	for (int i = 2; i <= n; i++) {
		if (dp[size] < box[i]) {
			dp[++size] = box[i];
			continue;
		}
		int pos = lower_bound(dp, box[i], size + 1);
		dp[pos] = box[i]; 
	}
	printf("%d\n", size);
	return 0;
}