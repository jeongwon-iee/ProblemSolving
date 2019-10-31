#include <stdio.h>
#include <string.h>
char pw[101][14];

bool is_passwd(char a[], char b[]) {
	int lena = strlen(a);
	int lenb = strlen(b);

	if (lena != lenb) return false;
	else {
		for (int i = 0, j = lena - 1; i < lena; i++, j--) {
			if (a[i] != b[j]) return false;
		}
	}
	return true;
}

int main() {
	int N;
	int len;
	scanf("%d", &N);
	for (int i = 0; i < N; i++) {
		scanf("%s", &pw[i]);
	}

	for (int i = 0; i < N - 1; i++) {
		for (int j = i; j < N; j++) {
			if (is_passwd(pw[i], pw[j])) {
				len = strlen(pw[i]);
				printf("%d %c", len, pw[i][len / 2]);
				return 0;
			}
		}
	}

	return 0;
}