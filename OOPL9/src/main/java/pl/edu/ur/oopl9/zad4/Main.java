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
     //ciąg dalszy wprowadzania
     mymap.put("dom","house");
     mymap.put("kot","cat");
     mymap.put("pies","dog");
     mymap.put("dom","house");
     mymap.put("kot","cat");
     mymap.put("pies","dog");
     mymap.put("dom","house");
     mymap.put("kot","cat");
     mymap.put("pies","dog");
     mymap.put("dom","house");
     mymap.put("kot","cat");
     mymap.put("pies","dog");
      mymap.put("kot","cat");
     mymap.put("pies","dog");
     mymap.put("dom","house");
     mymap.put("kot","cat");
     mymap.put("pies","dog");
   
   //szablon >>> mymap.put("slowoPolskie","Tlumaczenie") itd...
     
     return mymap;
     
    }
}
