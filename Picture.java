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
    private Square sky;
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
        sky = new Square();
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
            
            sandlot.moveHorizontal(-320);
            sandLot.changeSize(550);
            sandlot.changeColor("tan");
            sandLot.makeVisible();
            
            sky.changeColor("skyblue");
            sky.moveHorizontal(-340);
            sky.moveVertical(-550);
            sky.changeSize(550);
            sky.makeVisible();
            
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            ball.changeColor ("magenta");
            ball.moveHorizontal(15);
            ball.moveVertical(-130);
            ball.changeSize(18);
            ball.makeVisible();
            
            netPost1.changeColor("white");
            netPost1.moveHorizontal(-165);
            netPost1.moveVertical(-55);
            netPost1.changeSize(95);
            netPost1.makeVisible();
            
            netPost2.changeColor("white");
            netPost2.moveHorizontal(-40);
            netPost2.moveVertical(-55);
            netPost2.changeSize(95);
            netPost2.makeVisible();
            
            topnet1.changeColor("white");
            topnet1.changeSize(20,60);
            topnet1.moveHorizontal(-170);
            topnet1.moveVertical(-55);
            topnet1.makeVisible();
           
            botnet1.changeColor("white");
            botnet.changeSize(20,60);
            botnet1.moveHorizontal(-170);
            botnet1.moveVertical(-55);
            botnet1.makeVisible();
            
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
