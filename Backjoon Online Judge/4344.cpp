#include <stdio.h>

int main() {
	int C;
	int N;
	int stud[1002];
	int sum;
	int avg;
	double ratio;
	scanf("%d", &C);
	for (int testcase = 1; testcase <= C; testcase++) {
		sum = 0;
		avg = 0;
		ratio = 0;
		scanf("%d", &N);
		for (int i = 1; i <= N; i++) {
			scanf("%d", &stud[i]);
			sum += stud[i];
		}
		avg = sum * 1.0 / N;
		for (int i = 1; i <= N; i++) {
			if (stud[i] > avg)
				ratio++;
		}
		ratio /= N;
		ratio *= 100;
		printf("%.3lf%%\n", ratio);
	}
	return 0;
}