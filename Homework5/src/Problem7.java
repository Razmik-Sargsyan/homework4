public class Problem7 {
    public static void main(String[] args) {
        //Given an array of integers, create another array that have elements of the first array in reversed order.
        int[] array= new int[]{14,641,567,789,7};
        int[] reversearray =new int[array.length];

        for(int i=0; i< array.length; i++){
            reversearray[array.length-(i+1)] = array[i];
        }
        for(int r=0; r< reversearray.length; r++)
        System.out.println(reversearray[r]);
    }
}
