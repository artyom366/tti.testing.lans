package linear.sygnal.coding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by artyom on 15.29.9.
 */
public class Triangle {

    public List<Integer> getRow(int rowIndex) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        if (rowIndex < 0)
            return null;

        result.add(1);

        for (int i = 1; i <= rowIndex; i++) {

            for (int j = result.size() - 2; j >= 0; j--) {

                result.set(j + 1, result.get(j) + result.get(j + 1));
            }

            result.add(1);
        }

        return result;
    }
}
