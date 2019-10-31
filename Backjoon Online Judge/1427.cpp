/*
BOJ 1427
Sort Inside
*/
#include <stdio.h>
#include <string.h>
#include <algorithm>
using namespace std;
char str[12];
int N[12];

bool desc(int a, int b) {
	return a > b;
}

int main() {
	scanf("%s", &str);
	int len = strlen(str);
	for (int i = 0; i < len; i++)
		N[i] = str[i] - '0';
	sort(N, N + len, desc);
	for (int i = 0; i < len; i++)
		printf("%d", N[i]);
	printf("\n");
	return 0;
}