/*
BOJ 1431 
Sort & Parsing
Serial Number
*/
#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

bool cmp(const string& a, const string& b) {
	if (a.size() != b.size()) //1. Shortest in length
		return a.size() < b.size();
	else if (a.size() == b.size()) { //2. if the length is the same, smallest sum
		int a_sum = 0;
		int b_sum = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a[i] >= '0' && a[i] <= '9') a_sum += a[i] - '0';
			if (b[i] >= '0' && b[i] <= '9') b_sum += b[i] - '0';
		}
		if (a_sum != b_sum) return a_sum < b_sum;
	}
	
	return a < b; //3. if the sum is the same, in alphabetical order
}

int main() {
	int N;
	string num[1001];

	scanf("%d", &N);
	for (int i = 0; i < N; i++) cin >> num[i];
	sort(num, num + N, cmp); //cmp대로 정렬
	for (int i = 0; i < N; i++) cout << num[i] + "\n";
	return 0;
}