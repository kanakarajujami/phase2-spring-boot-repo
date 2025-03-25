package com.nt.tyres;

import org.springframework.stereotype.Component;

@Component("brideStoneTyres")
public class BridgeStoneTyres implements Tyres {

	@Override
	public void rotate() {
		
		System.out.println("Bridgestone tyres moving very smoothly");

	}

}
