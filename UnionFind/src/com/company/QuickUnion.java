package com.company;

public class QuickUnion implements Union{
    private int[] ids;

    public QuickUnion(int n) {
        ids = new int[n];

        for (int i = 0; i < ids.length; i++) ids[i] = i;
    }

    public void union(int p, int q){
        ids[getRoot(q)] = getRoot(p);
    }

    private int getRoot(int i){
        while (i != ids[i]){
            i = ids[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return getRoot(p) == getRoot(q);
    }
}
