package EX1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class problema1 {
    public static void main(String[] args) throws IOException {
        String[] judete = new String[42];
        String nume_fisier="judete_in.txt";
        BufferedReader flux_in;
        flux_in= new BufferedReader(new InputStreamReader(new FileInputStream(nume_fisier)));
        for(int i=0;i<42;i++)
        {
            judete[i]=flux_in.readLine();
        }
        Scanner scanner= new Scanner(System.in);
        Arrays.sort(judete);
        System.out.println("Introduceti judetul cautat: ");
        String jud_cautat=scanner.next();
        int x  = Arrays.binarySearch(judete,jud_cautat);
        System.out.println("Judetul "+jud_cautat+ " a fost gasit pe poz "+x );
        scanner.close();
    }
}
