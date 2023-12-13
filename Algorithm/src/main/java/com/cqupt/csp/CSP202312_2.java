package com.cqupt.csp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CSP202312_2 {
    static List<Integer> primes = new ArrayList<>();
    static boolean[] st = new boolean[1000010];
    static int q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 2; i <= 1000000; i++) {
            if (!st[i]) primes.add(i);
            for (int j = i + i; j <= 1000000; j += i) st[j] = true;
        }
        String[] in = br.readLine().split(" ");
        q = Integer.parseInt(in[0]);
        while (q-- > 0) {
            in = br.readLine().split(" ");
            long x = Long.parseLong(in[0]);
            int k = Integer.parseInt(in[1]);
            List<Number> dishu = separate(x, primes).get("dishu");
            List<Number> zhishu = separate(x, primes).get("zhishu");
            double res = 1.0;
            for (int i = 0; i < dishu.size(); i++) {
                if ((int) zhishu.get(i) >= k) {
                    res *= Math.pow(dishu.get(i).doubleValue(), zhishu.get(i).doubleValue());
                }
            }
            System.out.println((long) res);
        }
    }

    public static Map<String, List<Number>> separate(long x, List<Integer> primes) {
        List<Number> dishu = new ArrayList<>();
        List<Number> zhishu = new ArrayList<>();
        for (Integer prime : primes) {
            int d = 0, z = 0;
            while (x % prime == 0) {
                x /= prime;
                d = prime;
                z++;
            }
            if (d != 0) {
                dishu.add(d);
                zhishu.add(z);
            }
        }
        if (x > 1) {
            dishu.add(x);
            zhishu.add(1);
        }
        HashMap<String, List<Number>> map = new HashMap<>();
        map.put("dishu", dishu);
        map.put("zhishu", zhishu);
        return map;
    }
}
