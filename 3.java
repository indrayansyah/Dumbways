import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    static BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

    static void FuncDrawImage(double numberOfLine){

        double divider = numberOfLine/2;
        double middle = Math.ceil(divider);

            for (int m = 1; m <= divider; m++) {
                for (int u = 1; u <= numberOfLine; u++) {

                        if ((u == 1 && m == 1) || (u == numberOfLine && m == 1) || u == middle) {
                            System.out.print(" - ");
                        } else {
                            System.out.print(" # ");
                        }

                }
                System.out.println();
            }

                for (int a = 1; a <= numberOfLine; a++) {
                    if (middle == a) {
                        System.out.print(" # ");
                    } else {
                        System.out.print(" - ");
                    }
                }
                System.out.println();

        for (int m = 1; m <= divider; m++) {
            for (int u = 1; u <= numberOfLine; u++) {

                if ((u == 1 && m == Math.floor(divider)) || (u == numberOfLine && m == Math.floor(divider)) || u == middle) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" # ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[]args) throws IOException {

        System.out.print("Draw Image : ");
        int numberOfLine = Integer.parseInt(reader.readLine());

        if(numberOfLine%2 == 0){
            System.out.println("Invalid Number!!");
        }else{
            FuncDrawImage(numberOfLine);
        }

    }
}
