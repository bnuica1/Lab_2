package EX2;

import java.io.*;
import java.util.Random;

class Vers {
    private String vers = new String();

    Vers(String linie) {
        this.vers = linie;
    }

    int nr_randuri() {
        String[] nr_randuri = this.vers.split(" ");
        return nr_randuri.length;
    }

    int nr_vocale() {
        char []caractere= vers.toCharArray();
        char vocale[] ={'a','e','i','o','u'};
        int counter=0;
        for(int i =0;i <caractere.length;i++)
        {
            for(int j=0;j<vocale.length;j++)
                if(caractere[i]==vocale[j])
                {
                    counter++;
                }
        }
        return counter;
    }
    String Steluta()
    {
       if(this.vers.endsWith("yeah"))
       {
           this.vers=vers.concat("*");

       }
        return this.vers;
    }

    String Random_Vers()
    {
        Random rand = new Random();
        float random_float = rand.nextFloat(1);
       if(random_float<=0.1)
       {
           this.vers=vers.toUpperCase();
       }
       return this.vers;
    }
}

public class problema_2{
    public static void main(String[] args) throws IOException {
        String strofe=new String();
        String nume_fisier="cantec_in.txt";
        String nume_fisier_out="cantec_out.txt";
        BufferedReader flux_in;
        flux_in=new BufferedReader(new InputStreamReader(new FileInputStream(nume_fisier)));
        PrintStream flux_out = new PrintStream (nume_fisier_out);
        for(int i=0;i<12;i++)
        {
            strofe= flux_in.readLine();
            Vers a = new Vers(strofe);
            flux_out.println(strofe + " " + a.nr_randuri() +" " + a.nr_vocale() + " ");
            flux_out.println(a.Steluta());
            flux_out.println(a.Random_Vers());
        }


    }

}
