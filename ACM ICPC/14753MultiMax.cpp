#include <stdio.h>
#include <algorithm>
#include <math.h>
using namespace std;
int n;
int cards[10002];
/*
정수가 적힌 n(3~만)장의 카드 (같은 숫자가 2개 이상일 수)
곱이 최대인 2or3장을 골라
5 10 -2 3 5 2
3장 고르면 10 5 5 ->250
10 0 -5 2
두 장 고르면 10 2 ->20
두 장 골랐을 때 다음 카드가 0초과 인지 확인

!!!!!!!!!!!!오름차순으로 정리해놓고 제일 앞에 거가 MAX인 줄 앎
앞으론 제출 전에 문제에 없는 testcase제발 한 번 생각해보고 제출하자.
!!!!!!!!!!!!!!!!!!!덧셈도 아니고 음수곱하면 무조건 작아질 줄 알았다.
정수니까, 음수 두 번 곱하면 더 커짐!
두번 곱한 게 이미 음수면 한 번 더 곱해야하는 거임
아 근데 그건 if (mult*cards[i] > mult) mult *= cards[i];
이 조건으로 되지 않나?

<반례>
-3 -2 0 1 7
여기서 답 42임. 정렬해서 고르는 게 아닌 거 충격적.

그냥 차근차근 생각해보자.
위 같은 반례는 음수가 두 개 이상일 때만 발생할 수 있음.

오름차순으로 정렬해 가장 큰 값 두 개 곱한 수와 
가장 큰 값 세 개 곱한 수 중 더 큰 것을 MAX로 갖고 있는다.

음수가 두 개 이상일 때는 음수 두 개 곱한 값과 MAX 중 큰 값을 MAX에
그 음수 두 개와 가장 큰 양수곱한 값과 MAX 중 큰 값 MAX에
*/
int main() {
	scanf("%d", &n);
	int mult = 1;
	int MAX;
	for (int i = 0; i < n; i++) {
		scanf("%d", &cards[i]);
	}
	sort(cards, cards + n);

	/*가장 큰 값 두 개 vs 가장 큰 값 세 개*/
	MAX = max(cards[n - 1] * cards[n - 2], cards[n - 1] * cards[n - 2] * cards[n - 3]);
	/*음수가 두 개 이상일 때*/
	if (cards[0] < 0 && cards[1] < 0) {
		MAX = max(cards[0] * cards[1], MAX);
		/*그 값과 가장 큰 양수 곱한 값*/
		if (cards[n - 1] > 0) MAX = max(cards[0] * cards[1] * cards[n - 1], MAX);
	}
	printf("%d\n", MAX);
	return 0;
}