#include <stdio.h>
/*
���� �Ϸ翡 ��� a, x����
���Ҵ� �Ϸ翡 ��� b, y����
���� ��ħ ��+���� ����n, ���� �Һ��� ��ü ����w -> ��� ���� �� ����
ax+by=w
x+y=n

ax+by=w
bx+by=bn
(a-b)x=w-bn
x=(w-bn)/(a-b)

for ������ ������ ��� ~!~!
*/
int main() {
	int a, b, n, w;
	int sheep = 0, goat = 0;
	int sol_cnt = 0;
	scanf("%d %d %d %d", &a, &b, &n, &w);

	for (int x = 1, y = n - 1; x < n; x++, y--) {
		if (sol_cnt < 2) {
			if (a * x + b * y == w) {
				sheep = x;
				goat = y;
				sol_cnt++;
			}
		}
		else break;
	}
	if (sol_cnt == 1) printf("%d %d", sheep, goat);
	else printf("-1");
	return 0;
}