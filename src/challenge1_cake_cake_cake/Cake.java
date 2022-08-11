package challenge1_cake_cake_cake;

//Superclass Cake should have two fields flavor and price, set default values in the constructor and make getters and setters
public class Cake {
    public String flavor;
    public double price;


    public Cake(){
        this("Vanilla");
    }
    public Cake(String flavor) {
        setFlavor(flavor);
        setPrice(9.99);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
