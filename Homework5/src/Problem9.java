public class Problem9 {
    public static void main(String[] args) {
        //Given an a, find an element in the first array that doesn't occur in the second array.
        int[] first = new int[]{35, 34, 33, 32};
        int[] second = new int[]{35, 34, 33, 31};
        int unique_element;

        for (int r = 0; r < first.length; r++) {
            for (int i = 0; r < second.length; i++) {
                if (first[r] != second[i]) {
                    System.out.println(first[r]);
                }
            }
        }

    }
}