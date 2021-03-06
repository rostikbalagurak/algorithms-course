package com.company;


public class UnionFind implements Union{

    private int[] ids;

    public UnionFind(int n) {
        ids = new int[n];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = i;
        }
    }

    public void union(int p, int q){
        int pid = ids[p];
        int qid = ids[q];

        for (int i = 0; i < ids.length; i++) {
            if(ids[i] == qid){
                ids[i] = pid;
            }
        }
    }

    public boolean connected(int p, int q){
        return ids[p] == ids[q];
    }
}
