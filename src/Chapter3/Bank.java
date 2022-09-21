package Chapter3;

public class Bank{

        private String name;
        private double balance;
      

        public Bank(String name, double balance){
	this.name = name;

	if (balance > 0.0) { 
	       this.balance = balance; 

     	   }
	} 

        public void deposit(double depositAmount) { 
	 if (depositAmount > 0.0) {  
	       balance = balance + depositAmount;
 	     } 
	 }
       
        public void withdrawal(double withdrawAmount){
	if (withdrawAmount <= balance)
	       balance = balance - withdrawAmount;
                      
            else if(withdrawAmount > balance)
	       System.out.println("The amount exceeded the account balance");
	  }
        public double getBalance(){
      	 return balance;
   	 }
         public void setName (String name){
	this.name = name;
}
        public String getName(){
	return name;
  }
}
