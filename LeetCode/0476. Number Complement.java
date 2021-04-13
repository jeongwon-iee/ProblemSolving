class Solution {
    public int findComplement(int num) {
        String binary = decimalToBinary(num);
        String flipped = flip(binary);
        return binaryToDecimal(flipped);
    }
    String decimalToBinary(int num) {
        StringBuilder binary = new StringBuilder();
        while(num > 0) {
            binary.append(num%2);
            num /= 2;
        }
        return binary.reverse().toString();
    }
    String flip(String binary) {
        StringBuilder flipped = new StringBuilder();
        for(int i=0; i<binary.length(); i++) {
            int n = binary.charAt(i)-'0';
            n ^= 1;
            flipped.append(n);
        }
        return flipped.toString();
    }
    int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for(int i=binary.length()-1; i>=0; i--) {
            if(binary.charAt(i)-'0' == 1) {
                decimal += Math.pow(2, power);   
            }
            power++;
        }
        return decimal;
    }
}
