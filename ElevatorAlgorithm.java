package ElevatorAlgorithm;

import java.util.Scanner;

public class ElevatorAlgorithm {
	public final int totalFloor = 10;
	public static int elev1 = 3;
	public static int elev2 = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int currentFloor = sc.nextInt();
		boolean direction = sc.nextBoolean(); // true = up, false = down

		int distance1 = DistanceCalculator(elev1, currentFloor);
		int distance2 = DistanceCalculator(elev2, currentFloor);	

		if (direction = true) {
			if (distance1 > distance2) {
				System.out.println("call Elevator1");
			} else {
				System.out.println("call Elevaotr2");
			}
		} else {
			if (elev1 > elev2) {
				System.out.println("call Elevator1");
			} else {
				System.out.println("call Elevator2");
			} 
		}
	}
	public static int DistanceCalculator(int elevator, int floor) {
		int distance = elevator - floor;
		if ((elevator - floor) < 0) {
			distance = (elevator - floor) * (-1);
		}
		return distance;
	}
}
