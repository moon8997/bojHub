import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        HashMap<String, Integer> reportCount = new HashMap<>();
        HashSet<String> bannedUsers = new HashSet<>();
        HashMap<String, Integer> mailCount = new HashMap<>();

        // 각 유저가 신고한 정보를 reportMap에 저장
        for (String reportEntry : report) {
            String[] temp = reportEntry.split(" ");
            String reporter = temp[0];
            String reportee = temp[1];

            if (!reportMap.containsKey(reportee)) {
                reportMap.put(reportee, new HashSet<>());
            }

            // 한 유저가 같은 유저를 여러 번 신고한 경우는 1회로 처리
            if (!reportMap.get(reportee).contains(reporter)) {
                reportMap.get(reportee).add(reporter);

                // 각 유저가 신고당한 횟수 기록
                reportCount.put(reportee, reportCount.getOrDefault(reportee, 0) + 1);
            }
        }

        // 정지된 유저 찾기
        for (String reportedUser : reportCount.keySet()) {
            if (reportCount.get(reportedUser) >= k) {
                bannedUsers.add(reportedUser);
            }
        }

        // 각 유저가 정지된 유저에게 보낸 메일 횟수 기록
        for (String reportedUser : bannedUsers) {
            for (String reporter : reportMap.get(reportedUser)) {
                mailCount.put(reporter, mailCount.getOrDefault(reporter, 0) + 1);
            }
        }

        // 결과 배열 생성
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCount.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}
