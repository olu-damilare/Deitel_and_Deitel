public class Invoice{
	private String identityNumber;
	private String description;
	private int quantity;
	private double pricePerUnit;

	public void setIdentityNumber(String identityNumber){
		this.identityNumber = identityNumber;
	}
	public String getIdentityNumber(){
		return identityNumber;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return description;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public int getQuantity(){
		return quantity;
	}
	public void setPricePerUnit(double price){
		pricePerUnit = price;
	}
	public double getPrice(){
		return pricePerUnit;
	}
	public double getInvoiceAmount(){
		double invoiceAmount = quantity * pricePerUnit;
			if(quantity < 0){
				quantity = 0;
			}
			if(pricePerUnit < 0){
				pricePerUnit = 0;		
			}
		return invoiceAmount;
	}


}