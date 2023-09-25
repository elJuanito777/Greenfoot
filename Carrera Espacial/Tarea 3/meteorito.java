import greenfoot.*;  // Importa la biblioteca Greenfoot

public class meteorito extends Actor {
    private int yDirection = 1; // Variable para controlar la dirección vertical

    public void act() {
        // Mueve el meteorito hacia la izquierda
        setLocation(getX() - 2, getY());

        // Realiza un movimiento de zigzag vertical
        setLocation(getX(), getY() + yDirection * 2);

        // Cambia la dirección vertical cuando alcanza ciertos límites
        if (getY() <= 10 || getY() >= getWorld().getHeight() - 10) {
            yDirection *= -1; // Invierte la dirección vertical
        }

        // Verifica si el meteorito sale del mundo por la izquierda
        if (getX() <= 0) {
            // Obtiene una referencia al mundo
            World world = getWorld();
            
            // Elimina el meteorito actual
            world.removeObject(this);
            
            // Crea un nuevo meteorito en el borde derecho del mundo
            world.addObject(new meteorito(), world.getWidth() - 1, Greenfoot.getRandomNumber(world.getHeight()));
        }
    }
}







