package array.combinations;

import java.util.*;

public class SmallestSufficientTeam1125 {
    List<Integer> sol = null;

    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
        Map<String, Integer> idx = new HashMap<String, Integer>();
        int n = 0;
        for (String skill : req_skills) idx.put(skill, n++);
        int[] pe = new int[people.size()];
        for (int i = 0; i < people.size(); i++)
            for (String skill : people.get(i)) {
                pe[i] += (1 << idx.get(skill));
            }
        find(0, new ArrayList<Integer>(), n, pe);
        return sol.stream().mapToInt(Integer::intValue).toArray();
    }


    private void find(int cur, List<Integer> onesol, int n, int[] pe) {
        if (sol != null && onesol.size() > sol.size()) return;
        if (cur == (1 << n) - 1) {
            sol = new ArrayList<>(onesol);
            return;
        }
        int zeroCnt = 0;
        while (((cur >> zeroCnt) & 1) == 1) zeroCnt++;
        for (int i = 0; i < pe.length; i++) {
            if (((pe[i] >> zeroCnt) & 1) == 1)
                onesol.add(i);
            else continue;
            find(cur | pe[i], onesol, n, pe);

            onesol.remove(onesol.size()-1);

        }
    }
}
