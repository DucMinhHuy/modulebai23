package thuchanh3;

import java.util.Scanner;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject=new Subject();
        new OctObserver(subject);
        new BinObserver(subject);
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number :");
            subject.setState(sc.nextInt());
        }
    }
}
