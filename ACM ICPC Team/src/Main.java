import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println(acmTeam(new ArrayList<>(List.of("10101",
                "11100",
                "11010",
                "00101"))));

    }

    public static List<Integer> acmTeam(List<String> topic) {
        // Write your code here

        int maxTeams = 0;
        int maxSkills = 0;

        for(int i = 0; i < topic.size() - 1; i++) {
            for(int j = i + 1; j < topic.size(); j++) {
                int skills = 0;
                for(int k = 0; k < topic.get(i).length(); k++) {
                    if(topic.get(i).charAt(k) == '1' || topic.get(j).charAt(k) == '1') {
                        skills++;
                    }
                }

                if(skills > maxSkills) {
                    maxSkills = skills;
                    maxTeams = 1;
                } else if(skills == maxSkills) {
                    maxTeams++;
                }
            }
        }

        return new ArrayList<>(List.of(maxSkills, maxTeams));
    }
}