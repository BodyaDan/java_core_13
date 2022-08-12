package task;

import java.util.Scanner;

public class Deputy extends Human{
    String name, lastname, nameOfFraction;
    int age, fenceCount;
    boolean fencer;

    public Deputy(double weight, double height, String name, String lastname, int age, boolean fencer, String nameOfFraction) {
        super(weight, height);
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.fencer = fencer;
        this.nameOfFraction = nameOfFraction;
    }

    public void fence() {
        if (!fencer)
            System.out.println("Цей депутат не бере хабарів");
        else {
            Scanner scn = new Scanner(System.in);
            System.out.println("Введіть суму хабаря: ");
            int count = scn.nextInt();
            if (count > 5000)
                System.out.println("Поліція ув'язнить депутата");
            else
                fenceCount = count;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFenceCount() {
        return fenceCount;
    }

    public void setFenceCount(int fenceCount) {
        this.fenceCount = fenceCount;
    }

    public boolean isFencer() {
        return fencer;
    }

    public void setFencer(boolean fencer) {
        this.fencer = fencer;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", fenceCount=" + fenceCount +
                ", fencer=" + fencer +
                '}';
    }
}
