package lab_01_primes;


import java.util.concurrent.locks.ReentrantLock;

// public class Counter {
//     private int count = 0;
//     private ReentrantLock lock = new ReentrantLock();

//     public int getAndIncrement() {
//         return count++;
//     }
// }


// public class Counter {
//     private int count = 0;
//     private ReentrantLock lock = new ReentrantLock();

//     public int getAndIncrement() {
//         lock.lock();
//         int tmp = count++;
//         lock.unlock();

//         return tmp;
//     }
// }


// public class Counter {
//     private int count = 0;
//     synchronized public int getAndIncrement() {
//         return count++;
//     }
// }


public class Counter {
    private int count = 0;
    private ReentrantLock lock = new ReentrantLock();

    public int getAndIncrement() {
        try{
            lock.lock();
            return count++;
        } finally{
            lock.unlock();
        }
    }
}