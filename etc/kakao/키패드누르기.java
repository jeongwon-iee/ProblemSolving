class Solution {
    public static int[] leftPosition = {3,0};
    public static int[] rightPosition = {3,2};
    public static int[][] phone = {{3,1},{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}};
    
    public String getTouchedHand(int number, String hand) {
        switch(number) {
            case 1:
            case 4:
            case 7: {
                leftPosition[0]=phone[number][0];
                leftPosition[1]=phone[number][1];
                return "L";
            }
            case 3:
            case 6:
            case 9: {
                rightPosition[0]=phone[number][0];
                rightPosition[1]=phone[number][1];
                return "R";
            }
        }
        return getMinDistanceHand(number, hand);
    }
    
    public String getMinDistanceHand(int number, String hand) {
        int leftDistance=0;
        int rightDistance=0;
        
        leftDistance += Math.abs(phone[number][0]-leftPosition[0]);
        leftDistance += Math.abs(phone[number][1]-leftPosition[1]);
                                 
        rightDistance += Math.abs(phone[number][0]-rightPosition[0]);
        rightDistance += Math.abs(phone[number][1]-rightPosition[1]);
        
        if (leftDistance < rightDistance || (leftDistance == rightDistance && hand.equals("left"))) {
            leftPosition[0]=phone[number][0];
            leftPosition[1]=phone[number][1];
            return "L";
        } 
        
        rightPosition[0]=phone[number][0];
        rightPosition[1]=phone[number][1];
        return "R";
    }
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        for(int i=0;i<numbers.length;i++) {
            answer += getTouchedHand(numbers[i], hand);
        }
        return answer;
    }
}
