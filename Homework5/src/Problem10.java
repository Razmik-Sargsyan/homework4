public class Problem10 {
    public static void main(String[] args) {
        int[] first = new int[]{35, 34, 33, 32, 35};
        int k =2;
        int frequency= 0;

        for (int i = 0; i < first.length; i++){
                if (first[i] == first[first.length-(i+1)]){
                       frequency ++;}
                       if (frequency == k) {
                System.out.println(i);
            }


                }

            }

    }


