#include <stdio.h>
#include <string.h>
int N;
int quadTree[65][65];

void press(int x1, int y1, int x2, int y2) {
	/* function to press the quadTree */
	bool flag = false;

	if (x1 == y1 && x2 == y2) {
		printf("%d", quadTree[x1][x2]);
		return;
	}
	int n = quadTree[x1][x2];
	for (int i = x1; i <= y1; i++) {
		for (int j = x2; j <= y2; j++) {
			if (n != quadTree[i][j]) {
				flag = true;
				break;
			}
		}
		if (flag) break;
	}
	if (!flag) {
		printf("%d", quadTree[x1][x2]);
		return;
	}
	else {
		int mid = (y1 - x1) / 2;
		printf("(");
		press(x1, x1 + mid, x2, x2 + mid);
		press(x1, x1 + mid, x2 + mid + 1, y2);
		press(x1 + mid + 1, y1, x2, x2 + mid);
		press(x1 + mid + 1, y1, x2 + mid + 1, y2);
		printf(")");
	}
}


int main() {
	scanf("%d", &N);
	char str[65];
	for (int i = 1; i <= N; i++) {
		scanf("%s", str);
		for (int j = 0; j < strlen(str); j++) {
			quadTree[i][j + 1] = str[j] - '0';
		}
	}
	press(1, N, 1, N);
	return 0;
}