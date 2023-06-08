package com.driver;

import java.util.Scanner;

public class Main {
    public static class Product{
        public int product(int x, int y) {
            return x *y;
        }
        public int product(int x, int y, int z) {
            int ans = product(x,y);
            return  ans * z;
        }
        public double product(double x, double y) {
            return x *y;
        }

    }
    public static void main(String[] args) {

        // Creating object of product class
        Product p = new Product();

        // calling the methods of product class
        System.out.println("Product of 2 and 3 : " + p.product(2,3));
        System.out.println("Product of 2 , 3 and 4 : " + p.product(2,3,4));
        System.out.println("Product of 5.5  and  3.0 : " +p.product(5.5,3.0));
    }

}