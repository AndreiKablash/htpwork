package com.htp.shieldt;
    class Recurs {
        int fact(int n) {
            int result;

            if (n == 1) return 1;
            else result = fact(n - 1) * n;
            return result;
        }
    }

    public class Facrotial {
        public static void main(String args[]) {
            Recurs f= new Recurs();
            System.out.println(f.fact(2));
            System.out.println(f.fact(3));
        }
    }
