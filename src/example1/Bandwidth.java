package example1;

public class Bandwidth {
	 private int totalUsage;
	    private double totalBill;
	    private double costPerByte=10;

	    public void addUsage(int bytesUsed){
	        if(bytesUsed>0){
	           totalUsage = totalUsage + bytesUsed;
	           System.out.println(totalUsage);
	        }
	    }
	    public void updateTotalBill(){
	        totalBill = totalUsage*costPerByte;
	        System.out.println(totalBill);
	    }
		
	}


