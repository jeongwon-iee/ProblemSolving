#include <stdio.h>
#include <string.h>

int main() {
	char str[102];
	int len = 0;
	int here;
	scanf("%s", &str);
	len = strlen(str);
	for (int ascii = 97; ascii < 123; ascii++) {
		for (here = 0; here < len; here++) {
			if (str[here] == ascii) {
				printf("%d ", here);
				break;
			}
		}
		if (here == len) printf("-1 ");
	}

	return 0;
}