package task;

import java.util.ArrayList;
import java.util.Scanner;

public class Council {
    Scanner scn = new Scanner(System.in);
    ArrayList<Fraction> fractions = new ArrayList<Fraction>();

    public void addFraction() {
        System.out.print("Введіть назву фракції: ");
        String name = scn.next();
        fractions.add(new Fraction(name));
        System.out.println("Фракція додана!");
    }

    public void removeFraction() {
        while (true) {
            System.out.println("Введіть назву фракції для видалення");
            String name = scn.next();
            try {
                System.out.println("Фракція " + fractions.get(getIndexByName(name)).nameOfFraction + " видалена");
                fractions.remove(getIndexByName(name));
                break;
            } catch (Exception e) {
                System.out.println("Скоріш за все не вірна назва, спробуйте ще раз");
            }
        }
    }

    public void showAllFractions() {
        System.out.println("Всі фрації:");
        for (Fraction f : fractions)
            System.out.println(f.nameOfFraction + " у якій к-сть депутатів - " + f.deputies.size());
    }

    public void showFraction() {
        while (true) {
            System.out.println("Введіть назву фракції");
            String name = scn.next();
            try {
                System.out.println(fractions.get(getIndexByName(name)).deputies.size() + " к-сть депутатів фрації \"" +
                        fractions.get(getIndexByName(name)).nameOfFraction + "\"");
                break;
            } catch (Exception e) {
                System.out.println("Скоріш за все не вірна назва, спробуйте ще раз");
            }
        }
    }

    public void addDeputy() {
        while (true) {
            System.out.println("Введіть назву фракції до якої потрібно добавити депутата");
            String name = scn.next();
            try {
                fractions.get(getIndexByName(name)).addDeputy();
                break;
            } catch (Exception e) {
                System.out.println("Скоріш за все не вірна назва, спробуйте ще раз");
            }
        }
    }

    public void removeDeputy() {
        while (true) {
            System.out.println("Введіть назву фракції у якій потрібно вигнати депутата");
            String name = scn.next();
            try {
                fractions.get(getIndexByName(name)).removeDeputy();
                break;
            } catch (Exception e) {
                System.out.println("Скоріш за все не вірна назва, спробуйте ще раз");
            }
        }
    }

    public void showAllFencers() {
        while (true) {
            System.out.println("Введіть назву фракції хабарників якої потрібно показати");
            String name = scn.next();
            try {
                fractions.get(getIndexByName(name)).showFencers();
                break;
            } catch (Exception e) {
                System.out.println("Скоріш за все не вірна назва, спробуйте ще раз");
            }
        }
    }

    public void showTheBiggestFencer() {
        while (true) {
            System.out.println("Введіть назву фрації хабарник якої бере найбільше: ");
            String name = scn.next();
            try {
                fractions.get(getIndexByName(name)).showTheBiggestFencer();
                break;
            } catch (Exception e) {
                System.out.println("Скоріш за все не вірна назва, спробуйте ще раз");
            }
        }
    }

    public void showDeputies() {
        while (true) {
            System.out.println("Введіть назву фрації щоб вивести її всіх депутатів");
            String name = scn.next();
            try {
                fractions.get(getIndexByName(name)).showAllDeputies();
                break;
            } catch (Exception e) {
                System.out.println("Скоріш за все не вірна назва, спробуйте ще раз");
            }
        }
    }

    public void clearFraction() {
        while (true) {
            System.out.println("Введіть назву фрації яку потрібно очистити");
            String name = scn.next();
            try {
                fractions.get(getIndexByName(name)).clearAllFraction();
                break;
            } catch (Exception e) {
                System.out.println("Скоріш за все не вірна назва, спробуйте ще раз");
            }
        }
    }

    private int getIndexByName(String name) {
        int index = 0;
        var iterator = fractions.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().nameOfFraction.equalsIgnoreCase(name))
                return index;
            index++;
        }
        return -1;
    }
}
