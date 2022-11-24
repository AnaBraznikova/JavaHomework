package org.example.game.hero;

public class Elf {

    private String id;
    private String name;
    private int age;
    private boolean magic;
    private double weight;
    private int money;







// getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private boolean isMagic() {
        return magic;
    }

    public double getWeight() {
        return weight;
    }

    public int getMoney() {
        return money;
    }







// setter
    public Elf(String id, String name, int age, boolean magic, double weight, int money) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.magic = magic;
        this.weight = weight;
        this.money = money;
    }




}
