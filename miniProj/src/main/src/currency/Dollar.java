package currency;

public class Dollar extends Currency implements IsFreeConverted{
    public Dollar(double kursNBU) {
        super(kursNBU);
    }
    public Dollar (){
        super();
    }

    @Override
    String getCurrencyName() {
        return "Dollar";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }
}
