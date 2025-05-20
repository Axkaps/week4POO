package asciiart;

/**
 * Rectangle class represents a rectangular shape defined by a position,
 * height, and width. It extends the abstract {@link Form} class and provides
 * an implementation for calculating intersections with horizontal lines.
 */
public class Rectangle extends Form {
    private final int height;
    private final int width;

    /**
     * Constructs a Rectangle with the specified position, height, and width.
     *
     * @param posX   the x-coordinate of the upper-left corner
     * @param posY   the y-coordinate of the upper-left corner
     * @param height the height of the rectangle
     * @param width  the width of the rectangle
     */
    public Rectangle(int posX, int posY, int height, int width) {
        super(posX, posY);
        this.height = height;
        this.width = width;
    }

    /**
     * Returns the x-coordinates where the rectangle intersects a horizontal line at the given y-coordinate.
     *
     * @param y the y-coordinate of the horizontal line
     * @return an array of x-coordinates where the rectangle intersects the line, or {@code null} if there is no intersection
     */
    @Override
    public int[] intersection(int y){
        int[] intersect = new int[0];

        if (y == posY || y == (posY + height - 1)) {
            intersect = new int[this.width];
            for (int i = 0; i < width; i++) {
                intersect[i] = posX + i;
            }
        }

        if(y > posY && y < posY + height - 1) {
            intersect = new int[2];
            intersect[0] = posX;
            intersect[1] = posX + width - 1;
        }

        return intersect;
    }

}
