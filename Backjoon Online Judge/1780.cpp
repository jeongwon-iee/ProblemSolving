#include <stdio.h>
int N;
bool flag = false;
int cnt_1 = 0, cnt0 = 0, cnt1 = 0;
int paper[2190][2190];

void cut(int xstart, int xend, int ystart, int yend) {
	/* function to cut paper with the same number */
	if (xstart == xend && ystart == yend) {
		switch (paper[xstart][ystart]) {
		case -1:
			cnt_1++;
			break;
		case 0:
			cnt0++;
			break;
		case 1:
			cnt1++;
			break;
		}
			return;
	}
	int temp = paper[xstart][ystart];
	flag = false;
	/* x==horizontal , y==vertical */
	for (int i = xstart; i <= xend; i++) {
		for (int j = ystart; j <= yend; j++) {
			if (paper[i][j] != temp) {
				flag = true;
				break;
			}
		}
		if (flag) break;
	}
	if (flag) { //divide into nine pieces
		int d = (xend - xstart) / 3;
		cut(xstart, xstart + d, ystart, ystart + d);
		cut(xstart, xstart + d, ystart + d + 1, ystart + 2 * d + 1);
		cut(xstart, xstart + d, ystart + 2 * d + 2, yend);
		cut(xstart + d + 1, xstart + 2 * d + 1, ystart, ystart + d);
		cut(xstart + d + 1, xstart + 2 * d + 1, ystart + d + 1, ystart + 2 * d + 1);
		cut(xstart + d + 1, xstart + 2 * d + 1, ystart + 2 * d + 2, yend);
		cut(xstart + 2 * d + 2, xend, ystart, ystart + d);
		cut(xstart + 2 * d + 2, xend, ystart + d + 1, ystart + 2 * d + 1);
		cut(xstart + 2 * d + 2, xend, ystart + 2 * d + 2, yend);
	}
	else { //all same
		switch (temp) {
		case -1:
			cnt_1++;
			break;
		case 0:
			cnt0++;
			break;
		case 1:
			cnt1++;
			break;
		}
		return;
	}
}

int main() {
	scanf("%d", &N);
	
	for (int i = 1; i <= N; i++) {
		for (int j = 1; j <= N; j++) {
			scanf("%d", &paper[i][j]);
		}
	}
	cut(1, N, 1, N);
	printf("%d\n%d\n%d\n", cnt_1, cnt0, cnt1);
	return 0;
}