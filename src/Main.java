import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Vera Lifanova
 * Date: 05.05.2022
 */

public class Main {
    public static void processCollection() {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> resultList = new ArrayList<>();
        for (Integer item : intList) {
            if (item > 0 && item % 2 == 0) {
                resultList.add(item);
            }
        }

        Collections.sort(resultList);

        for (Integer item : resultList) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        System.out.println("Обрабатываем числа обычным образом");
        processCollection();
        // То же самое, но со streams
        System.out.println("Обрабатываем числа с помощью streams");
        StreamMain.processStream();
    }
}
