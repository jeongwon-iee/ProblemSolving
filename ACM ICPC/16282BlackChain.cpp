#include <stdio.h>
#include <math.h>
long long n;
/*
고리 하나 무게는 1g
최소 개의 고리만 풀어
1g부터 n(10^18)g 까지 가능한 "모든 무게"를 생성

1 생성하려면 하나짜리는 무조건 풀어야함
2 생성하려면 1+1이거나 2여야하는데 1짜리를 두 개 만들 이유가,, 그럼 3번 풀어야하나?
3 3풀면 생성 됨 //3을 풀면 여기까지만 생성 됨
4 3옆의 네 개 짜리? 
한 개 풀면 상한선 7
()() () ()()()() 

두 개 풀기 - 하나짜리가 두 개 생기니까 앞에 2가 올 이유가x. 세 개
()()() () ()()()()()() () ()()()()()()()()()()()()
x+1 2*x+1 4*x+1 8*x+1
(x+1)(1+2+4+8+...2*x) + x
(x+1)(2^(x+1)-1)+x
등비수열의 합인데 이거 계산을 엄청 오래함..
두 개 풀면 상한선 23
*/

int main() {
	scanf("%lld", &n);

	for (int i = 1; i <= 65; i++) { //고리 x개
		if (n <= (i + 1)*(pow(2, i + 1) - 1) + i) {
			printf("%d\n", i);
			return 0;
		}
	}
}
