public class Problem8 {
    public static void main(String[] args) {

        int[] array= new int[]{14,641,567,789,7};

        for (int i =0; i<array.length/2; ++i){
            int mediator= array [i];
            array[(i)]=array[array.length-(i+1)];
            array[array.length-(i+1)]= mediator;


        }
        for(int r=0; r< array.length; r++)
            System.out.println(array[r]);
    }
}
