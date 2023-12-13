package com.cqupt.csp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSP202312_1 {
    static int n, m;
    static List<List<Integer>> bares = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        n = Integer.parseInt(in[0]);
        m = Integer.parseInt(in[1]);
        bares.add(new ArrayList<>());
        for (int i = 1; i <= n; i++) {
            in = br.readLine().split(" ");
            List<Integer> bare = new ArrayList<>();
            for (int j = 0; j < in.length; j++) bare.add(Integer.parseInt(in[j]));
            bares.add(bare);
        }
        for (int i = 1; i <= n; i++) {
            int res = find(bares.get(i));
            System.out.println(res);
        }
    }
    public static int find(List<Integer> bare) {
        for (int i = 1; i < bares.size(); i++) {
            if (check(bare, bares.get(i))) return i;
        }
        return 0;
    }
    public static boolean check(List<Integer> bare, List<Integer> cmp) {
        for (int i = 0; i < bare.size(); i++) {
            if (bare.get(i) >= cmp.get(i)) return false;
        }
        return true;
    }
}
