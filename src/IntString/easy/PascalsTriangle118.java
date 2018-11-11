package IntString.easy;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();
        row.add(0, 1);
        allrows.add(row);

        for (int i = 1; i < numRows; i++) {
            row = allrows.get(allrows.size() - 1);
            List<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(1);
            for (int j = 1; j < row.size(); j++) {
                list.add(j, row.get(j - 1) + row.get(j));

            }
            allrows.add(list);
        }


        return allrows;
    }

    public static void main(String[] args) {
        System.out.println(generate(9));
    }
}
