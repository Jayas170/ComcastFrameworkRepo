package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Luma {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		 WebDriver d=new ChromeDriver();
		 JavascriptExecutor js = (JavascriptExecutor)d;
		 //FOR LOGIN PAGE
		d.get("https://magento.softwaretestingboard.com/customer/account/login ");
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		d.manage().window().maximize();
		//FOR USERNAME
		WebElement un=d.findElement(By.id("email"));
		String UNData="shoaib.sho321@gmail.com";

		un.sendKeys(UNData);
		if(un.getAttribute("value").equals(UNData)){
			System.out.println("LUMA Website Login Page of Username is valid");
		}
	else {
			
			System.out.println("LUMA Website Login Page OF Username is Invalid");
		}
		//FOR PASSWORD
				WebElement pw=d.findElement(By.id("pass"));
				String pwData="Shoaib@123";
				pw.sendKeys(pwData);
				if(pw.getAttribute("value").equals(pwData)){
					System.out.println("LUMA Website Login Page of Password is valid");
				}
				else {
					
					System.out.println("LUMA Website Login Page Password is Invalid");
				}
				
				//For Sign in Button
				WebElement sb=d.findElement(By.id("send2"));
				sb.click();
				
		         String url=d.getCurrentUrl();
				
				
				
				if(url.equals("https://magento.softwaretestingboard.com/customer/account/")) {//1
					System.out.println("Login  Successfully!!!");
					//Homepage=>click on men model
					
					WebElement m=d.findElement(By.id("ui-id-5"));
					m.click();
					String url1=d.getCurrentUrl();
					if(url1.equals("https://magento.softwaretestingboard.com/men.html")) {//2
						System.out.println("Men Model page is Navigation Successfully");
						
						//men=>Click on Jackets
						WebElement j=d.findElement(By.xpath("//a[text()='Jackets']"));
						j.click();
						String url2=d.getCurrentUrl();
						if(url2.equals("https://magento.softwaretestingboard.com/men/tops-men/jackets-men.html")) {//3
							System.out.println("Jackets page is Navigation Successfully");
							
							//Jacket=>click on Montana Wind Jacket link(Selecting Jackets)
							WebElement mwj=d.findElement(By.xpath("//a[normalize-space(text())='Montana Wind Jacket']"));
							mwj.click();
							String url3=d.getCurrentUrl();
							if(url3.equals("https://magento.softwaretestingboard.com/montana-wind-jacket.html")) {//4
								System.out.println("Montana Wind Jacket page is Navigation Successfully");
								
								//select colour
								WebElement g=d.findElement(By.id("option-label-color-93-item-53"));//inside 04 if
								g.click();
								String colr="Green";
								if(g.getAttribute("aria-label").equals(colr)){//Syntax attritubete name(aria-label)=attribute value(Green)
									System.out.println(colr+" color is selected");
								}
							else {
									
									System.out.println(colr+" color is not selected");//inside 04 if
								}
								
								//Selecting Size of jacket
								WebElement sz=d.findElement(By.id("option-label-size-143-item-168"));
								sz.click();
								String siz="M";
								if(g.getAttribute("aria-checked").equals("true")){//inside 04 if
									System.out.println(siz+" size is selected");
								}
							else {
									
									System.out.println(siz+" size is not selected");//inside 04 if
								}
								//Click on Add to card
								WebElement card=d.findElement(By.xpath("//span[text()='Add to Cart']"));
								card.click();
								if(g.getAttribute("aria-checked").equals("true")){//inside 04 if
									System.out.println(siz+" size is selected");
								}
							else {
									
									System.out.println(siz+" size is not selected");//inside 04 if
								}
								
								
								
//								//Valaditing Add to card
//								WebElement a=d.findElement(By.xpath("//div[@data-ui-id='message-success']"));
//								
//								if(a.getAttribute("data-ui-id").equals("message-success")){
//									System.out.println("Add to card is sucessfully validate");
//								}
//							else {
//									
//									System.out.println("Add to card is not validate");
//								}
								
								
								
								/*WebElement ac=d.findElement(By.xpath("//span[@class='counter-number']"));
								
								if(ac.getText().equals("1")) {
									System.out.println("Add to card is sucessfully validate");
								}
								else {
									System.out.println("Add to card is not validate");
								}*/
								
								
								
								
								
								//Click on Add to card Image
								Thread.sleep(2000);

								WebElement im=d.findElement(By.xpath("//a[@class='action showcart']"));
								im.click();
								//Click on Proceed to Checkout
								WebElement ptc=d.findElement(By.id("top-cart-btn-checkout"));
								ptc.click();
								
						    
							//if start 5
								Thread.sleep(3000);
							String url4=d.getCurrentUrl();
							
							if(url4.equals("https://magento.softwaretestingboard.com/checkout/#shipping")) {//5
								System.out.println("Shipping Address page is Navigation Successfully");
								
								
								//Click on Next Button
								
								WebElement nxt=d.findElement(By.xpath("//span[text()='Next']"));
								nxt.click();
								Thread.sleep(2000);
								
								String url5=d.getCurrentUrl();
								
								if(url5.equals("https://magento.softwaretestingboard.com/checkout/#payment")) {//6
									System.out.println("Payment Method page is Navigation Successfully");
									
									//Click on place order
									WebElement po=d.findElement(By.xpath("//span[text()='Place Order']"));
									//po.click();
									js.executeScript("arguments[0].click();", po);
									Thread.sleep(3000);
									  String url6=d.getCurrentUrl();
									if(url6.equals("https://magento.softwaretestingboard.com/checkout/onepage/success/")) {//7
										System.out.println("Page is Navagation to Success page and displaying as Thank you for your purchase!");
									}

									
									 else {
										    System.out.println("Page is Navagation to Success page is FAIL");//
										      }
								}

								
								 else {
									    System.out.println("Payment method page is Navigation is FAIL");//6
									      }
	                      //   String url6=d.getCurrentUrl();
								
//								if(url6.equals("https://magento.softwaretestingboard.com/checkout/#payment")) {//7
//									System.out.println("Thank you for your purchase!");
//								}
	//
//								
//								 else {
//									    System.out.println("Thank you for your purchase! FAIL");//
//									      }
							
							}//5th if ends
							
							
							
							
							 else {
								    System.out.println("Shipping Address page is Navigation is FAIL");//5
								      }
							
							
							}//4th if ends
							
						    else {
						    System.out.println("Montana Wind Jacket page is Navigation is FAIL");//4
						      }
							
							
					         }
					    else {
					    System.out.println("Jackets page is Navigation is FAIL");//3
					      }
						
				         }
				    else {
				    System.out.println("Men Model page is Navigation is FAIL");//2
				      }
					
					
		             } //First if(1) ends
				
				
				
				
		else {
			System.out.println("Login Fail!!!");//1
		}
			
		
		
		
		
		//main and class ends
		}

}
