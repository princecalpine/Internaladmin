package internaladmin;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import excelhandling.ExcelData;
import objectrepositoryinternal.CreateGene;
import sapphiros.Base;

public class CreateGeneTest extends Base{
	
static ExcelData reader=new ExcelData("/Users/prince/Documents/workspace1/Internaladmin/src/main/java/exceldata/TestData.xlsx");

static String Genename=reader.getCellData("GeneData", "Genename", 2);
static String SNPname=reader.getCellData("GeneData", "SNPname", 2);
static String SNPcmmts=reader.getCellData("GeneData", "SNPcmmts", 2);
static String SNPshrtdesc=reader.getCellData("GeneData", "SNPshrtdesc", 2);
static String Varient1=reader.getCellData("GeneData", "Varient1", 2);
static String Vardesc1=reader.getCellData("GeneData", "Var desc 1", 2);
static String Varshrtcmnt1=reader.getCellData("GeneData", "Var shrtcmnt 1", 2);
static String Varient2=reader.getCellData("GeneData", "Varient2", 2);
static String Vardesc2=reader.getCellData("GeneData", "Var desc 1", 2);
static String Varshrtcmnt2=reader.getCellData("GeneData", "Var shrtcmnt 1", 2);
static String Varient3=reader.getCellData("GeneData", "Varient3", 2);
static String Vardesc3=reader.getCellData("GeneData", "Var desc 1", 2);
static String Varshrtcmnt3=reader.getCellData("GeneData", "Var shrtcmnt 1", 2);
static String Reference=reader.getCellData("GeneData", "Reference", 2);
static String Weblink=reader.getCellData("GeneData", "Weblink", 2);


     

@Test
	public void CreateGene() throws IOException, InterruptedException
	{  
		CreateGene Cg=new CreateGene(driver);
		Cg.PGVmodule().click();
		Cg.PGVimage().click();
		
		//New Gene Creation
		Cg.Gene().sendKeys(Genename);
		Cg.GVisibility().click();
		Cg.Save().click();
		Thread.sleep(3000);
		Cg.GenePopUp().click();
		Thread.sleep(5000);

		
		//New SNP create for the Gene
		Cg.SnpName().sendKeys(SNPname);
		Cg.SnpComment().sendKeys(SNPcmmts);
		Cg.SnpDesc().sendKeys(SNPshrtdesc);
		Cg.SnpVisibility().click();
		
		Cg.Varient1().sendKeys(Varient1);
		WebElement StaticDropdown=Cg.VQualifier1();
		Select dropdown=new Select(StaticDropdown);
		dropdown.selectByIndex(1);
		Cg.VDesc1().sendKeys(Vardesc1);
		Cg.VShortComment1().sendKeys(Varshrtcmnt1);
		
		Cg.Varient2().sendKeys(Varient2);
		WebElement StaticDropdown2=Cg.VQualifier2();
		Select dropdown2=new Select(StaticDropdown2);
		dropdown2.selectByIndex(2);
		Cg.VDesc2().sendKeys(Vardesc2);
		Cg.VShortComment2().sendKeys(Varshrtcmnt2);
		
		Cg.Varient3().sendKeys(Varient3);
		WebElement StaticDropdown3=Cg.VQualifier3();
		Select dropdown3=new Select(StaticDropdown3);
		dropdown3.selectByIndex(3);
		Cg.VDesc3().sendKeys(Vardesc3);
		Cg.VShortComment3().sendKeys(Varshrtcmnt3);
		
		Cg.SaveSNP().click();
		Thread.sleep(5000);
		Cg.SNPPopUp().click();
		
		
		Cg.Reference().sendKeys(Reference);
		Cg.Weblink().sendKeys(Weblink);
		Cg.SaveReference().click();
		Thread.sleep(5000);
		
		
		}


}
