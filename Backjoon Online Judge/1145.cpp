/*
BOJ 1145
math & search
multiple
*/
#include <stdio.h>
#include <algorithm>
using namespace std;
int main() {
	int num[5];

	for (int i = 0; i < 5; i++) {
		scanf("%d", &num[i]);
	}
	sort(num, num + 5);
	for (int i = num[0];; i++) {
		int cnt = 0;
		for (int j = 0; j < 5; j++) {
			if (i%num[j] == 0) cnt++; 
		}
		if (cnt >= 3) {
			printf("%d\n", i);
			return 0;
		}
	}
}