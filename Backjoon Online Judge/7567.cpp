#include <stdio.h>
#include <string.h>
char str[55];

bool check(char c) {
	if (c == '(') return true;
	else return false;
}

int main() {
	bool flag;
	bool new_flag;
	int height = 10;
	scanf("%s", &str);
	flag = check(str[0]);
	for (int i = 1; i < strlen(str); i++) {
		new_flag = check(str[i]);
		if (flag == check(str[i])) height += 5;
		else height += 10;
		flag = new_flag;
	}
	printf("%d", height);
	return 0;
}