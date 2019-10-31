#include <stdio.h>
int n, m;
long long pizza[1002][1002];
/*
front:�� �࿡�� �ִ� ����
side:�� ������ �ִ� ����

front side view �� ��ġ�鼭 ������ �� �ִ� ���ڹڽ� �ִ� ����
-> �� ���� �ִ�, �� ���� �ִ븸 �� �ǵ帮�� ��.
1��, n,m<=1000

�� ��� �ִ� ã��3000000, �� ���� �ִ�ã��3000000
nlogn���� ����, Ž�� n���� �� �ڻ��� �� ���ϱ�
�װ� �ƴ� max�� ���ϱ�, ���� ���ڰ� �� ��/���� �ִ� �� ó��
������ n*m���� scanf ������ ���� �� max�� ã�� �� ���ڴ�.
00000x,b
*0000a (a,b)
byyyy
(a,b) a
��,,,,,,,,, ���� ����� �� �а� �ڷ��� longlong���� �� �ؼ� Ʋ��,,
longlong ����� �� %lld!
ó���� �ٸ¾����� ��� ������ �ٵ�...
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
	}//�� �� ���� max �����
	
	for (int j = 0; j < m; j++) {
		rmax = 0;
		for (int i = 0; i < n; i++) {
			if (rmax < pizza[i][j]) {
				rmax = pizza[i][j];
				temp = i;
			}
		} /*rmax�� cmax �� ��ġ�� ��*/
		if (pizza[temp][m] != rmax) remove -= rmax;
	}

	printf("%d", remove);
	return 0;
}