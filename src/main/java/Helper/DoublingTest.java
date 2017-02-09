package Helper;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;
import edu.princeton.cs.introcs.Stopwatch;

/**
 * Created by rebel on 2/8/17.
 */
public class DoublingTest {

    public static  double timeTrial(int N)
    {
        int MAX = 100000;
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = StdRandom.uniform(-MAX, MAX);
        }

        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.count(a);

        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        for(int N = 250; true; N += N){
            double time = timeTrial(N);
            StdOut.printf("%7d %5.1f\n",N, time);
        }
    }
}
