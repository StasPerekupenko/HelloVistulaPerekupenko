import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class LR3Perekupenko {
    static BufferedReader br;
    static DecimalFormat formatter;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        formatter= new DecimalFormat("#.##");

        while (true) {
            System.out.println("Numer zadania (1-5, inne wyjscie):");
            switch (Integer.parseInt(br.readLine())) {
                case 1:
                    Zadanie1();
                    break;
                case 2:
                    Zadanie2();
                    break;
                case 3:
                    Zadanie3();
                    break;
                case 4:
                    Zadanie4();
                    break;
                case 5:
                    Zadanie5();
                    break;
                default:return;
            }
            System.out.println("-------------------------------------------------------------------------------");
        }


    }


    public static void Zadanie1() throws IOException {
        System.out.println("ZADANIE1: PROSTY KALKULATOR");
        System.out.println("Liczba 1=");
        float liczba1=Float.parseFloat(br.readLine());
        System.out.println("Liczba 2=");
        float liczba2=Float.parseFloat(br.readLine());
        System.out.println("Wyniki:");
        System.out.println(formatter.format(liczba1)+" + "+formatter.format(liczba2)+" = "+formatter.format(liczba1+liczba2));
        System.out.println(formatter.format(liczba1)+" - "+formatter.format(liczba2)+" = "+formatter.format(liczba1-liczba2));
        System.out.println(formatter.format(liczba1)+" * "+formatter.format(liczba2)+" = "+formatter.format(liczba1*liczba2));
        System.out.println(formatter.format(liczba1)+" / "+formatter.format(liczba2)+" = "+formatter.format(liczba1/liczba2));

    }

    public static void Zadanie2() throws IOException{
        System.out.println("ZADANIE2: OBLICZENIE WSKAZNIKA BMI");
        System.out.println("Weight =");
        float weightPerkupenko=Float.parseFloat(br.readLine());
        System.out.println("Height =");
        float heightPerkupenko=Float.parseFloat(br.readLine())/100;

        float value=(float) (weightPerkupenko/ Math.pow(heightPerkupenko,2));
        System.out.println("WMI = "+value);
        if(value<16f)System.out.println("Wyglodzenie");
        else if(value<17f)System.out.println("Wychudzenie");
        else if(value<18.5f)System.out.println("Niedowaga");
        else if(value<23f)System.out.println("Norma niski przedzial");
        else if(value<24f)System.out.println("Norma wysoki przedzial");
        else if(value<27.5f)System.out.println("Nadwaga niski przedzial");
        else if(value<30f)System.out.println("Nadwaga wysoki przedzial");
        else if(value<35f)System.out.println("Otylosc 1 stopnia");
        else if(value<40f)System.out.println("Otylosc 2 stopnia");
    }

    public static void Zadanie3() throws IOException{
        System.out.println("OBLICZENIE PIERWIASTKOW ROWNIANIA KWADRATOWEGO");
        float a,b,c;
        System.out.println("A =");
        a=Float.parseFloat(br.readLine());
        if(a==0){
            System.out.println("ERROR: nie musi byc 0");
            return;
        }
        System.out.println("B =");
        b=Float.parseFloat(br.readLine());
        System.out.println("C =");
        c=Float.parseFloat(br.readLine());

        float d=b*b-4*a*c;
        System.out.println("Wyniki:");
        if (d<0){
            System.out.println("Niema");
        }else if(d==0){
            System.out.println("x1="+formatter.format(-b/(2*a)));
        }else{
            System.out.println("x1="+formatter.format((-b+Math.sqrt(d))/(2*a)));
            System.out.println("x2="+formatter.format((-b-Math.sqrt(d))/(2*a)));
        }

    }

    public static void Zadanie4() throws IOException{
        System.out.println("SUMOWANIE LICZB PARZYSTYCH OD 0 Do 100");
        int suma=0;
        for(int i=2;i<=100;i+=2)suma+=i;
        System.out.println("Suma="+suma);
    }

    public static void Zadanie5() throws IOException{
        System.out.println("ZNAJDOWANIE NAJWEKSZEJ I NAJMNIEJSZEJ LICZBY");
        int[]liczby={55,1,8,34,0,8,96,23,4,17};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int i=0;
        while(i<10){
            if(liczby[i]<min)min=liczby[i];
            if(liczby[i]>max)max=liczby[i];
            i++;
        }

        System.out.println("Min= "+min);
        System.out.println("Max= "+max);
    }

}
