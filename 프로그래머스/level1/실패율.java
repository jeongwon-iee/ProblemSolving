import java.util.*;
import java.util.Map.Entry;

public class Solution {
    static int[] answer;
    static int[] personPerStages; // stage에 도전한 사람 수
    static int[] failed;
    static HashMap<Integer, Double> failureRates = new HashMap<>();

    public static int[] solution(int N, int[] stages) {
        answer = new int[N];
        personPerStages = new int[N + 1];
        failed = new int[N + 1];
        getPersonPerStages(N, stages);
        getFailureRate(N);
        sortByDescFailureRate();
        return answer;
    }

    public static void getPersonPerStages(int N, int[] stages) {
        for (int stage : stages) {
            if (stage > N) {
                stage = N;
            }
            else failed[stage]++;
            for (int i = 1; i <= stage; i++) {
                personPerStages[i]++;
            }
        }
    }

    public static void getFailureRate(int N) {
        for (int stage = 1; stage <= N; stage++) {
            Double failureRate = personPerStages[stage] == 0 ? 0 : failed[stage] * 1.0 / personPerStages[stage];
            failureRates.put(stage, failureRate);
        }
    }

    public static void sortByDescFailureRate() {
        List<Entry<Integer, Double>> entries = new ArrayList<>(failureRates.entrySet());
        entries.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        int i = 0;
        for (Entry<Integer, Double> entry : entries) {
            answer[i++] = entry.getKey();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        int[] stages = new int[]{2, 1, 2, 6, 2, 4, 3, 3};
        solution(N, stages);
    }
}
