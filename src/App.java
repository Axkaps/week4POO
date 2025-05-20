import asciiart.Aggregate;
import asciiart.Image;
import asciiart.Rectangle;
import asciiart.Triangle;

public class App {


    public static void main(String[] args) {
        Image img=new Image(20,15);
        Aggregate casa= new Aggregate(0,0);
        casa.addForm(new Rectangle(0,5,15,15));
        casa.addForm(new Rectangle(5,15,5,5));
        casa.addForm(new Rectangle(2,7,4,3));
        casa.addForm(new Rectangle(9,7,4,3));
        casa.addForm(new Rectangle(2,11,4,3));
        casa.addForm(new Rectangle(9,11,4,3));
        casa.addForm(new Rectangle(5,15,5,5));
        casa.addForm(new Triangle(7,0,15,5));
        img.addForm(casa);
        System.out.println(img);
        System.out.println(img.line(10));

    }
}