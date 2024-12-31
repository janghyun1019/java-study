package study.quiz;

import java.util.HashMap;

public class Quiz241231 {
	public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        // 참가자 명단을 HashMap에 저장
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        // 완주자 명단을 통해 HashMap에서 값 감소
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        // 값이 0이 아닌 선수 찾기
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        // 테스트 케이스
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        System.out.println(solution(participant1, completion1)); // 출력: "leo"

        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(participant2, completion2)); // 출력: "vinko"

        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant3, completion3)); // 출력: "mislav"
    }
}