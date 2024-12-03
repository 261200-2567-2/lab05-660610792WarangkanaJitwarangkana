import java.lang.reflect.Array;

public class Mage implements Character {

    private String name, type;

    public Mage(String name) {
        this.name = name;
        type = "Mage";
    }

    //@Override
    //public String equipAccessory(Accessory accessory){ return accessory;};

    @Override
    public String getName() { return "Hero Name : "+name; }
    @Override
    public void reName(String name) { this.name = name; }

    @Override
    public String Type() { return "\nHero Type : "+type; }

    @Override
    public int setHP() { return StartHP()-(StartHP()*10/100); }
    @Override
    public String getHP() { return "\nHP : "+setHP(); }

    @Override
    public int setMana() { return StartMana()+(StartMana()*20/100); }
    @Override
    public String getMana() { return "\nMana : "+setMana(); }

    @Override
    public int setATK() { return StartATK()-(StartATK()*20/100); }
    @Override
    public String getATK() { return "\nATK : "+setATK(); }

    @Override
    public int setDEF() { return StartDEF(); }
    @Override
    public String getDEF() { return "\nDEF : "+setDEF(); }

    @Override
    public int setMagic() { return 100; }
    @Override
    public String getMagic() { return "\nMagic : "+setMagic(); }

    @Override
    public int setATKSpeed() { return StartATKSpeed()+(StartATKSpeed()*10/100); }
    @Override
    public String getATKSpeed() { return "\nATKSpeed : "+setATKSpeed(); }

    @Override
    public int setRunSpeed() { return StartRunSpeed()+(StartRunSpeed()*5/100); }
    @Override
    public String getRunSpeed() { return "\nRunSpeed : "+setRunSpeed(); }

    @Override
    public int setATKRange() { return StartATKRange(); }
    @Override
    public String getATKRange() { return "\nATKRange : "+setATKRange(); }

    public String getInfo() {

        return getName()+Type()+getHP()+getMana()+getATK()+getDEF()+getMagic()+getATKSpeed();
    }

    /*@Override
    public void equipAccessory(Accessory accessory) {
        accessory.applyEffect(this);
    }*/

}
