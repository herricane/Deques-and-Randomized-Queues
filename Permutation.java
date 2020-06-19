import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Permutation {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        RandomizedQueue<String> rq = new RandomizedQueue<>();

        // while (!StdIn.isEmpty()) {
        //     rq.enqueue(StdIn.readString());
        // }
        // for (int i = 0; i < num; i++) {
        //     StdOut.println(rq.dequeue());
        // }

        int count = 0;
        if (num == 0) return;
        while (!StdIn.isEmpty()) {
            count++;
            String in = StdIn.readString();
            if (count <= num) {
                rq.enqueue(in);
            }
            if (count > num && StdRandom.uniform(count) < num) {
                rq.dequeue();
                rq.enqueue(in);
            }
        }
        for (int i = 0; i < num; i++) {
            StdOut.println(rq.dequeue());
        }
    }
}
