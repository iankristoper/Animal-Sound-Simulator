package com.ian.animal_sound;

/**
 *
 * @author Ian Tagano
 */

//creating new class and inheret the animal base class 
public class Cat extends Animal
{
    //using the methods from the base class and overrides it 
    @Override 
    public void makeSound()
    {
        System.out.println("Cat: Meow meow!");
    }
}
