/*
 * 13. Create a class called 'Matrix' containing constructor that initializes
 * the number of rows and number of columns of a new Matrix object. The Matrix
 * class has the following information: 
 * 1 - number of rows of matrix 
 * 2 - number of columns of matrix 
 * 3 - eleme nts of matrix in the form of 2D array 
 * 14. The Matrix class has methods for each of the following: 
 * 1 - get the number of rows 
 * 2 - get the number of columns 
 * 3 - set the elements of the matrix at given position (i,j) 
 * 4 - adding two matrices. If the matrices are not
 * addable, "Matrices cannot be added" will be displayed. 
 * 15 - multiplying the two matrices
 */
import java.util.Scanner;
public class Matrix
{
    int nos_rows;
    int nos_col;
    int[][] matrix;
    Matrix(int s_row, int s_col)
    {
        nos_rows = s_row;
        nos_col = s_col;
        matrix = new int[nos_rows][nos_col];
    }
    int getRows(){ return nos_rows;}
    int getColumns(){ return nos_col;}
    void setElement(int s_ele, int i, int j){ matrix[i][j] = s_ele;}
    static boolean canAdd(Matrix a, Matrix b){ return (a.getColumns() == b.getColumns()) && (a.getRows() == b.getRows());}
    static Matrix addMatrices(Matrix a, Matrix b)
    {
        Matrix sumMatrix = new Matrix(a.getRows(), a.getColumns());
        for(int i = 0;i < a.getRows(); i++)
            for(int j = 0; j < a.getColumns(); j++)
                sumMatrix.matrix[i][j] = a.matrix[i][j] + b.matrix[i][j];
        return sumMatrix;
    }
    static boolean canMul(Matrix a, Matrix b)
    {
        return (a.getColumns() == b.getRows());
    }
    static Matrix multiply(Matrix a, Matrix b)
    {
        int sum = 0;
        Matrix product = new Matrix(a.getRows(), b.getColumns());
        for (int i = 0; i < a.getRows(); i++) 
        {
            for (int j = 0; j < b.getColumns(); j++) 
            {
                for (int k = 0; k < b.getRows(); k++) 
                {
                    sum = sum + a.matrix[i][k] * b.matrix[k][j];
                }
                product.matrix[i][j] = sum;
                sum = 0;
            }
        }
        return product; 
    }
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Number of Rows and Columns in Matrix 1 : ");
        int a_row = scr.nextInt(); int a_col = scr.nextInt();
        System.out.println("Enter Number of Rows and Columns in Matrix 2 : ");
        int b_row = scr.nextInt(); int b_col = scr.nextInt();
        Matrix a = new Matrix(a_row, a_col);
        Matrix b = new Matrix(b_row, b_col);
        System.out.println("Enter Elements of Matrix 1 : ");
        for(int i = 0; i < a_row; i++)
            for(int j = 0; j < a_col; j++)
                a.setElement(scr.nextInt(), i, j);
        System.out.println("Enter Elements of Matrix 2 : ");
        for (int i = 0; i < b_row; i++)
            for (int j = 0; j < b_col; j++)
                b.setElement(scr.nextInt(), i, j);
        System.out.println("Sum of Matrices is : ");
        if(canAdd(a, b))
        {
            Matrix sum = addMatrices(a,b);
            for (int i = 0; i < sum.getRows(); i++)
            {
                for (int j = 0; j < sum.getColumns(); j++)
                    System.out.print(sum.matrix[i][j] + "  ");
                System.out.println();
            }
        }
        else 
            System.out.println("Matrices cannot be added");
        
        System.out.println("Product of Matrices is : ");
        if(canMul(a,b))
        {
            Matrix prod = multiply(a, b);
            for (int i = 0; i < prod.getRows(); i++) 
            {
                for (int j = 0; j < prod.getColumns(); j++)
                    System.out.print(prod.matrix[i][j] + "  ");
                System.out.println();
            }
        }
        else 
            System.out.println("Matrics Cannot be Multiplied");
    }
}