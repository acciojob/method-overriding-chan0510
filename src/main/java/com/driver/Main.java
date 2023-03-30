package com.driver;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static class B extends A {
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.meth());
    }
  
}
