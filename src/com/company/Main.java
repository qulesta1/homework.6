package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setName("Tanos");
        boss.setHp(1000);
        boss.setDamage(150);
        boss.setUlta("bankai!!!");
        boss.setWeapon(new Weapon("Sniper", "avm"));
        System.out.println("Name: " +boss.getName() + " Health: " + boss.getHp() + " Damage: " + boss.getDamage() + " Ulta: " + boss.getUlta() + "Storm " + boss.getWeapon().getAvm());
    }
}
