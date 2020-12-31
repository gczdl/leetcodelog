package offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Offer59_2 {
    public static void main(String[] args) {

    }

    class MaxQueue {

        Queue<Integer> queue;
        Deque<Integer> deque;

        public MaxQueue() {
            queue = new LinkedList<>();
            deque = new LinkedList<>();
        }

        public int max_value() {
            if(deque.isEmpty()) return -1;
            return deque.peekFirst();
        }

        public void push_back(int value) {
            while (!deque.isEmpty()&&value>deque.peekLast()){
                deque.pollLast();
            }
            queue.offer(value);
            deque.offerLast(value);
        }

        public int pop_front() {
            if(queue.isEmpty()) return -1;
            int poll = queue.poll();
            if(poll==deque.peekFirst()){
                deque.pollFirst();
            }
            return poll;
        }
    }
}
