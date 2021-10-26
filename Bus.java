
/**
 *
 * QUESTION 7
 *
 * Mark Alexander
 *
 * 20112145
 *
 * COMP503
 *
 * */

public class Bus extends Vehicle
{

	@Override
	public void honk() {
		super.honk();
		System.out.println("BEEEEEP");
	}
	
	@Override
	public void model() {
		System.out.println("Bus-B");
	}

}
