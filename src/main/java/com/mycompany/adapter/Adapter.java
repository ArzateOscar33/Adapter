
package com.mycompany.adapter;
//Arzate Martinez Oscar Giovanny 20211122
public class Adapter {

    public static void main(String[] args) {
        //hacemos las instancias 
        	MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);
                Turkey turkey= new WildTurkey();
                
        //Pavo
                System.out.println("El pavo dice : ");
                turkey.gobble();
                turkey.fly();
        //Pato
                System.out.println("El Pato dice :");
                duck.quack();
                duck.fly();
        //Pavo haciendoce pasar por pato
                System.out.println("El Pavo adaptado dice : ");
		duckAdapter.gobble();
		duckAdapter.fly();
                
           
                
                
		
    }
}
