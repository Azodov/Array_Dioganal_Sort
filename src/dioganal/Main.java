package dioganal;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------- Task 1 -------------------");
        int [][] array = {{12,15,22,44, 31},
                          {18,13,88,77,76},
                          {54,33,14,98,11},
                          {71,55,82,43,3},
                          {71,55,82,43,71}};
        for (int i = 0; i< array.length; i++) {
            for (int j = 0; j< array.length; j++) {
                if (i==j) {
                    System.out.println(array[i][j]);
                }
            }
        }
        System.out.println("--------------------- Task 2 ---------------------");
        for (int k = 0; k< array.length; k++) {
            for (int c = 0; c< array.length; c++) {
                if ((k+c) == (array.length-1)) {
                    System.out.println(array[k][c]);
                }
            }
        }
        System.out.println("--------------------- Task 3 ---------------------");
        for (int i = 0; i< array.length; i++) {
            for (int j = 0; j< array.length; j++) {
                if (i==j) {
                    array[i][j]=0;
                    System.out.println(array[i][j]);
                }
            }
        }
        System.out.println("--------------------- Task 4 ---------------------");
        for (int k = 0; k< array.length; k++) {
            for (int c = 0; c< array.length; c++) {
                if ((k+c) == (array.length-1)) {
                    array[k][c]=0;
                    System.out.println(array[k][c]);
                }
            }
        }
    }
}
