#include <cstdio>
#include <math.h>
#include <algorithm>
using namespace std;
typedef pair<int, int> color;
color points[1000002];
#define INF 987654321

/*
p, q ���� �Ÿ��� �ּ��� (p,q)
�Ÿ� = x����+y����(����)
p=(x, c1)
q=(x, c2)
�ߺ�x

!!�ð��ʰ��� ��� ���~
for�� �� �� �Ἥ �ϳ��ϳ� ������

�������̴ϱ� ��ǥ�׸��� �����غ�.
y=c1, y=c2 ������ ������ �� ��������. x�� �Ÿ� ���� ���� ���� �� �����ϸ� ��.
�ᱹ "�Ÿ� ���� ���� ���� ��!"
�� �ܼ��� ���̵�� ���ٴ�~ �׸��� ���÷�����!

!!��, �ٵ� ������ ���̸� ��ü �� ��.
pair��� ����,,,
*/
int main() {
	int n, m; //p���� q����
	int c1, c2, x;
	int dis = 0;
	int min = INF;
	int cnt = 1;

	scanf("%d %d", &n, &m);
	scanf("%d %d", &c1, &c2);

	for (int i = 0; i < n; i++) {
		scanf("%d", &x);
		points[i] = { x,0 };
	}
	for (int i = n; i < n + m; i++) {
		scanf("%d", &x);
		points[i] = { x,1 };
	}
	sort(points, points + n + m);

	for (int i = 1; i < n + m; i++) {
		if (points[i].second != points[i - 1].second) {
			dis = abs(points[i].first - points[i - 1].first);
			if (dis < min) {
				min = dis;
				cnt = 1;
			}
			else if (dis == min) cnt++;
		}
	}
	dis = min + abs(c1 - c2);
	printf("%d %d\n", dis, cnt);
	return 0;
}