
public class Program {

    public static void main(String[] args) {
        // Test your method here

        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int[][] array){
        
        int[][] newArray = array;
        String stringRepresent = "";
        for(int i =0; i < newArray.length; i++){
            for(int j = 0; j < newArray[i].length; j++){

                stringRepresent += newArray[i][j];
                
            }
            stringRepresent +="\n";
        }
        return stringRepresent;
    }

}
