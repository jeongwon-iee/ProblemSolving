#include <stdio.h>
int room[102];

int main() {
	int T;
	scanf("%d", &T);
	for (int testcase = 0; testcase < T; testcase++) {
		int n;
		int cnt = 0;
		scanf("%d", &n);
		for (int no = 1; no <= n; no++) room[no] = 0; //initialize
		for (int round = 1; round <= n; round++) { //round
			for (int no = 1; no <= n; no++) { //the room number
				if (no%round == 0) room[no]++;
			}
		}
		for (int no = 1; no <= n; no++)
			if (room[no] % 2 == 1) cnt++;
		printf("%d\n", cnt);
	}
	return 0;
}