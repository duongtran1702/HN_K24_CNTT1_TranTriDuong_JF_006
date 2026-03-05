package thi_ktm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Tách các số điện thoại
        String[] phones = s.replaceAll("[,\\s]+", " ").split(" ");

        String regex = "0\\d{9}";

        // map ánh xạ đầu số -> nhà mạng
        Map<String, String> networks = new HashMap<>();
        networks.put("098", "Viettel");
        networks.put("091", "Vina");
        networks.put("035", "VNPT");

        // map thống kê số lượng
        Map<String, Integer> count = new HashMap<>();
        count.put("Viettel",0);
        count.put("Vina",0);
        count.put("VNPT",0);

        for (String phone : phones) {
            if (phone.matches(regex)) {
                String prefix = phone.substring(0, 3);
                String network = networks.get(prefix);

                if (network != null)
                    count.put(network, count.getOrDefault(network, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
