package currency;

import org.apache.log4j.Logger;

abstract public class Currency {
    private double kursNBU;
    private double marga = 0.1;
    protected Logger logger;

    public Currency (double kursNBU){
        this.kursNBU = kursNBU;
        logger = Logger.getLogger(getClass());
    }

    public Currency() { // пример второго пустого конструктора

    }

    public double getKursNBU(){
        return  kursNBU;
    }

    public void setKursNBU(double kursNBU){
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }

    public double exchangeCurrencyToGrn (double amountOfCurrency){
        double tempResult = amountOfCurrency * kursNBU * (1 - marga);
        logger.info("For " + amountOfCurrency + " (" + kursNBU + ") " + getCurrencyName() + ", you get " + tempResult + " UAH");
        return tempResult;
    }

    abstract String getCurrencyName();
}
