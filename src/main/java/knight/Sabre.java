package knight;

/**
 * Created by mykola on 21.02.17.
 */
public class Sabre extends KnightEquipment {
    private int length;

   public Sabre(int price, int weight, String purpose, int length) {
        super(price, weight, purpose);
        this.length = length;
    }

    @Override
    public  String toString() {
        return "price: " + this.getPrice() +
                "\nweight: " + this.getWeight() +
                "\npurpose: " + this.getPurpose() +
                "\nlength: " + this.length+"\n";
    }


}
