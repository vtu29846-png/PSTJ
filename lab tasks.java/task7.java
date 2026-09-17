import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String tag = sc.next();
            map.put(tag, map.getOrDefault(tag, 0) + 1);
        }

        for (String tag : map.keySet()) {
            System.out.println(tag + " " + map.get(tag));
        }
    }
}