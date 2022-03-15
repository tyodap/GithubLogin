package GithubUtils;

import java.util.concurrent.TimeUnit;

public class Utils {
	public static void pause(int milli) throws InterruptedException {
        pause(milli, TimeUnit.MILLISECONDS);
    }
	
	public static void pause(int time, TimeUnit timeUnit) throws InterruptedException{
		timeUnit.sleep(time);
	}
}
