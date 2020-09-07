/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 * The picture is a beach scene with 2 people playing catch, and 1 person 
 * suntanning themself.  
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Karen Stagg
 * @version 2020.09.07
 */
public class Picture
{
    private Square sandLot;
    private Square sky1;
    private Square sky2;
    private Square netPost1;
    private Square netPost2;
    private Person player1;
    private Person player2;
    private Circle sun;
    private Circle ball;
    private Triangle bird1;
    private Triangle bird2;
    private Triangle bird3;
    private Square towel1;
    private Square towel2;
    private Person suntanner;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sandLot = new Square();
        sky1 = new Square();
        sky2 = new Square();
        player1 = new Person();
        player2 = new Person();
        ball = new Circle();
        sun = new Circle();
        bird1 = new Triangle();
        bird2 = new Triangle();
        bird3 = new Triangle();
        towel1 = new Square();
        towel2 = new Square();
        suntanner = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            sandLot.moveHorizontal(-310);
            sandLot.moveVertical(-20);
            sandLot.changeSize(550);
            sandLot.changeColor("tan");
            sandLot.makeVisible();
                        
            player1.changeSize(45,25);
            player1.makeVisible();
            
            player2.moveHorizontal(-120);
            player2.moveVertical(-60);
            player2.changeSize(40,20);
            player2.makeVisible();
            
            sky1.changeColor("skyblue");
            sky1.moveHorizontal(-310);
            sky1.moveVertical(-320);
            sky1.changeSize(300);
            sky1.makeVisible();
            
            sky2.changeColor("skyblue");
            sky2.moveHorizontal(-10);
            sky2.moveVertical(-320);
            sky2.changeSize(300);
            sky2.makeVisible();
            
            sun.changeColor("yellow");
            sun.moveHorizontal(130);
            sun.moveVertical(-80);
            sun.changeSize(60);
            sun.makeVisible();
            
            bird1.changeColor("white");
            bird1.moveVertical(-90);
            bird1.changeSize(7,21);
            bird1.makeVisible();
            
            bird2.changeColor("white");
            bird2.moveVertical(-95);
            bird2.moveHorizontal(-20);
            bird2.changeSize(7,21);
            bird2.makeVisible();
            
            bird3.changeColor("darkgrey");
            bird3.moveVertical(-110);
            bird3.moveHorizontal(-40);
            bird3.changeSize(9,27);
            bird3.makeVisible();
            
            towel1.changeColor("purple");
            towel1.moveVertical(30);
            towel1.moveHorizontal(50);
            towel1.changeSize(50);
            towel1.makeVisible();
            
            towel2.changeColor("blue");
            towel2.moveVertical(70);
            towel2.moveHorizontal(110);
            towel2.changeSize(50);
            towel2.makeVisible();
            
            suntanner.changeColor("tan");
            suntanner.changeSize(40,20);
            suntanner.moveVertical(-25);
            suntanner.moveHorizontal(100);
            suntanner.makeVisible();
            
            ball.changeColor ("magenta");
            ball.moveHorizontal(20);
            ball.moveVertical(20);
            ball.changeSize(18);
            ball.makeVisible();
            ball.slowMoveHorizontal(40);
            ball.slowMoveVertical(100);
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sandLot.changeColor("black");
        sky1.changeColor("white");
        sky2.changeColor("white");
        player1.changeColor("white");
        player2.changeColor("white");
        ball.changeColor("white");
        sun.changeColor("black");
        bird1.changeColor("black");
        bird2.changeColor("black");
        bird3.changeColor("black");
        towel1.changeColor("white");
        towel2.changeColor("white");
        suntanner.changeColor("black");
        
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sandLot.changeColor("tan");
        sky1.changeColor("skyblue");
        sky2.changeColor("skyblue");
        player1.changeColor("black");
        player2.changeColor("black");
        ball.changeColor("magenta");
        sun.changeColor("yellow");
        bird1.changeColor("white");
        bird2.changeColor("white");
        bird3.changeColor("darkgrey");
        towel1.changeColor("purple");
        towel2.changeColor("blue");
        suntanner.changeColor("tan");
    }
}
