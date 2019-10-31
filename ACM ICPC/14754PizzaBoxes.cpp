#include <stdio.h>
int n, m;
long long pizza[1002][1002];
/*
front:각 행에서 최대 높이
side:각 열에서 최대 높이

front side view 안 헤치면서 제거할 수 있는 피자박스 최대 개수
-> 각 열의 최대, 각 행의 최대만 안 건드리면 됨.
1초, n,m<=1000

각 행당 최댓값 찾기3000000, 각 열당 최댓값찾기3000000
nlogn으로 정렬, 탐색 n으로 젤 뒤빼고 쭉 더하기
그거 아님 max에 더하기, 같은 숫자가 한 행/열에 있는 것 처리
어차피 n*m으로 scanf 받으니 받을 때 max를 찾는 게 낫겠다.
00000x,b
*0000a (a,b)
byyyy
(a,b) a
아,,,,,,,,, 문제 제대로 안 읽고 자료형 longlong으로 안 해서 틀림,,
longlong 출력할 땐 %lld!
처음에 다맞았으면 기분 좋았을 텐데...
*/
int main() {
	scanf("%d %d", &n, &m);
	long long cmax = 0; //for column
	long long rmax = 0; //for row
	long long remove = 0;
	int temp = 0;
	for (int i = 0; i < n; i++) {
		cmax = 0;
		for (int j = 0; j < m; j++) {
			scanf("%d", &pizza[i][j]);
			remove += pizza[i][j];
			if (cmax < pizza[i][j]) {
				cmax = pizza[i][j];
			}
		}
		pizza[i][m] = cmax;
		remove -= cmax;
	}//각 행 끝에 max 저장됨
	
	for (int j = 0; j < m; j++) {
		rmax = 0;
		for (int i = 0; i < n; i++) {
			if (rmax < pizza[i][j]) {
				rmax = pizza[i][j];
				temp = i;
			}
		} /*rmax와 cmax 안 겹치면 뺌*/
		if (pizza[temp][m] != rmax) remove -= rmax;
	}

	printf("%d", remove);
	return 0;
}