package asciiart;

/**
 * The Form class serves as an abstract base class for 2D shapes
 * that can be positioned using x and y coordinates.
 * Subclasses must implement the {@link #intersection(int)} method to
 * define how they intersect with a given horizontal line.
 */
public abstract class Form {


    protected int posX;
    protected int posY;

    /**
     * Constructs a Form with the specified x and y position.
     *
     * @param posX the horizontal position
     * @param posY the vertical position
     */
    public Form(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    /**
     * Calculates the intersection of the form with a horizontal line at the given y-coordinate.
     * The specific intersection logic depends on the shape and must be implemented by subclasses.
     *
     * @param y the y-coordinate of the horizontal line
     * @return an array of x-coordinates where the form intersects the line
     */
    public abstract int[] intersection(int y);
}
