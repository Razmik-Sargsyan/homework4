public class Problem6 {
    public static void main(String[] args) {

        int[] experiment = new int[]{56, 2322, 877,3,344};
        int max= experiment[0];
        int min =experiment[0];
        for (int i=0; i<experiment.length-1;i++){
            if (experiment[i+1]> max)
                max = experiment[i+1];
            if(experiment[i+1]<min)
                min=experiment[i+1];

        }
        System.out.println("The biggest integer in the array is " + max);
        System.out.println("The smallest integer in the array is " + min);


        //Given an array of integers, find maximum and minimum elements in array.

    }

}
