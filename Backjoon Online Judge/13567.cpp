/*
BOJ 13567
ACM-ICPC Daejeon Regional 2016
Robot
*/
#include <stdio.h>
int box[1010][1010];
int go[2][4] = { {0,-1,0,1}, {-1,0,1,0} }; //x y 하 좌 상 우
int direction = 3;
/*
10 3
MOVE 6
TURN 0
MOVE 3
*/
int main() {
	int M, N;
	int x = 0, y = 0;
	int dir;
	int test;
	char op[5];
	scanf("%d %d", &M, &N);
	for (int i = 1; i <= N; i++) {
		scanf("%s", &op);
		scanf("%d", &dir);
		if (op[0] == 'M') {
			test = x + go[0][direction] * dir;
			if (test > M || test < 0) {
				printf("-1");
				return 0;
			}
			else x = test;
			test = y + go[1][direction] * dir;
			if (test > M || test < 0) {
				printf("-1");
				return 0;
			}
			else y = test;
		}
		else { //TURN
			if (dir == 0) { //왼쪽으로 90도 회전
				if (direction - 1 < 0) direction = 3;
				else direction--;
			}
			else {
				if (direction + 1 > 3) direction = 0;
				else direction++;
			}
		}
	}
	printf("%d %d", x, y);
	return 0;
}