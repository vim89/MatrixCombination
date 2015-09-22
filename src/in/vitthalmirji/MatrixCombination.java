/** Combination of Elements in Matrix of m x n size
 * @author VitthalMirji
 * Visit: http://www.vitthalmirji.in
 * Email: vitthalmirji@gmail.com 
*/

package in.vitthalmirji;

import java.util.Scanner;

public class MatrixCombination {

	private int givenMatrix[][];
    private int numberOfColumns;
    private int numberOfRows;
    private int result[];
    
    public MatrixCombination() {
        int rowIndex,columnIndex;
        numberOfColumns=0;
        numberOfRows=0;
        givenMatrix=new int[20][20];
        result= new int[20];
        for(rowIndex=0;rowIndex<numberOfRows;rowIndex++) {
            result[rowIndex]=0;
            for(columnIndex=0;columnIndex<numberOfColumns;columnIndex++)
                givenMatrix[rowIndex][columnIndex]=0;
        }
    }
    
    public void printOutput() {        
        for(int rowIndex=1;rowIndex<numberOfRows;rowIndex++) {
            for(int columnIndex=0;columnIndex<numberOfColumns;columnIndex++) {
            	for(int combinationElement=0;combinationElement<numberOfColumns;combinationElement++) {
            		System.out.println(givenMatrix[rowIndex][columnIndex]+", "+givenMatrix[rowIndex-1][combinationElement]);
            	}
            }
        }
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number of rows ");
        numberOfRows=scanner.nextInt();
        System.out.println("Give number of columns ");
        numberOfColumns=scanner.nextInt();
        System.out.println("Enter all the matrix elements: ");
        for(int rowIndex=0;rowIndex<numberOfRows;rowIndex++) {
            for(int columnIndex=0;columnIndex<numberOfColumns;columnIndex++) {
                givenMatrix[rowIndex][columnIndex]=scanner.nextInt();
            }
        }
    }
    public static void main(String args[])
    {
        MatrixCombination matrixCombination = new MatrixCombination();
        matrixCombination.readInput();
        matrixCombination.printOutput();
    }
}

/* Output:
Give number of rows 
2
Give number of columns 
3
Enter all the matrix elements: 
1 3 5 2 6 7

2,1
2,3
2,5
6,1
6,3
6,5
7,1
7,3
7,5 */