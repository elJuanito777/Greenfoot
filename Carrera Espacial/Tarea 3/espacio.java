import greenfoot.*; 

/**
 * Write a description of class espacio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class espacio extends MyWorld
{
    private boolean reiniciarJuego = false;
    
    public void act() {
        if (reiniciarJuego) {
            Greenfoot.setWorld(new espacio()); // Reinicia el mundo
            reiniciarJuego = false; // Restablece la variable de reinicio
        }
        
        // Verifica si se presiona la tecla "r" para reiniciar el juego
            if (Greenfoot.isKeyDown("r")) {
             Greenfoot.setWorld(new espacio()); 
            }
         
            
    }
    
     public void solicitarReinicio() {
        reiniciarJuego = true;
    }
    
    /**
     * Constructor for objects of class espacio.
     * 
     */
    public espacio()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        meteorito meteorito = new meteorito();
        addObject(meteorito,557,218);
        cohete cohete = new cohete();
        addObject(cohete,54,226);
        cohete.setLocation(46,222);
        meteorito.setLocation(561,203);
        cohete.setLocation(69,206);
        meteorito.setLocation(596,210);
        cohete.setLocation(43,215);
        meteorito.setLocation(539,191);
        cohete.setLocation(74,207);
        meteorito.setLocation(568,191);
        cohete.setLocation(63,205);
        cohete.setLocation(22,212);
        cohete.setLocation(65,193);
        cohete.setLocation(54,212);
        meteorito.setLocation(588,206);
        meteorito meteorito2 = new meteorito();
        addObject(meteorito2,567,34);
        meteorito meteorito3 = new meteorito();
        addObject(meteorito3,567,367);
        meteorito.setLocation(570,192);
        meteorito3.setLocation(510,308);
        meteorito2.setLocation(529,65);
        meteorito3.setLocation(520,333);
        meteorito.setLocation(569,147);
        meteorito2.setLocation(546,63);
        meteorito3.setLocation(548,351);
        meteorito meteorito4 = new meteorito();
        addObject(meteorito4,457,40);
        meteorito meteorito5 = new meteorito();
        addObject(meteorito5,568,270);
        meteorito3.setLocation(338,304);
        meteorito5.setLocation(473,222);
        meteorito3.setLocation(447,338);
        meteorito4.setLocation(411,60);
        meteorito2.setLocation(497,71);
        meteorito.setLocation(552,279);
        meteorito5.setLocation(405,230);
    }
    
     public void setreiniciarJuego(boolean reiniciar) {
        this.reiniciarJuego = reiniciar;
    }
}
