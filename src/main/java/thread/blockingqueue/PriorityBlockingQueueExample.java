package thread.blockingqueue;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * 具有优先级的阻塞队列
 */
public class PriorityBlockingQueueExample {


    public static void main(String[] args) throws InterruptedException {

        PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<>();

        Task t1 = new Task();
        t1.setId(3);
        t1.setName("id为3");
        Task t2 = new Task();
        t2.setId(4);
        t2.setName("id为4");
        Task t3 = new Task();
        t3.setId(1);
        t3.setName("id为1");


        queue.add(t1);
        queue.add(t2);
        queue.add(t3);

        System.out.println("容器 : " + queue);
        System.out.println(queue.take());
        System.out.println("容器 : " + queue);
    }
}


class Task implements Comparable<Task> {

    private int id ;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}