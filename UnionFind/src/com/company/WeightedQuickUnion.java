package com.company;

/**
 * Created by Rostik on 3/29/2016.
 */
public class WeightedQuickUnion extends QuickUnion {
    private int[] childrenCounts;

    public WeightedQuickUnion(int n) {
        super(n);

        childrenCounts = new int[n];
        for (int i = 0; i < childrenCounts.length; i++) {
            childrenCounts[i] = 0;
        }
    }

    @Override
    public void union(int first, int second) {
        int firstRoot = getRoot(first);
        int secondRoot = getRoot(second);

        if(childrenCounts[firstRoot] > childrenCounts[secondRoot]){
            ids[secondRoot] = firstRoot;
            childrenCounts[firstRoot]++;
        } else {
            ids[firstRoot] = secondRoot;
            childrenCounts[secondRoot]++;
        }
    }
}
