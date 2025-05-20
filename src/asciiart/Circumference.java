package asciiart;

/**
 * Represents a circular circumference shape with a center position and a radius.
 * Extends the Form class.
 */
public class Circumference extends Form {

    private final int raio;

    /**
     * Constructs a new Circumference with the specified position and radius.
     *
     * @param posX the x-coordinate of the center of the circumference
     * @param posY the y-coordinate of the center of the circumference
     * @param raio the radius of the circumference
     */
    public Circumference(int posX, int posY, int raio) {
        super(posX, posY);
        this.raio = raio;
    }

    /**
     * Calculates the intersection points of the circumference with a horizontal line at the specified y-coordinate.
     * @param y the y-coordinate of the horizontal line
     * @return an array of x-coordinates where the circumference intersects the line,
     *         or null if there is no intersection
     */
    @Override
    public int[] intersection(int y){
        int[] intersect = new int[0];

        if(y == posY + this.raio || y == posY - this.raio){
            intersect = new int[1];
            intersect[0] = posX;
        }
        if(y < (posY + this.raio) && y > (posY - this.raio)){
            intersect = new int[2];
            intersect[0] = (int)(posX - Math.sqrt(Math.pow(this.raio, 2) - Math.pow((y - posY), 2)));
            intersect[1] = (int)(posX + Math.sqrt(Math.pow(this.raio, 2) - Math.pow((y - posY), 2)));
        }

        return intersect;
    }

    /**
     * Returns the radius of the circumference.
     *
     * @return the radius
     */
    public int getRaio() {
        return this.raio;
    }

}
