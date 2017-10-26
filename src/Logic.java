import java.text.DecimalFormat;
import java.util.*;

public class Logic {
    DecimalFormat df = new DecimalFormat("#.##");

    public Logic() {
    }

    public int add( int numbOne, int numbTwo){
        return numbOne+numbTwo;
    }

    public int subtrack (int numbOne, int numbTwo) {
        return numbOne-numbTwo;
    }

    public int multiply (int numbOne, int numbTwo) {
        return numbOne*numbTwo;
    }

    public double divade (int numbOne, int numbTwo) {
        if (numbTwo!=0){
            return (double) numbOne/numbTwo;
        }
        else {
            return 0;
        }
    }

    public int input(Scanner sc){
        System.out.println("Podaj liczbę: ");
        return sc.nextInt();

    }
}
