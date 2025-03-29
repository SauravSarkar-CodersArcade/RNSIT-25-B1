package rns.exceptions;
public class E1 {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 10;
        j = 10;
        int[] arr = {1,2,3};
        try {
            k = i / j; // Intellisense
            System.out.println(arr[10]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Something bad happened.");
            e.printStackTrace();
        }
        finally {
            System.out.println("End of execution");
        }
        System.out.println("The value of k is: " + k);
    }
    static {
        System.out.println("Start");
    }
}
