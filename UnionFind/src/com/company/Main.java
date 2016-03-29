package com.company;

public class Main {

    private static Union unionFind;

    public static void main(String[] args) {
        int n = 10;

        unionFind = new UnionFind(n);
//        unionFind = new QuickUnion(n);

        connect(0,1);
        connect(2,3);
        connect(2,5);
        connect(8,2);
        connect(5,9);
        connect(0,9);
        connect(9,1);
        connect(2, 9);
    }

    private static void connect(int p, int q){
        if(!unionFind.connected(p, q)){
            unionFind.union(p, q);
            System.out.println(p + " " + q);
        } else {
            System.out.println(p + " " + q + " are already connected");
        }
    }
}
