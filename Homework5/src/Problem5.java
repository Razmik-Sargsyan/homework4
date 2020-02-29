public class Problem5 {
    public static void main(String[] args) {


    char[] expo = new char[] {'0','y','5','w','v','9','v'};
    char demo = 'v';
    int numberoftimesdemoisinexpo = 0;

    for(int i=0; i<expo.length; i++){
        if (expo[i]==demo){
           numberoftimesdemoisinexpo++;
        }
    }

        System.out.println(numberoftimesdemoisinexpo);
    }
}
