package knight;

/**
 * Created by mykola on 21.02.17.
 */
public class Mail extends KnightEquipment {
     private int strength;


    public Mail(int price, int weight, String purpose, int strength) {
        super(price, weight, purpose);
        this.strength = strength;
    }

    @Override
    public  String toString() {
        return "price: " + this.getPrice() +
                "\nweight: " + this.getWeight() +
                "\npurpose: " + this.getPurpose() +
                "\nstrength: " + this.getStrength() + "\n";
    }

    private int getStrength() {
        return strength;
    }


}
