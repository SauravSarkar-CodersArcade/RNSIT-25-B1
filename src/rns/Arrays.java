package rns;
public class Arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,1};
        int xorall = 0;
        for (int i=0; i<arr.length; i++){
            xorall ^= arr[i];
        }
        int rightmostSetBit = xorall & -xorall;
        int num1 = 0;
        int num2 = 0;
        for (int i=0; i<arr.length; i++){
            if((arr[i] & rightmostSetBit) == 0){
                num1 ^= arr[i];
            }else{
                num2 ^= arr[i];
            }
        }
        System.out.println(num1 + " " + num2);
    }
}
