package pl.edu.ur.oopl9;

//import java.util.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

//import java.util.Random;
//import java.util.TreeSet;


public class Main {

   
    public static void main(String[] args) {
       
       int a;
        
        Random losujLiczby = new Random();

       TreeSet drzewo = new TreeSet <> ();
        
       for(int i = 0; i < 100; i++)

            {
               a = losujLiczby.nextInt(101);
               drzewo.add(a);

            }
      Iterator it = drzewo.iterator();
       
      while (it.hasNext())
           {
              System.out.println(it.next() + " ");
            }

  
    
   
   TreeSet drzewo2 = new TreeSet <> ();
   

    ArrayList<Samochod> samochody = new ArrayList<Samochod>();
    Samochod s1 = new Samochod();
    s1.setCena(3000);
    s1.setMarka("Fiat");
    s1.setNazwaSam("asdasd");
    s1.setPredkosc(200);
    samochody.add(s1);
    
    Samochod s2 = new Samochod();
    s2.setCena(150000000);
    s2.setMarka("Ferrari");
    s2.setNazwaSam("Enzo");
    s2.setPredkosc(350);
    samochody.add(s2);
    
    samochody.get(0).getPredkosc();
    samochody.get(0).getCena();
    samochody.get(0).getNazwaSam();
    samochody.get(0).getMarka();
  }
    
    
    
}