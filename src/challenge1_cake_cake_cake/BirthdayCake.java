package challenge1_cake_cake_cake;

//BirthdayCake subclass class with a field candles, make getters and setters, default flavor chocolate
public class BirthdayCake extends Cake{
    public int candles;

    public BirthdayCake() {
        //super("Chocolate");
        flavor = "Chocolate";
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
