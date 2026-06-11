package day_3;

public class Search_2D {
    static void main() {
        int[][] arr ={
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17},
        };
        int target = 12;
        Search_2D ob = new Search_2D();
        System.out.println(ob.searchMatrix(arr, target));
    }


    public boolean searchMatrix(int[][] matrix, int target) {
            int i = 0, j = matrix[0].length - 1;
            while(i < matrix.length && j >= 0){
                if(matrix[i][j] == target){
                    return true;
                }else if(target < matrix[i][j]){
                    j--;
                }else{
                    i++;
                }
            }
            return false;
    }

}
