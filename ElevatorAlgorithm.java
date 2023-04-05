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

		int distance1 = elev1 - currentFloor;
		if (distance1 < 0) {
			distance1 = distance1 * (-1);
		} 
		int distance2 = elev2 - currentFloor;
		if (distance2 < 0) {
			distance2 = distance2 * (-1);
		}

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
}
