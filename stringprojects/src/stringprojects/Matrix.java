package stringprojects;







public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int newm[][] = new int[3][3];
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        newm[j][matrix.length - 1 - i] = matrix[i][j]; //0 --  3 - 1 - 0 = 2     1 --  3 - 1 - 1 = 1    2 --  3 - 1 - 2 = 0
    }
}


for (int i = 0; i < newm.length; i++) {
    for (int j = 0; j < newm[i].length; j++) {
        System.out.print(newm[i][j] + " ");
    }
    System.out.println();
}

    }
}

