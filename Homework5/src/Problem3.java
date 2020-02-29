import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {

        String[] array = new String[] {"John", "Haygaz", "Anthony", "monkey"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who are you looking for?");
        String target = scanner.next();
        Boolean targetnotfound=true;

        for (int i=0;i<array.length;i++){
            if (array[i].equals(target)){
                System.out.println(target + " is in the array and holds position number "+ i);
                targetnotfound=false;
            }
        }
        if(targetnotfound) System.out.println( target + " not found");
        }

    }


