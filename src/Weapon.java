import java.lang.Character;
import java.util.Collections;
import java.util.Map;

public class Weapon implements Accessory {

    private String weapon;
    private String character;
    private final Map<String, Integer> statBoosts = Collections.singletonMap("HP", 10);

    public Weapon(String name, String weapon) {
        this.character = name;
        this.weapon = weapon;
    }

    @Override
    public String accessory() { return "Hero equip : " + weapon ; }

    /*public void applyEffect(Character name) {
        if (this.weapon == ("GuardianGemPendant")){
            System.out.println("Guardian GemPendant applied!");
            System.out.println("Hero gain HP : Extra HP: " + statBoosts.get("HP"));
        }
    }*/
}
