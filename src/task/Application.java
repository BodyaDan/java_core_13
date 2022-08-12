package task;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Council council = new Council();
        Scanner scn = new Scanner(System.in);
        int n;

        while (true) {
            showMenu();
            n = scn.nextInt();

            switch (n) {
                case 1:
                    council.addFraction();
                    break;
                case 2:
                    council.removeFraction();
                    break;
                case 3:
                    council.showAllFractions();
                    break;
                case 4:
                    council.clearFraction();
                    break;
                case 5:
                    council.showFraction();
                    break;
                case 6:
                    council.addDeputy();
                    break;
                case 7:
                    council.removeDeputy();
                    break;
                case 8:
                    council.showAllFencers();
                    break;
                case 9:
                    council.showTheBiggestFencer();
                    break;
                default:
                    System.out.println("Щось пішло не так, спробуйте ще раз");
                    break;
            }
        }
    }

    public static void showMenu() {
        System.out.println("\nВведіть 1 щоб додати фракцію");
        System.out.println("Введіть 2 щоб видалити конкретну фракцію");
        System.out.println("Введіть 3 щоб вивести усі  фракції");
        System.out.println("Введіть 4 щоб очистити конкретну фракцію");
        System.out.println("Введіть 5 щоб вивести конкретну фракцію");
        System.out.println("Введіть 6 щоб додати депутата в фракцію");
        System.out.println("Введіть 7 щоб видалити депутата з фракції");
        System.out.println("Введіть 8 щоб вивести список хабарників");
        System.out.println("Введіть 9 щоб вивести найбільшого хабарника");
        System.out.print("Enter: ");
    }
}
