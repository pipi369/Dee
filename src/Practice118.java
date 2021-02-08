import java.util.ArrayList;
import java.util.List;

public class Practice118 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows < 1) {
            return result;
        }

        List<Integer> head = new ArrayList<>(1);
        head.add(1);
        result.add(head);

        for (int i = 1; i < numRows; i++) {
            List<Integer> pre = result.get(i - 1);
            List<Integer> row = new ArrayList<>(i + 1);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(pre.get(j - 1) + pre.get(j));
                }
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = generate(10);

        for (List<Integer> integers : result) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

}
