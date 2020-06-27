package d_6June;

class Foo {

    /**
     * 先解释两个概念。
     *
     * 等待池：假设一个线程A调用了某个对象的wait()方法，线程A就会释放该对象的锁后，
     *        进入到了该对象的等待池，等待池中的线程不会去竞争该对象的锁。
     * 	锁池：只有获取了对象的锁，线程才能执行对象的 synchronized 代码，
     * 	     对象的锁每次只有一个线程可以获得，其他线程只能在锁池中等待
     */
    private boolean firstFinished;
    private boolean secondFinished;
    private  Object lock = new Object();//自定义对象


    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        synchronized (lock) {//上锁
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            firstFinished = true;
            /*
            notify() 方法随机唤醒对象的等待池中的一个线程，进入锁池；
            notifyAll() 唤醒对象的等待池中的所有线程，进入锁池
             */
            lock.notifyAll();

        }
    }

    public void second(Runnable printSecond) throws InterruptedException {

        synchronized (lock) {
            while (!firstFinished) {
                lock.wait();
            }

            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            secondFinished = true;
            lock.notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {

        synchronized (lock) {
            while (!secondFinished) {
                lock.wait();
            }

            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }
}
