package asciiart;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an aggregate {@link Form} composed of multiple {@link Form} objects.
 *
 * The Aggregate class allows combining multiple shapes into one compound shape
 * and computes the horizontal intersections for all its sub-forms at a given y-coordinate.
 * The resulting intersections are adjusted by the aggregate's posX offset.
 */
public class Aggregate extends Form{

    List<Form> forms;

    /**
     * Constructs an empty Aggregate form at the specified position.
     *
     * @param posX the horizontal position of the aggregate
     * @param posY the vertical position of the aggregate
     */
    public Aggregate(int posX, int posY){
        super(posX, posY);
        forms = new ArrayList<Form>();
    }

    /**
     * Adds a new {@link Form} to the aggregate.
     *
     * @param form the form to be added
     */
    public void addForm(Form form){
        forms.add(form);
    }

    /**
     * Computes the horizontal intersections of all sub-forms at the specified y-coordinate.
     *
     * The resulting x-values are adjusted by the aggregate's posX offset,
     * effectively translating the forms horizontally.
     *
     * @param y the y-coordinate of the scanline
     * @return an array of x-coordinates where the aggregate intersects the scanline;
     *         may be empty if no sub-forms intersect at that y-level
     */
    @Override
    public int[] intersection(int y){
        int[] intersects = new int[0];
        int[] aux;

        for(Form form : forms){
            aux = form.intersection(y - posY);
            intersects = junta(intersects,aux);
        }

        for(int i = 0; i < intersects.length; i++){
            intersects[i] += this.posX;
        }

        return intersects;
    }

    /**
     * Concatenates two integer arrays.
     *
     * @param v1 the first array
     * @param v2 the second array
     * @return a new array containing all elements of v1 followed by v2;
     */
    private int[] junta(int[] v1, int[] v2){
        int[] result = new int[v1.length+v2.length];

        for(int i=0; i<v1.length; i++)
            result[i]=v1[i];

        for(int i=v1.length; i< v1.length+v2.length;i++)
            result[i]=v2[i-v1.length];

        return result;
    }

}
