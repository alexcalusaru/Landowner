package landowner.construction;

import java.util.ArrayList;
import java.util.List;

import landowner.business.Circle;
import landowner.business.Land;
import landowner.business.Landowner;
import landowner.business.OwnerRole;
import landowner.business.Rectangle;
import landowner.business.Square;
import landowner.business.Triangle;

public class Application {

	private OwnerRole landowner;

	public Application() {
		List<Land> list = new ArrayList<>();
		landowner = new Landowner(list);
	}
	public static void main(String[] args) {
		Application application = new Application();
		application.launch();

	}

	private void launch() {
		
		Rectangle rectangle = new Rectangle(10,20);
		landowner.add(rectangle);
		System.out.println(landowner.computeTotalArea());
		Rectangle rectangle2 = new Rectangle(3,4);
		landowner.add(rectangle2);
		System.out.println(landowner.computeTotalArea());
		Square square = new Square(10);
		landowner.add(square);
		System.out.println(landowner.computeTotalArea());
		Triangle triangle = new Triangle(2,3,4);
		landowner.add(triangle);
		System.out.println(landowner.computeTotalArea());
		Circle circle = new Circle(5);
		landowner.add(circle);
		System.out.println(landowner.computeTotalArea());
		
	}

}
