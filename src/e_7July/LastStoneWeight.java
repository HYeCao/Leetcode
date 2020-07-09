package e_7July;

import java.util.Arrays;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        int index = stones.length - 1;
        for(int i = 0; i < stones.length - 1; i++){     //通过stones.length来判断需要操作的次数。（不用将stones.length == 1的情况单独考虑）
            Arrays.sort(stones);                        //将sort放在循环体的开始。（避免在循环体外再写一次重复的sort（））
            stones[index] -= stones[index-1];           //两种不同情况使用同一表达式处理。（）
            stones[index-1] = 0;
        }
        return stones[stones.length-1];
    }
}
/*
class Solution {
    public int lastStoneWeight(int[] stones) {
    //使用优先对列保证每次能拿到最大的数
Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        return (o2 - o1);
    }
});
        for (int i = 0; i < stones.length; i++) {
        queue.offer(stones[i]);
        }
        while(queue.size() > 1) {
        int x = queue.poll();
        int y = queue.poll();
        int diff = Math.abs(x - y);
        if (diff != 0) {
        queue.offer(diff);
        }
        }
        if (queue.isEmpty()) return 0;
        return queue.peek();
        }
        }
 */
