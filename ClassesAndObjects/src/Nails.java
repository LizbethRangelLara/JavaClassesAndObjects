
public class Nails {

		private String length; 
		private String color; 
		private String shape; 
		
		public Nails() 
		{	
		}
		
		public Nails(String length, String color) 
		{
			this.length = length; 
			this.color = color;
		}
		
		public Nails(String length, String color, String shape) 
		{
			this.length = length; 
			this.color = color; 
			this.shape = shape;
		}

		public String getLength() 
		{
			return length;
		}
		
		public void setLength(String length) 
		{
			this.length = length;
		}
		
		public String getShape() 
		{
			return shape;
		}
		
		public void setShape(String shape) 
		{
			this.shape = shape;
		}
		
		public String getColor() 
		{
			return color;
		}
		
		public void setColor(String color) 
		{
			this.color = color;
		}

		public boolean isPretty() 
		{
			return true; 
		}
		
		public String Feedback(String form) 
		{
			return form;
		}
		
		
		public static void main(String[] args) 
		{
			Nails myNails = new Nails("Medium", "Deep Wine");

			System.out.println(myNails.getLength());
			System.out.println(myNails.getColor());
			String form = myNails.Feedback("My nails are fantastic! Thank You!");
			System.out.println(form);
		}
	}
