
public class SquareSubMatrix {
    public static void subMatrix(int [][] matrix){

        int row = matrix.length ;
        int col = matrix[0].length ;

        System.out.println("matrix : ");
        printMatrix(matrix);

        System.out.println("Square SubMatrix : ");
        //her zaman kare alt matrisin boyutu satır veya sutundan kucuk olan kadardır : M(7x5) = SubM(5x5) tir
        //burada örneğin M(7x5) ise alt kare matrisler=>  SubM(5x5) , SubM(4x4) , SubM(3x3) , SubM(2x2) , SubM(1x1)

        // always the size of the square submatrix is the smaller of the row or column: M(7x5) = SubM(5x5).
        //for example, if M(7x5) is sub-square matrices=> SubM(5x5) , SubM(4x4) , SubM(3x3) , SubM(2x2) , SubM(1x1)
        for (int sublength = Math.min(row,col); sublength>0; sublength-- ){

            //baslangicta en buyuk kare matris boyutunda boş bir matris olusturarak baslanır : subSquareMtrx
            //It starts by creating an empty matrix of the largest square matrix size: subSquareMtrx
            int [][] subSquareMtrx = new int[sublength][sublength];//kare matris okdugu için de  row == col // Since it is a square matrix, row == col.

            for (int a=0; a < row - sublength + 1; a++ ){ // subSquareMtrx , Matrisimizin satırlarında (row - Srow + 1) kadar gezinir
                                                            //It traverses the rows of our SubSquareMtrx matrix by row - Srow + 1.

                for (int b=0; b < col -  sublength + 1; b++ ){// subSquareMtrx , Matrisimizin sutunlarında (col - Scol + 1) kadar gezinir
                                                                //It traverses the columns of our SubSquareMtrx matrix by col - Scol + 1.

                    for (int i=a; i < sublength + a ; i++){ // subSquareMtrx matrisinin bir sonraki adımında i nin konumu o adımın başlangici olmalı ayrıca subSquareMtrx matrisi Matrisimizin satırında her zaman Srow kadar elemanı almasi sağlanmalı
                                                            /* In the next step of the subSquareMtrx matrix, the position of i must be the beginning of that step
                                                            and subSquareMtrx matrix, It should be ensured that our matrix always takes as many elements as Scol from its column*/
                        if ( (a+sublength <= row ) ) {

                            for (int j = b; j < (sublength + b); j++) {/* subSquareMtrx matrisinin bir sonraki adımında j nin konumu o adımın başlangici olmalı ayrıca subSquareMtrx matrisi Matrisimizin sutunundan her zaman Scol kadar elemanı almasi sağlanmalı*/
                                                                        /* In the next step of the subSquareMtrx matrix, the position of j must be the beginning of that step
                                                                        and subSquareMtrx matrix, It should be ensured that our matrix always takes as many elements as Scol from its column*/

                                if ((b + sublength) <= col) {
                                    subSquareMtrx[i-a][j-b] = matrix[i][j];
                                }
                            }
                        }
                    }
                    printMatrix(subSquareMtrx);

                }


            }
        }
    }

    public static void printMatrix(int [][] mtrx){

        for (int i=0; i< mtrx.length; i++){
            for (int j=0; j< mtrx[0].length; j++){
                System.out.print(mtrx[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main (String[] args) {

        int [][] m = {
                { 0 , 1 , 1 , 1 },
                { 1 , 1 , 1 , 1 },
                { 1 , 1 , 1 , 1 },
                { 1 , 1 , 1 , 1 }   };


        int [][] n = {
                { 1 , 0 , 1 , 0 , 0 },
                { 1 , 0 , 1 , 1 , 1 },
                { 1 , 1 , 1 , 1 , 1 },
                { 1 , 0 , 0 , 1 , 0 }  };

        int [][] p = {
                { 0 , 1 , 1 , 1 },
                { 1 , 1 , 0 , 1 },
                { 0 , 1 , 1 , 1 }  };


        //subMatrix(m);
        //subMatrix(n);
        subMatrix(p);
    }



}
