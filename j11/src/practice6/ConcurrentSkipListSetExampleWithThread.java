package practice6;

import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetExampleWithThread {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> skipListSet = new ConcurrentSkipListSet<>();

        // Create threads for adding and removing elements
        AddThread addThread = new AddThread(skipListSet);
        RemoveThread removeThread = new RemoveThread(skipListSet);

        // Start the threads
        addThread.start();
        removeThread.start();

        // Wait for the threads to finish
        try {
            addThread.join();
            removeThread.join();
        } catch (InterruptedException e) {
            System.out.println(e);;
        }

        // Print the final content of the set
        System.out.println("Final Set: " + skipListSet);
    }
}

// Thread class for adding elements to the ConcurrentSkipListSet
class AddThread extends Thread {
    private final ConcurrentSkipListSet<Integer> set;

    public AddThread(ConcurrentSkipListSet<Integer> set) {
        this.set = set;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            set.add(i);
            System.out.println("Added: " + i);
            try {
                AddThread.sleep(50); // Simulate some delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Thread class for removing elements from the ConcurrentSkipListSet
class RemoveThread extends Thread {
    private final ConcurrentSkipListSet<Integer> set;

    public RemoveThread(ConcurrentSkipListSet<Integer> set) {
        this.set = set;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            set.remove(i);
            System.out.println("Removed: " + i);
            try {
                RemoveThread.sleep(100); // Simulate some delay
            } catch (InterruptedException e) {
                System.out.println(e);;
            }
        }
    }
}




