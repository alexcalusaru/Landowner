package landowner.business;

public class Circle implements Land {

	private float r;

	public Circle(float r) {
		super();
		this.r = r;
	}

	@Override
	public float computeArea() {

		return (float) (3.14 * r * r);

	}

}
