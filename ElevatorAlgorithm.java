package ElevatorAlgorithm;

import java.util.Scanner;

public class ElevatorAlgorithm {
	public final int totalFloor = 10;
	public static int elev1 = 3;
	public static int elev2 = 10;
	public final static int wattPerFloor = 10;
	public final static int[] floorHeights = {15,10,10,10,10,10,10,10,10,15,5};
	public final static int wattPerHeight = 4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int currentFloor = sc.nextInt();
		boolean direction = sc.nextBoolean(); // true = up, false = down

		int distance1 = DistanceCalculator(elev1, currentFloor);
		int distance2 = DistanceCalculator(elev2, currentFloor);	

//		int power1 = EnergyCalculator(distance1, elev1, currentFloor);
//		int power2 = EnergyCalculator(distance2, elev2, currentFloor);

		int power1 = HeightCalculator(elev1, currentFloor);
		int power2 = HeightCalculator(elev2, currentFloor);
		
		ScreenOutput(power1, power2);
	}
	
	public static int DistanceCalculator(int elevator, int floor) {
		int distance = elevator - floor;
		if ((elevator - floor) < 0) {
			distance = (elevator - floor) * (-1);
		}
		return distance;
	}
	
	public static int HeightCalculator(int elevator, int currentFloor) {
		int res;
		int sumHeight = 0;
		if ((elevator - currentFloor) > 0) {
			for (int i = (currentFloor - 1); i < (elevator - 1); i++) {
				sumHeight = sumHeight + floorHeights[i];
			}
			res = sumHeight * (wattPerHeight / 2);
		} else {
			for (int i = (elevator - 1); i < (currentFloor - 1); i++) {
				sumHeight = sumHeight + floorHeights[i];
			}
			res = sumHeight * wattPerHeight;
		}
		return res;
	}
	
	public static void ScreenOutput( int power1, int power2) {	
//		if (direction = true) {
//			if (distance1 > distance2) {
//				System.out.println("call Elevator1");
//			} else {
//				System.out.println("call Elevaotr2");
//			}
//		} else {
//			if (elev1 > elev2) {
//				System.out.println("call Elevator1");
//			} else {
//				System.out.println("call Elevator2");
//			} 
//		}
		if (power1 > power2) {
			System.out.println("call Elevator1");
		} else {
			System.out.println("call Elevator2");
		}
	}
	
	public static int EnergyCalculator(int distance, int elevator, int currentFloor) {
		int res;
		res = distance * wattPerFloor;
		if (elevator > currentFloor) {
			res = res/2;
		}
		return res;
	}
}
