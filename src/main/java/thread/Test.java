package thread;

/**
 * Created by bingye on 2019-04-23
 */
public class Test {

    public static void main(String[] args) {

//        RunnableDemo R1 = new RunnableDemo("Thread-1");
//        R1.start();
//        RunnableDemo R2 = new RunnableDemo("Thread-2");
//        R2.start();


        ThreadDemo t1 = new ThreadDemo("Thread-1");
        t1.start();
        ThreadDemo t2 = new ThreadDemo("Thread-2");
        t2.start();

    }
}
