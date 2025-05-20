package asciiart;


/**
 * Represents a triangular shape positioned on a 2D grid, defined by its base width and height.
 * Extends the Form class.
 *
 */
public class Triangle extends Form{

    private int base;
    private int height;
    private float m;
    private float b;


    /**
     * Constructs a Triangle with the given position, base width, and height.
     *
     * @param posX   the x-coordinate of the apex (top point) of the triangle
     * @param posY   the y-coordinate of the apex (top point) of the triangle
     * @param base   the width of the base of the triangle
     * @param height the vertical height of the triangle
     */
    public Triangle(int posX, int posY, int base, int height) {
        super(posX, posY);
        this.base = base;
        this.height = height;
        this.m = (float) height /((float)base / (float)2);
    }

    /**
     * Calculates the horizontal intersection points of the triangle with a horizontal line at y.
     *
     * @param y the y-coordinate of the horizontal line
     * @return an array of x-coordinates where the triangle intersects the line,
     *         or null if there is no intersection
     */
    @Override
    public int[] intersection(int y){
        int[] intersect = new int[0];

        if(y == posY+height-1){
            intersect = new int[this.base];
            int start = (int) posX - this.base / 2;
            int end = (int) posX + this.base / 2;
            for(int i = start; i <= end; i++)
                intersect[i] = i;
        }
        if(y < posY + height - 1 && y >= posY){
            intersect = new int[2];
            intersect[0] = (int) ((float)(y - (posY - this.m * posX)) / this.m);
            intersect[1] = (int) ((float)(y - (posY + this.m * posX)) / (-this.m));
        }

        return intersect;
    }

}
