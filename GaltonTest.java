/* Andrew Britton, Maria Lernyei
09/29/15
CPW 143 Java II
Galton Machine
*/

import java.util.Scanner;
import java.util.Random;

public class GaltonTest {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of balls to drop: ");
        int balls = input.nextInt();
        System.out.println("Enter the amount of slots: ");
        int slots = input.nextInt();
        
		int[] ballsPosition = new int[balls];
        int value, numberOfRs;
       
		// simulates the dropping of each ball, landing either left or right.

		for (int i = 0; i < balls; i++) {
            numberOfRs = 0;
			for (int j = 0; j < slots; j++) {
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
        System.out.println("\n");
        
        for (int k = 0; k < slots; k++) {
            System.out.println(k + ": ");
        }
        
      
    }
}

/*
for (int ball = 0; ball > numBalls; ball++) {
    int slot = 0;
    for (int level = 1; level < numSlots; level++) {
        if (rand.nextBoolean() ) {
        System.out.print("R");
        slot++
        }
        else {
            System.out.print("L");
        }
    }
    slots[slot]++;
    System.out.println(" slot is " + slot);
}

for (int slot = 0; slot < numSlots; slot++) {
    System.out.print(slot + ": ");
    for (int i = 0; i < slots[slot]; i++) {
        System.out.print("O");
    }
}

*/