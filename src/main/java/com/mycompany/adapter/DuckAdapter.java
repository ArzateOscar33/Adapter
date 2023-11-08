
package com.mycompany.adapter;
//Arzate Martinez Oscar Giovanny 20211122
public class DuckAdapter implements Turkey {
	Duck duck;
	
 
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		
	}
    
	public void gobble() {
		duck.quack();
	}
  
	public void fly() {
		
		     duck.fly();
		
	}
}