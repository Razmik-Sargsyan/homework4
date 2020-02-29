public class Problem4 {
    public static void main(String[] args) {

        int[] array= new int[] {57,46,87,34};
        int[] newarray = new int[array.length];

        for(int i=0; i <array.length; ++i){
            newarray [i] = array[i];
        }
        for (int r=0; r<newarray.length; ++r) {
            System.out.println(newarray[r]);
        }
    }
}
