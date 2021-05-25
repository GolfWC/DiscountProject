package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersTestNG implements ITestListener{

	public void onTestFailure(ITestResult result) {
		System.out.println("right before screenshot on a failed testCases");
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("MM_dd_yyyy_hh_mm_ss");
		String methodName = result.getName();
		if (!result.isSuccess()) {
			File scrFile = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
			try {
				String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()
						+ "/target/golf-reports";
				File destFile = new File((String) reportDirectory + "/failure_screenshots/" + methodName + "_"
						+ formater.format(calendar.getTime()) + ".png");
				FileUtils.copyFile(scrFile, destFile);
				Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath()
						+ "' height='100' width='100'/> </a>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
