package landowner.business;

import java.util.List;

public class Landowner implements OwnerRole {

	private List<Land> lands;
	public Landowner(List<Land> lands) {
		super();
		this.lands = lands;
	}
	@Override
	public float computeTotalArea() {
		float totalArea = 0;
		for (Land land : lands) {
			totalArea += land.computeArea();
		}
		return totalArea;
	}
	@Override
	public void add(Land land) {
		lands.add(land);
	}
	@Override
	public void remove(Land land) {
		lands.remove(land);
	}
	
	
}
