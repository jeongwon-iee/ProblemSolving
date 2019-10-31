#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
int N;
string points[100002];
/*
bool cmp(string a, string b) {
	return a < b;
}
*/
int main() {
	scanf("%d", &N);
	for (int i = 0; i <= N; i++) 
		getline(cin, points[i]);
		
	sort(points, points + N + 1);
	for (int i = 0; i <= N; i++)
		cout << points[i] << endl;
	return 0;
}