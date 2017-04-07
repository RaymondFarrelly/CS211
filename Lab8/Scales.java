import java.util.*;

public class scales {
	public static void main(String args[]) {
		int numbers[] = {19, 27, 51, 68, 73, 86, 106, 123, 132,135,
						151, 184, 321, 324, 343, 347, 369, 385, 405,477,
						512, 587,669, 681, 691, 704, 718, 747, 766,780,
						796, 799, 817, 831, 851, 867, 892, 904, 930,963};
		int pos[] = new int[numbers.length];
		int attempt=0;
		int bestDiff = Integer.MAX_VALUE;
		int j = 0;
		Random rand = new Random();
		while (j <= 10000) {
			j++;
			int diff = 0, left = 0, right = 0;
			for (int i = 0; i < numbers.length; i++) {

				diff = 0;
				pos[i] = rand.nextInt(3) - 1;

				if (pos[i] == -1) {
					left += numbers[i];
					 //System.out.println("Left "+numbers[i]);
				}
				if (pos[i] == 1) {
					right += numbers[i];
					 //System.out.println("\t\t\t\tRight "+numbers[i]);
				}
				diff = Math.abs(right - left);
			}
			attempt++;
			System.out.println("\t\t\tAttempt "+attempt);
			if (diff == 0) {
				bestDiff = diff;
				break;
			} else if (diff < bestDiff && diff >= 0) {
				bestDiff = diff;
			}
		}
		for (int i = 0; i < pos.length; i++) {
			System.out.println(pos[i] + "\t" + numbers[i]);
		}
		System.out.println("Found best difference possible of " + bestDiff);
	}
}
