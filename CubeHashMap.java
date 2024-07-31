package lab9;

import java.util.HashMap;
import java.util.Map;

public class CubeHashMap {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 15; i++) {
            map.put(i, i * i * i);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
