package com.nt.tyres;

import org.springframework.stereotype.Component;

@Component("michelinTyres")
public class MichelinTyres implements Tyres {

	@Override
	public void rotate() {
		
		System.out.println("Michelin tyres are rotating  with excelllent grip");
	}

}
