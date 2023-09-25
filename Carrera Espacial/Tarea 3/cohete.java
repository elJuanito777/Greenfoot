import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cohete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cohete extends Actor {
    private int velocidad = 10; // Ajusta la velocidad del cohete según tus preferencias.
    
    public cohete() {
        // Constructor del cohete
        GreenfootImage imagen = getImage(); // Obtiene la imagen actual del cohete
        int nuevoAncho = imagen.getWidth() / 2; // Define el nuevo ancho (ajusta según tus necesidades)
        int nuevoAlto = imagen.getHeight() / 2; // Define el nuevo alto (ajusta según tus necesidades)
        imagen.scale(nuevoAncho, nuevoAlto); // Escala la imagen al nuevo tamaño
        setImage(imagen); // Establece la imagen redimensionada en el cohete
    }
    
    public void act() {
        // Control de movimiento con las teclas de flecha.
    
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - velocidad); // Mover hacia arriba.
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + velocidad); // Mover hacia abajo.
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - velocidad, getY()); // Mover hacia la izquierda.
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + velocidad, getY()); // Mover hacia la derecha.
        }
         // Verifica si el cohete ha llegado al borde derecho del mundo
        if (getX() >= getWorld().getWidth() - 1) {
            mostrarMensajeGanador();
            Greenfoot.stop(); // Detiene el juego
        }
        // Verifica colisiones con meteoritos
        Actor meteorito = getOneIntersectingObject(meteorito.class);
        
        
       if (meteorito != null) {
            // Si hay colisión con un meteorito, elimina el cohete
            getWorld().showText("¡Choque! Presiona 'r' para reiniciar", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            getWorld().removeObject(this);
        }
    
     } 
     
     private void mostrarMensajeGanador() {
        
        getWorld().showText("Has ganado", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
    }
 }

