package libs;

public class Calc {

    public static int sumOfNumbers(int var1, int var2) {

        System.out.println("Sum result = " + (var1 + var2));
        return var1 + var2;
    }

    public static String sumOfStrings(String var1, String var2) {

        System.out.println("Sum result = " + var1 + " " + var2);
        return var1 + var2;
    }

    public static String sumOfStringAndInt(String var1, int var2) {

        System.out.println(var1 + var2);
        return var1 + var2;
    }

    public static int sumOfIntString(int var1, String var2) {
        try {
            int tempResult = var1 + Integer.parseInt(var2); //явное приведение типов  Integer.parseInt(var2)
            System.out.println("Result = " + tempResult);
            return tempResult;
        } catch (NumberFormatException e) {
            System.out.println("Error" + e);
            return 8888;
        } catch (Exception e) {
            System.out.println("Error" + e);
            return 9999;
        }
    }

}
