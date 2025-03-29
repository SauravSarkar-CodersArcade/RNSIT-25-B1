package rns.exceptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class E3 {
    public static void main(String[] args) throws IOException {
        String str;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str = br.readLine();
            System.out.println(str);
        }
    }
}
