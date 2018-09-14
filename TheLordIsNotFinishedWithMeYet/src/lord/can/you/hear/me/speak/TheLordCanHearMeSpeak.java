package lord.can.you.hear.me.speak;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class TheLordCanHearMeSpeak {

	public static void main(String[] args) {
		int numberOfBoards = 1;
		while (numberOfBoards <= 12) {
			Random randomNumberGenerator = new Random();
			List<Integer> alreadyChosenNumbersList = new ArrayList<Integer>();
			int counter = 0;
			while (counter <= 6) {
				int nextNumber = randomNumberGenerator.nextInt(53);
				if (!alreadyChosenNumbersList.contains(nextNumber) && nextNumber != 0) {
					alreadyChosenNumbersList.add(nextNumber);
					if (alreadyChosenNumbersList.size() >= 6) {
						break;
					}
					counter++;
				}
			}
			StringBuilder stringBuilder = new StringBuilder();
			for (Integer choseNumber : alreadyChosenNumbersList) {
				stringBuilder.append(choseNumber + ",");
			}
			
			System.out.println(stringBuilder.toString().substring(0, stringBuilder.length() - 1));
			numberOfBoards++;
		}
	}
	
	
}
