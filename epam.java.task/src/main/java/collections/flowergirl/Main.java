package collections.flowergirl;

import collections.flowergirl.controllerqueryprocessing.Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.processUser(new Scanner(System.in));
    }
}
