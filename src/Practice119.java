import java.util.ArrayList;
import java.util.List;

public class Practice119 {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex);
        if (rowIndex < 0) {
            return row;
        }

        row.add(1);
        for (int i = 1; i < rowIndex; i++) {
            row.add(1);
            for (int j = 0; j <= i; j++) {
                if (j != 0 && j != i) {
                    row.set(j, row.get(j - 1) + row.get(j));
                }
            }
        }

        return row;
    }

    public static void main(String[] args) {
        List<Integer> result = getRow(4);
        result.forEach(ref -> System.out.print(ref + " "));
        System.out.println();
    }

}
