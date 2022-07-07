package com;
class Arithmetic {  //super class
    public int add(int a, int b) {  //method of super class
        int sum = a + b; 
        return sum;
    }
}
class Adder extends Arithmetic {   //sub class 
    public int callAdd(int a, int b) {   //method of sub class
        return add(a, b);
    }
    public static void main(String []args) {
        Adder a = new Adder();  // Create object of child class
        System.out.print(a.add(30,20)); 
     }
}

