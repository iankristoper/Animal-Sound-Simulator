
package com.ian.animal_sound;

/**
 *
 * @author Ian Tagano
 */

public class Animal_Sound 
{

    public static void main(String[] args) 
    {
        //using base class as blueprint and subclass as new object this promotes polymorphism
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal horse = new Horse();
        
        
        System.out.println("Animal sounds: ");
        
        //calling methods from the base class
        dog.makeSound();
        cat.makeSound();
        horse.makeSound();
    }
}
