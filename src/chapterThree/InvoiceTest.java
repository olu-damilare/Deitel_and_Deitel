import java.util.Scanner;
public class InvoiceTest{
	public static void main(String[] args){

		Invoice myInvoice = new Invoice();
	
		System.out.println("the identity number of the product is: ");
		Scanner newProduct = new Scanner(System.in);
		String id_Number = newProduct.nextLine();
		myInvoice.setIdentityNumber(id_Number);

		System.out.println("what is the product description?");
		String productDescription = newProduct.nextLine();
		myInvoice.setDescription(productDescription);

		System.out.println("How much quantity do you want?");
		int productQuantity = newProduct.nextInt();
		myInvoice.setQuantity(productQuantity);

		System.out.println("The price of each quantity is ");
		double priceOfEachQuantity = newProduct.nextDouble();
		myInvoice.setPricePerUnit(priceOfEachQuantity);

		System.out.printf("The product ID is %s%n", myInvoice.getIdentityNumber());
		System.out.printf("The description is %s%n", myInvoice.getDescription());
		System.out.printf("The quantity ordered is %d%n", myInvoice.getQuantity());
		System.out.printf("The price of each unit is %.2f%n", myInvoice.getPrice());
		System.out.printf("The total amount to be paid is %.2f%n", myInvoice.getInvoiceAmount());
	



}







}