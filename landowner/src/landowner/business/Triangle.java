package landowner.business;

public class Triangle implements Land {

	private float l1,l2,l3;
	
	public Triangle(float l1, float l2, float l3) {
		super();
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

	@Override
	public float computeArea() {
		
		float p = (l1+l2+l3)/2;
		float a = (float) Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
		return a;
	}

	
}
