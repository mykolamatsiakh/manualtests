package knight;

/**
 * Created by mykola on 21.02.17.
 */
public class Helmet extends KnightEquipment {
     private int radius;

    public Helmet(int price, int weight, String purpose, int radius) {
        super(price, weight, purpose);
        this.radius = radius;
    }

    private int getRadius() {
        return radius;
    }


    @Override
    public  String toString() {
        return "price: "+this.getPrice()+
                "\nweight: "+this.getWeight()+
                "\npurpose: "+this.getWeight()+
                "\nradius: "+this.getRadius();
    }


}
