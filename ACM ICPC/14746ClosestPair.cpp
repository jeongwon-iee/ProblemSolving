#include <cstdio>
#include <math.h>
#include <algorithm>
using namespace std;
typedef pair<int, int> color;
color points[1000002];
#define INF 987654321

/*
p, q 사이 거리가 최소인 (p,q)
거리 = x값차+y값차(절댓값)
p=(x, c1)
q=(x, c2)
중복x

!!시간초과가 계속 뜬다~
for문 두 개 써서 하나하나 비교했음

순서쌍이니까 좌표그림을 생각해봐.
y=c1, y=c2 직선에 점들이 쫙 찍혀있음. x축 거리 차가 가장 작은 거 선택하면 됨.
결국 "거리 차가 가장 작은 거!"
이 단순한 아이디어 였다니~ 그림도 떠올려보자!

!!아, 근데 같은쪽 점이면 합체 못 함.
pair라는 개념,,,
*/
int main() {
	int n, m; //p개수 q개수
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