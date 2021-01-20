class Solution {
    public String solution(String[] seoul) {
        int x = 0;
        for(String name : seoul) {
            if(name.equals("Kim")) {
                return "김서방은 "+x+"에 있다";
            }
            x++;
        }
        return "김서방은 없다";
    }
}
