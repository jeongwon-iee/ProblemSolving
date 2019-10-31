/* 12:25 ~ 1:26 */
#include <stdio.h>
#include <algorithm>
using namespace std;
int list[16] = { 0 };
/*
정렬?
자기 자신의 두배가 있는 수의 개수
scan O(225)
*/
int main() {
	
	int index;
	int n = 0;
	int left, right, mid;
	int num;
	int cnt;

	while(n != -1) {
		int index = 1;
		scanf("%d", &n);
		if (n == -1) break;
		list[0] = n;

		while (true) {
			scanf("%d", &list[index]);
			if (list[index] == 0) break;
			index++;
		} 

		sort(list, list + index); //정렬
		cnt = 0;
		for (int i = 0; i <= index; i++) {
			left = 0;
			right = index;
			num = list[i] * 2;
			while (left <= right) { /* 이진 탐색으로 배수 있는지 판별 */
				mid = (left + right) / 2;
				if (list[mid] < num) left = mid + 1;
				else if (list[mid] == num) {
					cnt++;
					break;
				}
				else right = mid - 1;
			}
		}
		printf("%d\n", cnt);
	}
	return 0;
}