import java.util.*;


public class Main {


    public static void main(String[] args) {
        System.out.println("Test");
        Scanner sc = new Scanner(System.in);
        Logic logic = new Logic();
        Object obj = new Object(logic.input(sc),logic.input(sc));
        System.out.println("Dodawanie: " +logic.add(obj.getNumbOne(),obj.getNumbTwo()));
        System.out.println("Odejmowanie: " +logic.subtrack(obj.getNumbOne(),obj.getNumbTwo()));
        System.out.println("Mnożenie: " +logic.multiply(obj.getNumbOne(),obj.getNumbTwo()));
        System.out.println("Dzielenie: " +logic.divade(obj.getNumbOne(),obj.getNumbTwo()));
    }
}
