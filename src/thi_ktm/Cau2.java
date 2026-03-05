package thi_ktm;

import java.util.*;

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Lỗi: Số lượng tài liệu không hợp lệ!");
            return;
        }

        List<String> list = new LinkedList<>();
        Set<String> set = new LinkedHashSet<>();
        Map<String, Integer> counts = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String s = sc.next();
            list.add(s);
            set.add(s);
            counts.put(s, counts.getOrDefault(s, 0) + 1);
        }

        System.out.println("Danh sách ban đầu: ");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("Danh sách không trùng: ");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("Tổng số tài liệu bị trùng: " + (n - set.size()));
        // Tìm tài liệu xuất hiện nhiều nhất
        String keyTemp = "";
        int max = 0;
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                keyTemp = entry.getKey();
            }
        }
        System.out.printf("Tài liệu xuất hiện nhiều nhất: %s (%d lần)", keyTemp, max);

    }
}
