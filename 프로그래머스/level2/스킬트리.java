public class 스킬트리 {

    static int answer;
    public static int solution(String skill, String[] skill_trees) {
        for (String skill_tree : skill_trees) {
            StringBuilder learned = new StringBuilder();
            for (int i = 0; i < skill_tree.length(); i++) {
                if (skill.contains(String.valueOf(skill_tree.charAt(i)))) {
                    learned.append(skill_tree.charAt(i));
                }
            }
            if (skill.indexOf(learned.toString()) == 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = new String[]{"BACDE", "CBADF", "AECB", "BDA"};
        solution(skill, skill_trees);
        System.out.println("answer = " + answer);
    }
}
