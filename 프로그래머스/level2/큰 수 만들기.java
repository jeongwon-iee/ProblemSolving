import java.util.*;
class Solution {
    static int totalDigit;
    List<String> list = new ArrayList<>();
    public String solution(String number, int k) {
        totalDigit = number.length()-k;
        StringBuilder subNum = new StringBuilder();
        createSubNumber(subNum, number, 0);
        Collections.sort(list);
        return list.get(list.size()-1);
    }
    
    void createSubNumber(StringBuilder subNum, String number, int index) {
        if(subNum.length() == totalDigit) {
            list.add(subNum.toString());
            return;
        }
        for(int i=index; i<number.length(); i++) {
            subNum.append(number.charAt(i));
            createSubNumber(subNum, number, i+1);
            subNum.deleteCharAt(subNum.length()-1);
        }
    }
}
