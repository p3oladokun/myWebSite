import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class eater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlowerEater extends Actor
{
    /**
     * Act - do whatever the eater wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        if( this.isTouching( Flower.class  ))
        {
            this.removeTouching( Flower.class  );
        }
    }
}
