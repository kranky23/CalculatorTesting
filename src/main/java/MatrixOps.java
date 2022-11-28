public class MatrixOps
{
    public static int[][] matrixAdd(int[][] matrix1, int[][] matrix2)
    {
        int rows = matrix1.length;
        int cols= matrix1.length;
        int[][] add = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                add[i][j]=matrix1[i][j]+matrix2[i][j];
        return add;
    }

    //Subtract two matrices
    public static int[][] matrixSubtract(int[][] matrix1, int[][] matrix2)
    {
        int rows = matrix1.length;
        int cols= matrix1.length;
        int[][] sub = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                sub[i][j]=matrix1[i][j]-matrix2[i][j];
        return sub;
    }

    static int[][] matMul(int[][] mat1, int[][] mat2)
    {
        int N = mat1.length;
        int[][] prod = new int[N][N];

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                prod[i][j] = 0;

                for (int k = 0; k < N; k++)
                {
                    prod[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return prod;
    }

    public static int[][] powMat(int[][] matrix, int power)
    {
        int N = matrix[0].length;
        int[][] res = new int[N][N];

        if(power == 0)
            return identity(N);

        else if(power == 1)
            return matrix;

        if(power % 2 == 0)
            res = powMat(matMul(matrix, matrix), power / 2);

        else
            res = matMul(powMat(matMul(matrix, matrix), power / 2), matrix);

        return res;
    }

    // Function to return identity matrix of dimension N x N.
    public static int[][] identity(int N) {
        int[][] I = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j)
                    I[i][j] = 1;
                else
                    I[i][j] = 0;
            }
        }
        return I;
    }
}
