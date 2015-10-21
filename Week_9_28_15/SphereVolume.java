
public class SphereVolume{

	public static void main(String[] args){
		System.out.println("Enter Radius");
		double radius = -2;
		//error check

			do {
				radius = IO.readDouble();
				if(radius <= 0){
					System.out.println("Can't have negative or 0 radius, Enter Again:");
				}
			}while(radius <= 0);

				double volume;
				volume = (double) 4/3 * Math.PI * Math.pow(radius, 3);
				System.out.println("Volume:" + volume);
	}
}
