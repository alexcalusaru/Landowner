package landowner.business;

public class Square implements Land {

	private float length;

	public Square(float length) {
		super();
		this.length = length;
	}

	@Override
	public float computeArea() {

		return length * length;
	}

}
