/* 12:25 ~ 1:26 */
#include <stdio.h>
#include <algorithm>
using namespace std;
int list[16] = { 0 };
/*
����?
�ڱ� �ڽ��� �ι谡 �ִ� ���� ����
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

		sort(list, list + index); //����
		cnt = 0;
		for (int i = 0; i <= index; i++) {
			left = 0;
			right = index;
			num = list[i] * 2;
			while (left <= right) { /* ���� Ž������ ��� �ִ��� �Ǻ� */
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