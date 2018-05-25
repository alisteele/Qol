package uk.ac.qub.oo;

public class WhatDoesTheFoxSay {

	public static void main(String[] args) {
 
		// create all objects
		
		// create the dog
		Animal dog = new Animal();
		dog.setName("Dog");
		dog.setNoise("WOOF");

		// create the dog
		Animal cat = new Animal();
		cat.setName("Cat");
		cat.setNoise("MEOW");
		
		// bird 
		Animal bird = new Animal();
		bird.setName("Bird");
		bird.setNoise("TWEET");
		
		// mouse 
		Animal mouse = new Animal();
		mouse.setName("Mouse");
		mouse.setNoise("SQUEAK");
		
		//fox #1
		Animal fox = new Animal();
		fox.setName("FOX");
		fox.setEyeColour("BLUE");
		fox.setNoseType("POINTY");
		fox.setPawSize("TINY");
		fox.setFurColour("RED");
		fox.setNoise("Ring-ding-ding-ding-dingeringeding!");
		
		
		// output lyrics
		System.out.print(dog.getName());
		System.out.print(" goes ");
		dog.makeNoise();
		
		System.out.print(cat.getName());
		System.out.print(" goes ");
		cat.makeNoise();
		
		System.out.print(bird.getName());
		System.out.print(" goes ");
		bird.makeNoise();
		
		System.out.print(mouse.getName());
		System.out.print(" goes ");
		mouse.makeNoise();
		
		System.out.println("But there's one sound that no one knows... ");
		System.out.println("WHAT DOES THE FOX SAY?");
		for (int loop=1; loop<4; loop++){
			fox.makeNoise();
		}
		
		System.out.println("Big "+fox.getEyeColour() + " eyes");
		System.out.println(fox.getNoseType() + " nose");
		System.out.println(fox.getPawSize() + " paws");
		System.out.println("your fur is "+fox.getFurColour());

		System.out.println("WHAT DOES THE FOX SAY?");
		for (int loop=1; loop<4; loop++){
			fox.makeNoise();
		}
		

	}
}
