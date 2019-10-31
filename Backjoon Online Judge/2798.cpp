#include <stdio.h>
#include <algorithm>
using namespace std;
int N, M;
int sum = 0;
int Max = 0;
int cards[101] = { 0 };
bool used[101] = { 0 };

void pickCards(int high, int index) {
	/* function that outputs the sum of the three cards that does not exceed M and is closest to M */
	//index: the number of cards, high: the largest number card
	if (index == 3 && sum <= M) {
		if (Max <= sum) 
			Max = sum;
		return;
	}
	else if (index == 3 || sum > M) return;

	for (int i = high; i >= 0; i--) {
		if (sum + cards[i] <= M && used[i] == 0) {
			sum += cards[i];
			used[i] = 1;
		}
		else continue;
		pickCards(high - 1, index + 1);
		sum -= cards[i];
		used[i] = 0;
	}
}

int main() {
	scanf("%d %d", &N, &M);
	for (int i = 0; i < N; i++) scanf("%d", &cards[i]);
	sort(cards, cards + N);
	pickCards(N-1, 0);
	printf("%d\n", Max);
	return 0;
}