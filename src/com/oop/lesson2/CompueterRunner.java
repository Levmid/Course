package com.oop.lesson2;

public class CompueterRunner {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.printLoad();

        //ctr + p - можем увидить все перегрузки метода

        Computer computer2 = new Computer(1050);
        computer2.printLoad();

        Computer computer3 = new Computer(1003, 12);
        computer3.printLoad();
        computer3.load(true
        );
    }
}
