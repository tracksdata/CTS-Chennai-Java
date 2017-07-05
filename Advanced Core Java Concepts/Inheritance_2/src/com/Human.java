package com;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Human extends God {

	
	@Override // Annotation
	public void talk() {
		System.out.println("-- Human talking");
	}

	@Override
	public void work() {
		System.out.println("-- Human Working");
	}

	@Override
	public void sleep() {
		System.out.println("-- Human Sleeping");
	}

	public void robot() {
		System.out.println("--- Human Robot working");
	}

}
