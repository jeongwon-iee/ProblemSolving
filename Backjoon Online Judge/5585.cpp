#include <stdio.h>

int main() {
	int price;
	int sol = 0;
	int coin[6] = { 500,100,50,10,5,1 };
	scanf("%d", &price);
	price = 1000 - price;
	for (int i = 0; i < 6; i++) {
		if (price >= coin[i])
			sol += (price / coin[i]);
		price %= coin[i];
	}
	printf("%d\n", sol);
	return 0;
}