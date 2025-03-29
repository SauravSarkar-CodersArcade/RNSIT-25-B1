package rns.basics;

public class ZigZagPattern {
    static void zigZagPattern1(int cols){
        for(int r=1; r<=3; r++){
            for(int c=1; c<=cols; c++){
                if((r==1 && c%4==3) ||
                   (r==2 && c%2==0) ||
                   (r==3 && c%4==1)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void zigZagPattern2(int cols){
        for(int r=1; r<=3; r++){
            for(int c=1; c<=cols; c++){
                if((r+c)%4==0 ||
                        (r==2 && c%4==0)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       zigZagPattern1(9);
       zigZagPattern2(13);
    }
}
