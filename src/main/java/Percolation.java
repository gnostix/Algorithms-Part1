/**
 * Compilation:  javac Percolation.java
 * Execution:    java Percolation
 * <p>
 * Created by gnostix on 7/2/2017.
 */


/**
 * Created by gnostix on 7/2/2017.
 */

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private static WeightedQuickUnionUF matrix;

    public Percolation(int n) {
        matrix = new WeightedQuickUnionUF(n);

    }             // create n-by-n grid, with all sites blocked

    public static void main(String[] args) {
    }

    public void open(int row, int col) {
        matrix.union(row, col);
    }    // open site (row, col) if it is not open already

    public boolean isOpen(int row, int col) {
        return matrix.connected(row, col);
    }  // is site (row, col) open?

    public boolean isFull(int row, int col) {
        return true;
    }  // is site (row, col) full?

    public int numberOfOpenSites() {
        return matrix.count();
    }       // number of open sites

    public boolean percolates() {
        return true;
    }              // does the system percolate?
}
