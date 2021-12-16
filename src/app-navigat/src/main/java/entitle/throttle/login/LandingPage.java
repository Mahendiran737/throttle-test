package entitle.throttle.login;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import entitle.throttle.AbstractPage;

@SuppressWarnings("unused")
public class LandingPage extends AbstractPage {

  public LandingPage(WebDriver driver) {
    super(driver);
  }

  public String getPageName() {
	  return getDriver().getTitle();
  }
  

  public void makePage(){
		
		getDriver().findElement(By.className("menutoggle")).click();
		
		getDriver().findElement(By.className("nav-parent")).findElement(By.xpath("//span[contains(text(),'VEHICLES')]")).click();
		getDriver().findElement(By.xpath("//a[contains(text(),'Make')]")).click();

//  getDriver().get("http://localhost:8084/throttle/viewMfr.do?menuClick=1&fleetType=1");
		getDriver().findElement(By.id("mfrName")).sendKeys("LEYLAND" + Keys.ENTER);
		getDriver().findElement(By.id("description")).sendKeys("TRUCK" + Keys.ENTER);
		
		WebElement ActivityGroup = getDriver().findElement(By.id("groupId"));
		Select select = new Select(ActivityGroup);
		select.selectByValue("1");
		
		WebElement Statuses=getDriver().findElement(By.name("status"));
		Select select1=new Select(Statuses);
		select1.selectByValue("Y");
		
		WebElement Truck=getDriver().findElement(By.name("vehicleMfr"));
		Truck.click();
		
		getDriver().findElement(By.xpath("/html/body/section/div[2]/div[3]/div/div/form/center/input[1]")).click();
		
		WebElement Edit=getDriver().findElement(By.id("edit1"));
		Edit.click();
		
		WebElement appendBox=getDriver().findElement(By.id("mfrName"));
		appendBox.sendKeys(" TEST");
		
		WebElement getTextBox =getDriver().findElement(By.id("description"));
		String  description = getTextBox.getAttribute("description");
		System.out.println(description);
		
		WebElement Activity = getDriver().findElement(By.id("groupId"));
		Select selectText = new Select(Activity);
		selectText.selectByValue("1");
		
		WebElement Sta=getDriver().findElement(By.name("status"));
		Select 
		sel=new Select(Sta);
		sel.selectByValue("Y");
		
		WebElement Trailer=getDriver().findElement(By.name("trailerMfr"));
		Trailer.click();
		
		getDriver().findElement(By.xpath("/html/body/section/div[2]/div[3]/div/div/form/center/input[1]")).click();

		getDriver().findElement(By.className("menutoggle")).click();
		
		getDriver().findElement(By.className("nav-parent")).findElement(By.xpath("//span[contains(text(),'VEHICLES')]")).click();
		getDriver().findElement(By.xpath("//a[contains(text(),'Axle Master')]")).click();
//		getDriver().findElement(By.className("btn btn-success")).click();
		
		
//		return new LandingPage(getDriver());

	}
  public String empPage() {

		getDriver().findElement(By.className("menutoggle")).click();
		
		getDriver().findElement(By.className("nav-parent")).findElement(By.xpath("//span[contains(text(),'HRMS')]")).click();
		getDriver().findElement(By.xpath("//a[contains(text(),'Employees ')]")).click();
	  getDriver().findElement(By.name("add")).click();
	   getDriver().findElement(By.id("name")).sendKeys("sivanesan");
	   getDriver().findElement(By.id("orgEmpId")).sendKeys("faizal");
	   getDriver().findElement(By.id("dateOfBirth")).sendKeys("31-05-2000"+Keys.ENTER);
	   WebElement gender =  getDriver().findElement(By.name("gender"));
	   Select select = new Select(gender);
	   select.selectByValue("Male");
	   WebElement martial =  getDriver().findElement(By.name("martialStatus"));
	   Select selected = new Select(martial);
	   selected.selectByValue("Unmarried");
	   getDriver().findElement(By.name("mobile")).sendKeys("1234567890");
	   getDriver().findElement(By.name("qualification")).sendKeys("BE");
	   getDriver().findElement(By.id("dateOfJoining")).sendKeys("31-05-2020"+Keys.ENTER);
	   getDriver().findElement(By.name("bloodGrp")).sendKeys("o+");
	   getDriver().findElement(By.name("fatherName")).sendKeys("gfgfedwgeuyg");
	   getDriver().findElement(By.id("phone")).sendKeys("245624");
	   getDriver().findElement(By.id("email")).sendKeys("entitlesolution.com");
	   WebElement department =  getDriver().findElement(By.id("deptid"));
	   Select department1 = new Select(department);
	   department1.selectByIndex(2);
	   WebElement grade =  getDriver().findElement(By.id("gradeId"));
	   Select grade1 = new Select(grade);
	   grade1.selectByIndex(2);
	   WebElement hire =  getDriver().findElement(By.id("contractDriver"));
	   Select hire1 = new Select(hire);
	   hire1.selectByValue("YES");
	   WebElement Designation  =  getDriver().findElement(By.id("designationId"));
	   Select Designation1  = new Select(Designation);
	   Designation1.selectByIndex(6);
	   WebElement company =  getDriver().findElement(By.id("cmpId"));
	   Select company1 = new Select(company);
	   company1.selectByIndex(2);
	   WebElement status =  getDriver().findElement(By.name("activeInd"));
	   Select status1 = new Select(status);
	   status1.selectByValue("N");
	   WebElement Vendor =  getDriver().findElement(By.id("vendorCompany"));
	   Select Vendor1 = new Select(Vendor);
	   Vendor1.selectByIndex(2);
	   WebElement otType = getDriver().findElement(By.id("otType"));
	   Select otType1 = new Select(otType);
	   otType1.selectByValue("24");
	   WebElement checkBox = getDriver().findElement(By.id("userStatus"));
	   boolean checkBox1 = checkBox.isSelected();
	   System.out.print(checkBox1+"checkBox-------------------------->>>>>>>>>");
	   getDriver().findElement(By.id("userName")).sendKeys("entitl");
	   WebElement employeeRole = getDriver().findElement(By.id("roleId"));
	   Select employeeRole1 = new Select(employeeRole);
	   employeeRole1.selectByIndex(3);
	   getDriver().findElement(By.id("password")).sendKeys("BBBB");
	   getDriver().findElement(By.name("Next")).click();
	   return "";
	 }
  
  
  public String empPage1() {
	  
	  getDriver().findElement(By.name("addr")).sendKeys("a");
	    getDriver().findElement(By.name("state")).sendKeys("b");
	    getDriver().findElement(By.name("city")).sendKeys("c");
	    getDriver().findElement(By.name("pincode")).sendKeys("623786");
	    getDriver().findElement(By.name("chec")).click();
	    getDriver().findElement(By.name("drivingLicenseNo")).sendKeys("432");
	    getDriver().findElement(By.name("licenseExpDate")).sendKeys("07-04-2000");
	    WebElement License = getDriver().findElement(By.id("licenseType"));
	    Select License1 = new Select(License);
	    License1.selectByValue("LMV With Batch");
	    WebElement driverType = getDriver().findElement(By.id("driverType"));
	    Select driverType1 = new Select(driverType);
	    driverType1.selectByValue("2");
	    getDriver().findElement(By.name("licenseState")).sendKeys("d");
	    WebElement salary = getDriver().findElement(By.id("salaryType"));
	    Select salary1 = new Select(salary);
	    salary1.selectByValue("Monthly");
	    getDriver().findElement(By.id("basicSalary")).sendKeys("4000");
	    WebElement checked = getDriver().findElement(By.xpath("//*[@id=\"bg\"]/tbody[4]/tr[2]/td[2]/input[1]"));
	    WebElement unChecked = (WebElement) getDriver().findElement(By.xpath("//*[@id=\"bg\"]/tbody[4]/tr[2]/td[2]/input[2]"));
	    boolean yes=checked.isSelected();
	    boolean no=unChecked.isSelected();
	    System.out.println("1"+yes);
	    System.out.println("2"+no);
	    WebElement check = getDriver().findElement(By.xpath("//*[@id=\"bg\"]/tbody[4]/tr[2]/td[4]/input[1]"));
	    WebElement unCheck = getDriver().findElement(By.xpath("//*[@id=\"bg\"]/tbody[4]/tr[2]/td[4]/input[2]"));
	    boolean step1=check.isSelected();
	    boolean step2=unCheck.isSelected();
	    System.out.println("3"+step1);
	    System.out.println("4"+step2);
	//  
	    WebElement account = getDriver().findElement(By.id("bankAccountNo"));
	    account.sendKeys("40023456789123");
	    WebElement Bname = getDriver().findElement(By.id("bankName"));
	    Bname.sendKeys("indianBank");
	    WebElement branchName = getDriver().findElement(By.id("bankBranchName"));
	    branchName.sendKeys("f");
	    WebElement holderName = getDriver().findElement(By.id("accountHolderName"));
	    holderName.sendKeys("yes");
	   WebElement next = getDriver().findElement(By.xpath("//*[@id=\"OfficialDetails\"]/center/a[1]/input"));
	   next.click();
	//   3 page
	   WebElement experience2 = getDriver().findElement(By.id("yearOfExperience"));
	   experience2.sendKeys("2");
	   WebElement Designation2 = getDriver().findElement(By.id("preEmpDesignation"));
	   Designation2.sendKeys("abcd");
	   WebElement company2 = getDriver().findElement(By.id("prevCompanyName"));
	   company2.sendKeys("abcd");
	   WebElement address = getDriver().findElement(By.name("prevCompanyAddress"));
	   address.sendKeys("abcd");
	   WebElement city = getDriver().findElement(By.name("prevCompanyCity"));
	   city.sendKeys("chennai");
	   WebElement state = getDriver().findElement(By.name("preEmpState"));
	   state.sendKeys("tamilnadu");
	   WebElement pincode = getDriver().findElement(By.name("preEmpPincode"));
	   pincode.sendKeys("600028");
	   WebElement contact = getDriver().findElement(By.name("prevCompanyContact"));
	   contact.sendKeys("1234567");
	   WebElement next2 = getDriver().findElement(By.xpath("//*[@id=\"Experience\"]/center/a[1]/input"));
	   next2.click();
	//   4 page
	   WebElement nominee = getDriver().findElement(By.name("nomineeName"));
	   nominee.sendKeys("RRR");
	   WebElement nomineeRelation = getDriver().findElement(By.id("nomineeRelation"));
	   nomineeRelation.sendKeys("DDD");
	   WebElement DOB = getDriver().findElement(By.id("nomineeDob"));
	   DOB.sendKeys("12-03-2000"+Keys.ENTER);
	   WebElement age = getDriver().findElement(By.id("nomineeAge"));
	   age.sendKeys("25");
	   WebElement addRow1 = getDriver().findElement(By.xpath("//*[@id=\"NomineeAndRelationDetails\"]/center[2]/input[1]"));
	   addRow1.click();
	   WebElement name = getDriver().findElement(By.id("relationName1"));
	   name.sendKeys("sivanesa");
	   WebElement relation =  getDriver().findElement(By.id("relation1"));
	   Select relation1 = new Select(relation);
	   relation1.selectByValue("5");
	   WebElement date = getDriver().findElement(By.id("relationDOB1"));
	   date.sendKeys("12-04-2000");
	   WebElement age2 = getDriver().findElement(By.id("relationAge1"));
	   age2.sendKeys("25");
	   WebElement naxt2 = getDriver().findElement(By.xpath("//*[@id=\"NomineeAndRelationDetails\"]/center[3]/a[1]/input"));
	   naxt2.click();
	//   5 page
	   WebElement photo = getDriver().findElement(By.id("employeePhoto"));
	   photo.sendKeys("D:\\Dexter.jpeg");
	   WebElement photo2 = getDriver().findElement(By.id("employeeLicense"));
	   photo2.sendKeys("D:\\Dexter.jpeg");
	   WebElement prev = getDriver().findElement(By.xpath("//*[@id=\"Attachments\"]/center/a[2]/input"));
	   prev.click();
	   WebElement prev2 = getDriver().findElement(By.xpath("//*[@id=\"NomineeAndRelationDetails\"]/center[3]/a[2]/input"));
	   prev2.click();
	   WebElement prev3 = getDriver().findElement(By.xpath("//*[@id=\"Experience\"]/center/a[2]/input"));
	   prev3.click();
	   WebElement prev4 = getDriver().findElement(By.xpath("//*[@id=\"OfficialDetails\"]/center/a[2]/input"));
	   prev4.click();
	//   landingPage.getDriver().findElement(By.name("Save")).click();
	   getDriver().findElement(By.id("ui-id-2")).click();
	   return"";
	  
  }
	
}
