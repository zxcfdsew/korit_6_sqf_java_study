package com.study.java_study.ch04_제어;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class test {
    public static void main(String[] args) {
        System.out.println(solution(2, 10, new int[]{7, 4, 5, 6}));
    }

    static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int index = 0;
        int queueWeight = 0;
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < bridge_length; i++) {
            queue.offer(0);
        }

        while (result.size() < truck_weights.length) {
            if (index < truck_weights.length && queueWeight + truck_weights[index] <= weight) {
                queue.offer(truck_weights[index]);
                queueWeight += truck_weights[index];
                index++;
            } else {
                queue.offer(0);
            }
            int out = queue.poll();
            if (out != 0) {
                result.add(out);
                queueWeight -= out;
            }
            answer++;
            System.out.println(queue);
        }

        return answer;
    }
}
