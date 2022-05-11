package landowner.business;

public interface OwnerRole {

	float computeTotalArea();

	void add(Land land);

	void remove(Land land);

}