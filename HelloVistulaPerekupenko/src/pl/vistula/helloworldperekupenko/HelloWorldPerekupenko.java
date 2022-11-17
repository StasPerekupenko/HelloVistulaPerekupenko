package pl.vistula.helloworldperekupenko;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class HelloWorldPerekupenko {

    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wybierz zadanie(1-5):");
        switch (br.readLine()) {
            case "1":
                Zadanie1();
                break;
            case "2":
                Zadanie2();
                break;
            case "3":
                Zadanie3();
                break;
            case "4":
                Zadanie4();
                break;
            case "5":
                Zadanie5();
                break;
            default:
                return;
        }

    }
}
