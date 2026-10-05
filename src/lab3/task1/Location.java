package lab3.task1;

public class Location {
    public int row;
    public int column;
    public double maxValue = Double.NEGATIVE_INFINITY;

    public static Location locateLargest(double[][] matrix) {
        Location location = new Location();
        for(int i = 0; i < matrix.length; i++){
           for(int j = 0; j < matrix[0].length; j++){
               if(matrix[i][j] > location.maxValue) {
                  location.maxValue = matrix[i][j];
                  location.row = i;
                  location.column = j;
               }
           }
        }
        return location;
    }

    @Override
    public String toString() {
        return String.format("max value: %f%nrow: %d%ncolumn: %d", this.maxValue, this.row, this.column);
    }
}
