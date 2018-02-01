
public class Testdrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Car charger = new Car("dodge", "charger");
	Car wrangler = new Car("jeep","wrangler");
	Car sl1 = new Car("saturn","sl1");
	Car f150 = new Car("ford","f150");
	Car volt = new Car("chevy","volt");

	System.out.println(charger.getMake());	
	
	}

	
	
	
		
		
		
		
	}
	
	
}

public class Car {

	private String make;
	private String model;
	
	public Car(String make, String model){
			this.make = make;
			this.model = model;
		}
		
		public String getMake(){
			return this.make;
		}
		
		public String getModel(){
			return this.model;
			
		}
			
		public void setMake(String make){
			 this.make = make;
						
		}

		public void setModel(String model) {
			this.model = model;
		}

	


}
