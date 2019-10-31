#include <stdio.h>
#include <string.h>

int main() {
	char str[102];
	char short_str[102];
	int len;
	int index = 0;
	scanf("%s", &str);
	len = strlen(str);

	for (int i = 0; i < len; i++) {
		if (str[i] >= 65 && str[i] <= 96) short_str[index++] = str[i];
	}
	short_str[index] = '\0';
	printf("%s", short_str);
	return 0;
}