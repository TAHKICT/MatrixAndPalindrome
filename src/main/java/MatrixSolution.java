import java.util.ArrayList;
import java.util.List;

/**
 * Program should find the path through all the matrix by diagonals ways down and up.
 */
public class MatrixSolution {

    /**
     *
     * @param R rows quantity
     * @param C columns quantity
     * @param M matrix
     */
    public void solution(int R, int C, int[][]M){
        List<Integer> vector = new ArrayList();

        int vectorsQuantity = R + C - 1;

        int currentRow = 0;
        int currentColumn = 0;
        vector.add(M[currentRow][currentColumn]);

        boolean goDown = false;
        for (int i = 1; i < vectorsQuantity; i++) { //Every iteration we build a diagonal path
            goDown = !goDown;

            if(goDown == true) { //go down

                if (i < C) { //when current diagonal number less then columns quantity
                    currentRow = 0;
                    currentColumn = i;
                    vector.add(M[currentRow][currentColumn]);
                    while (currentRow+1 < R && currentColumn-1 >= 0){
                        currentRow++;
                        currentColumn--;
                        vector.add(M[currentRow][currentColumn]);
                    }
                } else {
                    currentRow = R - (vectorsQuantity - i);
                    currentColumn = C - 1;
                    vector.add(M[currentRow][currentColumn]);
                    while (currentRow+1 < R && currentColumn-1 >= 0){
                        currentRow++;
                        currentColumn--;
                        vector.add(M[currentRow][currentColumn]);
                    }
                }

            } else { //go up

                if(i < R) { //when current diagonal number less then rows quantity
                    currentRow = i;
                    currentColumn = 0;
                    vector.add(M[currentRow][currentColumn]);
                    while (currentRow-1 >= 0 && currentColumn+1 < C){
                        currentRow--;
                        currentColumn++;
                        vector.add(M[currentRow][currentColumn]);
                    }
                } else {
                    currentRow = R - 1;
                    currentColumn = C - (vectorsQuantity - i);
                    vector.add(M[currentRow][currentColumn]);
                    while (currentRow-1 >= 0 && currentColumn+1 < C){
                        currentRow--;
                        currentColumn++;
                        vector.add(M[currentRow][currentColumn]);
                    }
                }

            }
        }

        System.out.println(vector);
    }


    public static void main (String[]args){

        int [ ] [ ] scores = {
                { 11, 21, 31, 41, 51, 61 },
                { 12, 22, 32, 42, 52, 62 },
                { 13, 23, 33, 43, 53, 63 },
        };

        int [ ] [ ] scores2 = {
                { 11, 21, 31 },
                { 12, 22, 32 },
                { 13, 23, 33 },
                { 14, 24, 34 },
                { 15, 25, 35 },
                { 16, 26, 36 }
        };

        MatrixSolution matrixSolution = new MatrixSolution();
        matrixSolution.solution(3,6, scores);
        matrixSolution.solution(6,3, scores2);
    }

}
