#include <stdio.h>
int cnt = 0;
void jump(int a, int b, int c) {
	/* �ٱ����� �� Ļ�ŷ� �� �� ������ �ٸ� �� Ļ�ŷ� ������ ������ǥ�� ���� */
	int m = b - a;
	int n = c - b;
	if (m <= 1 && n <= 1) return;
	if (m >= n) jump(a, a + 1, b);
	else jump(b, b + 1, c);
	cnt++;
}

int main() {
	int a, b, c;
	scanf("%d %d %d", &a, &b, &c);
	jump(a, b, c);
	printf("%d\n", cnt);
	return 0;
}