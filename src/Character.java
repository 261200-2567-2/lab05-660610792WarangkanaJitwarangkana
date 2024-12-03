public interface Character {
    String getName();
    void reName(String name);

    String Type();

    int setHP();
    String getHP();
    default int StartHP() {
        return 1000;
    }

    int setMana();
    String getMana();
    default int StartMana() {
        return 500;
    }

    int setATK();
    String getATK();
    default int StartATK() {
        return 100;
    }

    int setDEF();
    String getDEF();
    default int StartDEF() {
        return 80;
    }

    int setMagic();
    String getMagic();
    default int StartMagic() {
        return 0;
    }

    int setATKSpeed();
    String getATKSpeed();
    default int StartATKSpeed() {
        return 100;
    }

    int setRunSpeed();
    String getRunSpeed();
    default int StartRunSpeed() {
        return 50;
    }

    int setATKRange();
    String getATKRange();
    default int StartATKRange() {
        return 30;
    }

    // Operations
    //void attack();
    //void defense();
    //String equipAccessory(Accessory accessory);

    //String getInfo();
}

