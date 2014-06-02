package br.com.group.testeaps;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class AppTest{ 
    
	@Test
    public void testIdade(){
        App app = new App();
		assertTrue(app.isIdadezero());
		app.setIdade(1);
		assertFalse(app.isIdadezero());
		app.setIdade(0);
		assertTrue(app.isIdadezero());
		ArrayList<Pessoa> p = new ArrayList<Pessoa>();
		
		
    }

	
}
