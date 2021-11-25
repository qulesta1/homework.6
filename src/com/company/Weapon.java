package com.company;

public class Weapon {
    private String fireWeapon;
    private String avm;

    public String getFireWeapon() {
        return fireWeapon;
    }

    public Weapon(String fireWeapon, String avm) {
        this.fireWeapon = fireWeapon;
        this.avm = avm;
    }

    public void setFireWeapon(String fireWeapon) {
        this.fireWeapon = fireWeapon;
    }

    public String getAvm() {
        return avm;
    }

    public void setAvm(String avm) {
        this.avm = avm;
    }
}
