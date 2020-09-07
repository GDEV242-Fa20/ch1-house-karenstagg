/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Karen Stagg
 * @version 2020.09.07
 */
public class Picture
{
    private Square sandLot;
    private Square netPost1;
    private Square netPost2;
    private Person player1;
    private Person player2;
    private Circle sun;
    private Circle ball;
    private Triangle topnet1;
    private Triangle topnet2;
    private Triangle topnet3;
    private Triangle topnet4;
    private Triangle topnet5;
    private Triangle topnet6;
    private Triangle botnet1;
    private Triangle botnet2;
    private Triangle botnet3;
    private Triangle botnet4;
    private Triangle botnet5;
    private Triangle botnet6;
    
    // private Square window;
    // private Triangle roof;
    // private Circle sun;
    // private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sandLot = new Square();
        netPost1 = new Square();
        netPost2 = new Square();
        player1 = new Person();
        player2 = new Person();
        ball = new Circle();
        topnet1 = new Triangle();
        topnet2 = new Triangle();
        topnet3 = new Triangle();
        topnet4 = new Triangle();
        topnet5 = new Triangle();
        topnet6 = new Triangle();
        botnet1 = new Triangle();
        botnet2 = new Triangle();
        botnet3 = new Triangle();
        botnet4 = new Triangle();
        botnet5 = new Triangle();
        botnet6 = new Triangle();
        //roof = new Triangle();  
        sun = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.changeColor("blue");
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
