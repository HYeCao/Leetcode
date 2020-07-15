package e_7July;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 先进先出
 */
class AnimalShelf {
    Queue<int[] > queue;
    public AnimalShelf() {
        queue = new LinkedList<>();
    }

    public void enqueue(int[] animal) {
        queue.add(animal);
    }

    public int[] dequeueAny() {
        if(queue.size() == 0)return new int[]{-1,-1};
        return queue.poll();
    }

    public int[] dequeueDog() {
        if(queue.size() == 0)return new int[]{-1,-1};
        for(int[] an : queue){
            if(an[1] == 1){
                queue.remove(an);
                return an;
            }
        }
        return new int[]{-1,-1};
    }

    public int[] dequeueCat() {
        if(queue.size() == 0)return new int[]{-1,-1};
        for(int[] an : queue){
            if(an[1] == 0){
                queue.remove(an);
                return an;
            }
        }
        return new int[]{-1,-1};
    }
}
