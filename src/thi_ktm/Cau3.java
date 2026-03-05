package thi_ktm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<String> q = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < 5; i++) {
            q.offer(sc.next());
        }
        System.out.println("Bắt đầu in: ");

        while (!q.isEmpty()) {
            String tmp = q.poll();
            System.out.println("Đang in: " + tmp);
            stack.push(tmp);
        }
        System.out.println("Lịch sử in: ");

        while (!stack.isEmpty()) {
            String tmp = stack.pop();
            System.out.println(tmp);
        }
    }
}
