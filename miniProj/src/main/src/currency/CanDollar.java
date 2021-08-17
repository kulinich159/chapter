package currency;

public  class CanDollar extends Currency implements IsFreeConverted{

    public CanDollar(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "CDOL";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }
}
