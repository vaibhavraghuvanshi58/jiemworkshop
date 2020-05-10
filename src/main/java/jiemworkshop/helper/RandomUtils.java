package jiemworkshop.helper;

public class RandomUtils {
	public static int getRandomNumber(int from, int to) {
		return  from + (int)(Math.random()*(to-from));
	}
	
}
