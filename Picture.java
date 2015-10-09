/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square tierra;
    private Person peregrino;
    private Triangle cometa1;
    private Triangle cometa2;
    private Triangle cometa3;
   

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        
        tierra = new Square();
        tierra.changeColor("green");
        tierra.moveHorizontal(-320);
        tierra.moveVertical(140);
        tierra.changeSize(2000);
        tierra.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-90);
        sun.changeSize(80);
        sun.makeVisible();
        
        peregrino = new Person();
        peregrino.makeVisible();
        peregrino.moveVertical(40);
        peregrino.moveHorizontal(-300);
        
        cometa3 = new Triangle();
        cometa3.moveHorizontal(200);
        cometa3.changeSize(80,70);
        cometa3.changeColor("yellow");
        cometa3.moveVertical(40);
        
        cometa2 = new Triangle();
        cometa2.moveHorizontal(200);
        cometa2.changeSize(70,60);
        cometa2.changeColor("blue");
        cometa2.moveVertical(20);
        
        cometa1 = new Triangle();
        cometa1.moveHorizontal(200);
        cometa1.changeSize(60,50);
        cometa1.changeColor("magenta");
        
       

    
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    
    /**
     * Método para hacer que el sol se mueva hasta tocar el horizonte.
     */
    public void moveSum(){
         if (wall != null){
        sun.slowMoveVertical(180);        
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("yellow");
        tierra.changeColor("black");
    }
    }

    /**
     * Aparece una persona por la izquierda, desplazandose hasta llegar a la casa.
     */
    public void aparecePersona(){
        peregrino.slowMoveHorizontal(185);
    }
    
    /**
     * Este método crea un cometa de tres colores.
     */ 
    public void apareceCometa(){
        if (wall != null){
           cometa3.makeVisible();
           cometa2.makeVisible();
           cometa1.makeVisible();
    }
   }
   
   /**
     * Este método hace que el cometa de tres colores se desplace hacia arriba hasta desaparecer
     */ 
    public void desplazaCometa(){
        if (wall != null){
           cometa3.makeVisible();
           cometa2.makeVisible();
           cometa1.makeVisible();
           cometa3.slowMoveVertical(-300);
           cometa2.slowMoveVertical(-300);
           cometa1.slowMoveVertical(-300);}
   }
}