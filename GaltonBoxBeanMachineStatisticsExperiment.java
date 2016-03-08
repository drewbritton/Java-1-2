import java.util.Random;
import java.util.Scanner;

public class GaltonBoxBeanMachineStatisticsExperiment {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		System.out
				.println("I only put in enough cases for 7 slots, you can add as many balls as you like.");

		System.out.println("Please enter the number of balls: ");
		int numberOfBalls = input.nextInt();
		System.out.println("Please enter the number of slots: ");
		int numberOfSlots = input.nextInt();
		int value, numberOfRs;

		int[] ballsPosition = new int[numberOfBalls];

		// Generate each ball drops L and R moves and count how many Rs

		for (int i = 0; i < numberOfBalls; i++) {
			numberOfRs = 0;
			for (int j = 0; j < numberOfSlots; j++) {
				value = random.nextInt(2);
				if (value == 0) {
					System.out.print("L");
				} else {
					System.out.print("R");
					numberOfRs++;
				}

			}
			ballsPosition[i] = numberOfRs;
			System.out.println(" slot is " + ballsPosition[i]);
		}


		// Output visual of how balls would look when theyve come down
 

		int positionCount0 = 0;
		int positionCount1 = 0;
		int positionCount2 = 0;
		int positionCount3 = 0;
		int positionCount4 = 0;
		int positionCount5 = 0;
		int positionCount6 = 0;

		/*for (int i = 0; i < ballsPosition.length; i++) {
	        for (int j = 0; j < numberOfSlots; j++) {
			    if (ballsPosition[i] == j) {
					switch (ballsPosition[i]) {

					case 0:
						positionCount0++;
						break;
					case 1:
						positionCount1++;
						break;
					case 2:
						positionCount2++;
						break;
					case 3:
						positionCount3++;
						break;
					case 4:
						positionCount4++;
						break;
					case 5:
						positionCount5++;
						break;
					case 6:
						positionCount6++;
						break;
					}

				}

			}

		}*/

		for (int i = ballsPosition.length; i >= 0; i--) {
			if (positionCount0 > i) {
				System.out.print("O");
			} else {
				System.out.print(" ");
			}
			if (positionCount1 > i) {
				System.out.print("O");
			} else {
				System.out.print(" ");
			}
			if (positionCount2 > i) {
				System.out.print("O");
			} else {
				System.out.print(" ");
			}
			if (positionCount3 > i) {
				System.out.print("O");
			} else {
				System.out.print(" ");
			}
			if (positionCount4 > i) {
				System.out.print("O");
			} else {
				System.out.print(" ");
			}
			if (positionCount5 > i) {
				System.out.print("O");
			} else {
				System.out.print(" ");
			}
			if (positionCount6 > i) {
				System.out.print("O");
			}
			System.out.println();
		}

	}

}