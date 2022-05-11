package landowner.business;

public class Rectangle implements Land {

	private float width;
	private float length;

	public Rectangle(float width, float length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	public float computeArea() {

		return length * width;
		
	}
}
