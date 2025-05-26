//Practical 2: Implementation of Array applications of Sparse Matrices.

class practical2{
    public static void main(String args[]){
        int sparse_matrix[][] = {  
            {0 , 0 , 1 , 0 , 5 },  
            {5 , 0 , 0 , 2 , 0 },  
            {0 , 0 , 8 , 0 , 4 },  
            {0 , 2 , 9 , 0 , 0 }  
        };
        int rows = 4, cols = 5;
        int size = 0;
        // count the number of non-zero elements
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(sparse_matrix[i][j] != 0) {
                    size++;
                }
            }
        }
        // initialize arrays to store row, col, and value
        int[] row = new int[size];
        int[] col = new int[size];
        int[] value = new int[size];
        int k = 0;
        // store the non-zero elements in arrays
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(sparse_matrix[i][j] != 0) {
                    row[k] = i;
                    col[k] = j;
                    value[k] = sparse_matrix[i][j];
                    k++;
                }
            }
        }
        // display the sparse matrix
        System.out.println("Array Representation of Sparse Matrix:");
        System.out.println( "Row\tCol\tValue");
        for(int i=0; i<size; i++) {
            System.out.println( row[i] + "\t"+ col[i]+ "\t"+ value[i]);
        }
    }
}
