import java.lang.Character;

public interface Accessory {
    // Properties
    String accessory();
    //String getAccessory();

    default int UpHP() {
        return 500;
    }

    default int UpATK() {
        return 300;
    }

    default int UpDEF() {
        return 200;
    }

    default int UpMagic() {
        return 500;
    }

    default int UpATKSpeed() {
        return 50;
    }

    default int UpRunSpeed() {
        return 30;
    }

    //void applyEffect(Character character);
}
