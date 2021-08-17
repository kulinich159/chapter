import currency.CanDollar;
import currency.Dollar;
import currency.Euro;
import libs.Calc;
import libs.WorkWithArray;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        int var1 = 3;
        int var2 = 5;
        int var3 = 7;
        String var_string = "test_string";

//        System.out.println(var1 + var2);
        Calc.sumOfNumbers(var1, var2);

//        System.out.println(var3+var2);
        Calc.sumOfNumbers(var3, var2);
        Calc.sumOfStrings(var_string, "Test2");
        Calc.sumOfStringAndInt("Test", 8); // неявное приведение типа - склейка стринги и инта, когда мы явно не указаываем что нужно привести

        int rez_1 = Calc.sumOfNumbers(3, 5);
        String rez_2 = Calc.sumOfStrings("String", "1");
        String rez_3 = Calc.sumOfStringAndInt("String", 9);
        int rez_4 = Calc.sumOfIntString(3, "33");
        int rez_5 = Calc.sumOfIntString(3, "3are3");

        System.out.println(Calc.sumOfIntString(3, "3are3") + 3);

        int[] massiv = {2, 7, 5, 78, 0, 91, 6, 3, 11, 45, 10};
        System.out.println(massiv[2]);

        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] > 10) {
                System.out.println(massiv[i] + " Элемент больше 10");
            } else if (massiv[i] == 10) {
                System.out.println(massiv[i] + " Элемент равен 10");
            } else if (massiv[i] < 10) {
                System.out.println(massiv[i] + " Элемент меньше 10");
            } else {
                System.out.println(massiv[i] + " Что-то пошло не так");
            }
        }

        System.out.println(massiv.length);

        for (int i = massiv.length - 1; i >= 0; i--) {
            System.out.println(massiv[i]);
        }

        int[][] massivMassiv = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        int[][] massivMassiv2 = new int[3][3];
        WorkWithArray workWithArray = new WorkWithArray();
        workWithArray.createMatrix(5, 6, 8);

        List<String> ourList = new ArrayList();
        ourList.add("test");
        System.out.println(ourList);
        ourList.add("test1");
        System.out.println(ourList);
        System.out.println(ourList.get(1));
        System.out.println("Size = " + ourList.size());

        for (String element : ourList) {
            System.out.println(element);
        }

        List<List<String>> ourListList = new ArrayList<>();
        System.out.println(ourListList);
        ourListList.add(new ArrayList<>());
        System.out.println(ourListList);
        ourListList.add(new ArrayList<>());
        System.out.println(ourListList);
        ourListList.add(new ArrayList<>());
        System.out.println(ourListList);


        ourListList.get(1).add("test");
        ourListList.get(1).add("test1");
        ourListList.get(1).add("test2");
        System.out.println(ourListList);

        ourListList.get(1).remove(0);
        System.out.println(ourListList);


        List<String> lineList = new ArrayList<>();
        lineList.add("element1");
        lineList.add("element2");
        lineList.add("element3");
        lineList.add("element4");
        System.out.println(lineList);

//        ourListList.add(lineList);
        ourListList.add(new ArrayList<>());
        ourListList.get(1).addAll(0, lineList);
        System.out.println(ourListList);
        ourListList.get(2).addAll(0, lineList);
        System.out.println(ourListList);

        lineList.add("element5");
        ourListList.get(2).addAll(lineList);
        for (List<String> line : ourListList
        ) {
            System.out.println(line);
        }

        Map<String, Integer> ourMap = new HashMap<>();
        ourMap.put("login", null);
        System.out.println(ourMap);
        ourMap.put("pass", 8921);
        System.out.println(ourMap);
        System.out.println(ourMap.get("pass"));
        ourMap.put("pass", 777);
        System.out.println(ourMap);
        System.out.println("Size = " + ourMap.size());

        List<Map<String, Integer>> ourListMap = new ArrayList<>();
        ourListMap.add(new HashMap<>());
        ourListMap.get(0).put("login", 2233);
        ourListMap.get(0).put("pass", 8921);
        ourListMap.get(0).put("pass1", 7891);
        System.out.println(ourListMap);
        System.out.println(ourListMap.get(0).get("pass1"));

        ourListMap.add(new HashMap<>());
        ourListMap.get(1).put("login", null);
        ourListMap.get(1).put("pass", 7777);
        ourListMap.get(1).put("pass1", 7778);
        System.out.println(ourListMap);
        System.out.println(ourListMap.get(1).get("login"));

        for (int i = 0; i < ourListMap.size(); i++) {

            System.out.println("Line " + (i + 1) + " pass = " + ourListMap.get(i).get("pass"));

        }

        Dollar dollar = new Dollar(27.2);
        System.out.println("Kurs = " + dollar.getKursNBU());
        dollar.setKursNBU(27);
        System.out.println("Kurs = " + dollar.getKursNBU());

        dollar.exchangeCurrencyToGrn(100);
        dollar.setKursNBU(29);
        dollar.exchangeCurrencyToGrn(100);

        Euro euro = new Euro(32.5);
        euro.exchangeCurrencyToGrn(100);
        euro.setKursNBU(31.6);
        euro.setMarga(0.15);
        euro.exchangeCurrencyToGrn(150);

        CanDollar canDollar = new CanDollar(24);
        canDollar.setMarga(0.3);
        canDollar.exchangeCurrencyToGrn(100);
        euro.exchangeCurrencyToGrn(150);
        System.out.println(dollar.isFreeConv());
        System.out.println(euro.isFreeConv());
        System.out.println(canDollar.isFreeConv());

        Logger logger = Logger.getLogger("MainClass");
        logger.info("-Info-");
        logger.debug("-Debug-");
        logger.error("-Error-");

        System.out.println("----------- END ----------");

    }
}
