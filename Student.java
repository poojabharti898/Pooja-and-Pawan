public class Student {
	//declaring required variables
      protected  String name="";
      protected int id;
      protected double percentage;
      protected String[] skills;
      
    //constructor with all parameters
      public Student(String name,int id,double percentage,String[] skills)
      {
          this.name = name;
          this.id = id;
          this.percentage = percentage;
          this.skills = skills;
      }
      
	  //constructor with parameters name and id
      public Student(String name,int id)
      {
          this.name = name;
          this.id = id;
      }
      
      //constructor with parameter id
      public Student(int id)
      {
          this.id = id;
      }
      
	  //getter functions for all data members of class
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
	public String[] getSkills() {
		return skills;
	}

	
	//setter functions for all data members of class
    public void setName(String name) {
		this.name = name;
	}
    
    public void setId(int id) {
		this.id = id;
	}
    
    public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
    
   public void setSkills(String[] skills) {
		this.skills = skills;
   }

}
