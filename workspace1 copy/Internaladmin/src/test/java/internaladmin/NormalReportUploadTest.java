package internaladmin;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;
import sapphiros.Base;


public class NormalReportUploadTest extends Base {
	
    @Test
	public void NormalReportUpload() throws IOException, InterruptedException
	{ 
    	objectrepositoryinternal.ReportUpload Nr=new objectrepositoryinternal.ReportUpload(driver);
    	Nr.ReportModule().click();
    	Nr.Reportstile().click();
    	File Superherofile = new File("/Users/prince/Documents/workspace1/Internaladmin/src/main/java/projectfiles/2016-09-25-SH_Results.txt");
		Nr.NormalReport().sendKeys(Superherofile.getAbsolutePath());
		Thread.sleep(1000);
		Nr.Uploadbutton().click();
    	

}
}
