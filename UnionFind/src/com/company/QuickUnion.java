package com.company;

public class QuickUnion implements Union{
    protected int[] ids;

    public QuickUnion(int n) {
        ids = new int[n];

        for (int i = 0; i < ids.length; i++) ids[i] = i;
    }

    public void union(int p, int q){
        ids[getRoot(q)] = getRoot(p);
    }

    protected int getRoot(int i){
        while (i != ids[i]){
            ids[i] = ids[ids[i]];
            i = ids[i];
        }
        return i;
    }

    public boolean connected(int first, int second){
        return getRoot(first) == getRoot(second);
    }
}
