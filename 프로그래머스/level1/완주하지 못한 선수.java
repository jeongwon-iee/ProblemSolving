import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> complete = new HashMap<>();
        
        for(String name: completion) {
            if(complete.containsKey(name)) {
                complete.put(name, complete.get(name)+1);
            }
            else complete.put(name, 1);
        }
        
        for(String name: participant) {
            if(!complete.containsKey(name)) return name;
            
            int nums = complete.get(name);
            if(nums == 1) complete.remove(name);
            else complete.put(name, complete.get(name)-1);
        }
        
        return answer;
    }
}
