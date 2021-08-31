import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor
{
/**
 * Add stepCounter variable (private instance var)
 * intialize the variable to zero.
 * increment the sC in act by one.
 * Out put sC.
 * when sC is greater than 100, remove this flower from the world.
 */
    private int stepCounter;
    public Flower()
    {
        GreenfootImage gfi = new GreenfootImage("newflower.png");
        gfi.scale(100, 100 );
        this.setImage(gfi);
        this. stepCounter = 0; 
        // gfi is freed up

    }  

    /**
     * Act - do whatever the Flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        System.out.println(this.getRotation() );
        if(this.getRotation() == 360) //double equals test for equality
        {
            this.stepCounter = this.stepCounter + 1;
        }
        if (this.stepCounter > 100);
        {
            World w = this.getWorld();
            w.removeObject(this);
        }
        //write code that will spin this object 360 degrees at
        //15 degrees each time it acts. Then the flower should
        //disappear
    }
}
