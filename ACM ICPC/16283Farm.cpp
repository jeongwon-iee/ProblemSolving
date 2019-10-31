#include <stdio.h>
/*
양은 하루에 사료 a, x마리
염소는 하루에 사료 b, y마리
매일 아침 양+염소 마리n, 어제 소비한 전체 사료양w -> 양과 염소 몇 마리
ax+by=w
x+y=n

ax+by=w
bx+by=bn
(a-b)x=w-bn
x=(w-bn)/(a-b)

for 문으로 방정식 계산 ~!~!
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