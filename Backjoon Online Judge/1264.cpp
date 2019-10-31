/*
BOJ 1264
ACM-ICPC New Zealand Regional 2006
The number of vowels
*/
#include <stdio.h>
#include <string.h>
char sentence[257];

int main() {
	while (true) {
		int cnt = 0;
		fgets(sentence, 257, stdin);
		if (sentence[0] == '#') break;
		int len = strlen(sentence);
		for (int i = 0; i < len; i++) {
			if (sentence[i] >= 65 && sentence[i] <= 96)sentence[i] += 32; //to lower case
			if (sentence[i] == 'a' || sentence[i] == 'e' || sentence[i] == 'i' || sentence[i] == 'o' || sentence[i] == 'u')
				cnt++;
		}
		printf("%d\n", cnt);
	}
	return 0;
}