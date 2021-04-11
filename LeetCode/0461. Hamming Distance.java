class Solution {
    public int hammingDistance(int x, int y) {
        int distance = 0;
        String binX = decimalToBinary(x);
        String binY = decimalToBinary(y);
        int p = binX.length()-1;
        int q = binY.length()-1;
        while(p >= 0 || q >= 0) {
            char a = (p < 0)? '0': binX.charAt(p);
            char b = (q < 0)? '0': binY.charAt(q);
            if(a != b) distance++;
            p--;
            q--;
        }
        return distance;
    }
    
    String decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while(n>0) {
            binary.append(n%2);
            n/=2;
        }
        return binary.reverse().toString();
    }
}
