/**
 * Created by gnostix on 7/2/2017.
 */
import edu.princeton.cs.algs4.StdRandom;

import java.util.Random;

public class PercolationClient {
    public static void main(String[] args) {
        Percolation percolation = new Percolation(5);
//        percolation.open(10, 13);

        System.out.println("open sites so far: " + percolation.numberOfOpenSites());
        while(!percolation.isOpen(1,15)){

            int r1 = new Random().nextInt(4);
            int r2 = new Random().nextInt(4);
            System.out.println(r1 + " " + r2);
            percolation.open(r1, r2);
        }
        System.out.println("is open: " + percolation.isOpen(1,5));
    }

}
