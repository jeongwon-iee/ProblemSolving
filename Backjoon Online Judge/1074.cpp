/*
BOJ 1074
Divide & Conquer
Z
*/
#include <stdio.h>
#include <math.h>
int turn = -1;
int p = 0, q = 0;
int N, r, c;

void Z(int x1, int y1, int x2, int y2) {
	if (x1 == y1 && x2 == y2) {
		if (x1 == r && x2 == c) {
			turn++;
			printf("%d\n", turn);
		}
		else turn++;
		return;
	}

	int mid1 = (y1 - x1) / 2;
	int mid2 = (y2 - x2) / 2;
	
	if (x1 <= r && x1 + mid1 >= r) {
		if (x2 <= c && x2 + mid2 >= c) {
			Z(x1, x1 + mid1, x2, x2 + mid2);
		}
		else if (x2 + mid2 + 1 <= c && y2 >= c) {
			turn += pow((mid1 + 1), 2);
			Z(x1, x1 + mid1, x2 + mid2 + 1, y2);
		}
	}
	else if (x1 + mid1 + 1 <= r && y1 >= r) {
		if (x2 <= c && x2 + mid2 >= c) {
			turn += pow((mid1 + 1), 2) * 2;
			Z(x1 + mid1 + 1, y1, x2, x2 + mid2);
		}
		else if (x2 + mid2 + 1 <= c && y2 >= c) {
			turn += pow((mid1 + 1), 2) * 3;
			Z(x1 + mid1 + 1, y1, x2 + mid2 + 1, y2);
		}
	}
}

int main() {
	scanf("%d %d %d", &N, &r, &c);
	Z(0, pow(2, N) - 1, 0, pow(2, N) - 1);
	return 0;
}