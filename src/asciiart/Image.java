package asciiart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Image {

    private int height;
    private int width;
    private List<Form> formas;

    /**
     * Constructor for Image Class
     * @param height of the image
     * @param width of the image
     */
    public Image(int height, int width) {
        this.height = height;
        this.width = width;
        this.formas = new ArrayList<Form>();
    }

    /**
     * Adds a new form to the image
     * @param form that can be either a circumference, rectangle, triangle or an aggregate
     */
    public void addForm(Form form) {
        this.formas.add(form);
    }

    /**
     * Takes a line number y and returns a string representing the characters on the y-th line of the image.
     * @param y indexes the row of the image matrix
     * @return a string representing all the characters on the y-th line
     */
    public String line(int y){

        char[] line = new char[width];
        Arrays.fill(line,' ');

        if(y < 0 || y >= this.height){
            System.out.println("The y value is out of bounds");
            return null;
        }

        for(Form form : this.formas){
            int[] vals = form.intersection(y);
            if(vals == null)
                continue;

            for (int val : vals)
                if (val >= 0 && val < width)
                    line[val] = '*';


        }

        return new String(line);

    }

    /**
     * Override of toString(), to provide a human-readable string representation of an object
     * @return string representing my object
     */
    @Override
    public String toString() {
        String s = new String();
        for(int i = 0; i < this.height; i++)
            s += line(i) + '\n';

        return s;
    }

}
