package libs;

public class WorkWithArray {

    public int [][] createMatrix(int x, int y, int value){
        int[][] massivMassiv2 = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                massivMassiv2[i][j] = value;
//                System.out.print(massivMassiv2[i][j] + " ");
            }
//            System.out.println(" ");
            printMatrix(massivMassiv2);
        }
        return massivMassiv2;
    }
    public int [][] fillTwoDiagonal(int [][] tempMatrix, int value){
//TODO        fillLeftDiagonal(tempMatrix, value);
        return fillRightDiagoanal(tempMatrix, value);
    }

    public int [][] fillRightDiagoanal(int[][] tempMatrix, int value){
        for (int i = 0; i < tempMatrix.length; i++) {
            if (tempMatrix.length == tempMatrix[0].length){
                System.out.println("Not square");
                return tempMatrix;
            }
        }
        for (int i = 0; i < tempMatrix.length; i++) {
            for (int j = 0; j < tempMatrix[0].length; j++) {
                if (i == tempMatrix.length -j -1){
                    tempMatrix[i][j]=value;
                }
            }
        }
        printMatrix(tempMatrix);
        return tempMatrix;
    }

    public  void  printMatrix(int [][] tempMatrix){
        for (int i = 0; i < tempMatrix.length; i++) {
            for (int j = 0; j < tempMatrix[i].length; j++) {
                System.out.println();
            }
        }
    }
}
