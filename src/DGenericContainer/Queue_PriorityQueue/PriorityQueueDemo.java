package DGenericContainer.Queue_PriorityQueue;

import java.util.PriorityQueue;

/**
 * @author supremepole
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        //使用lambda表达式
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2); //构建小根堆
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((n1, n2) -> n2 - n1); //构建大根堆

    }
}
