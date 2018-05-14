/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9.zad4;

import java.util.HashMap;

import java.util.Scanner;

/**
 *
 * @author Daria
 */
public class Main {
    
    public static void main(String[] args) 
    {
        HashMap<String,String> mymap = inicjujMape();
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Wpisz polskie slowo");
            String slowo = scanner.next();
        
            if(slowo.equals("koniec!") )
            {
            break;
            }
            
           String tlumaczenie = mymap.get(slowo);
           if(tlumaczenie != null && !tlumaczenie.isEmpty()) 
           { 
               System.out.println(tlumaczenie);
           }
           else
           {
               System.out.println("Slownik nie zawiera tlumaczenia");
           }
               
        }   
    }
    
    private static HashMap<String,String> inicjujMape()
    {
     HashMap<String,String> mymap = new HashMap<String,String>();
     mymap.put("dom","house");
     mymap.put("kot","cat");
     mymap.put("pies","dog");
     mymap.put("wąż","snake");
     mymap.put("woda","water");
     mymap.put("kiełbasa","sausage");
     mymap.put("mama","mother");
     mymap.put("tata","father");
     mymap.put("babcia","grandmather");
     mymap.put("dziadek","grandfather");
     mymap.put("siostra","sister");
     mymap.put("brat","brother");
     mymap.put("córka","dother");
     mymap.put("syn","son");
     mymap.put("słońce","sun");
      mymap.put("chmura","sun");
     mymap.put("misiek","Teddy");
     mymap.put("pająk","spider");
     mymap.put("banan","banana");
     mymap.put("truskawka","strawbery");
   
   //szablon >>> mymap.put("slowoPolskie","Tlumaczenie") itd...
     
     return mymap;
     
    }
}
