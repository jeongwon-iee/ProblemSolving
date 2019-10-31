#include <stdio.h>

int fac(int n) {
	if (n <= 1) return 1;
	return n * fac(n - 1);
}

int main() {
	double e;
	printf("n e\n");
	printf("- -----------\n");
	for (int i = 0; i <= 9; i++) {
		e = 0;
		for (int j = 0; j <= i; j++)
			e += 1.0 / fac(j);
		if (i < 2) printf("%d %.0lf\n", i, e);
		else if (i == 2) printf("%d %.1lf\n", i, e);
		else printf("%d %.9lf\n", i, e);
	}
	return 0;
}