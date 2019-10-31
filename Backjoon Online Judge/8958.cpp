#include <stdio.h>
#include <string.h>
char problem[82];
int score;
int main() {
	int N;
	scanf("%d", &N);
	for (int testcase = 1; testcase <= N; testcase++) {
		score = 0;
		scanf("%s", problem);
		int len = strlen(problem);
		for (int i = 0; i < len; i++) { //scan
			if (problem[i] == 'O') { 
				score += 1;
				int tmp = 2;
				for (int j = i + 1; ; j++) {
					if (problem[j] != 'O') {
						i = j;
						break;
					}
					score += tmp;
					tmp++;
				}
			}
		}
		printf("%d\n", score);
	}
	return 0;
}