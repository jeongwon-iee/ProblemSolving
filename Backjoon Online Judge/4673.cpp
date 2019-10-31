#include <stdio.h>
char check[10001] = { '\0' };

int main() {
	int num;
	int dn;
	for (int i = 1; i <= 9972; i++) {
		num = i;
		dn = num; 
		while (num > 0) {
			dn += num % 10;
			num /= 10;
		}
		check[dn] = '*';
	}
	for (int i = 1; i <= 10000; i++) {
		if (check[i] == '\0')
			printf("%d\n", i);
	}
	return 0;
}