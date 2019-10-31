#include <stdio.h>
int S[15] = { 0 };
int used[15] = { 0 };
int number[7] = { 0 };
int k = 1;
void lotto(int low, int index) {
	if (index == 6) {
		for (int i = 0; i < index; i++) printf("%d ", number[i]);
		printf("\n");
		return;
	}
	for (int i = low; i < k; i++) {
		if (used[i] == 0) {
			if (index != 0 && number[index - 1] > S[i]) continue;
			else{
				number[index] = S[i];
				used[i] = 1;
			}
		}
		else continue;
		lotto(low + 1, index + 1);
		used[i] = 0;
	}
}

int main() {
	while (k != 0) {
		scanf("%d", &k);
		if (k == 0) break;
		for (int i = 0; i < k; i++) {
			scanf("%d", &S[i]);
		}
		lotto(0, 0);
		printf("\n");
	}
	return 0;
}