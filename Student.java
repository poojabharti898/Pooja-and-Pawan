public class Student
{
      //declaring required variables
      private String name="";
      private int id;
      private double percentage;
      private String[] skills;
      
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
      public String getName()
      {
          return name;
      }
	
      public int getId() 
      {
          return id;
      }
      
      public double getPercentage()
      {
	  return percentage;
      }
	
      public String[] getSkills() 
      {
	  return skills;
      }

	
      //setter functions for all data members of class
      public void setName(String name) 
      {
          this.name = name;
      }
    
      public void setId(int id)
      {
	  this.id = id;
      }
    
      public void setPercentage(double percentage)
      {
	  this.percentage = percentage;
      }
    
      public void setSkills(String[] skills) 
      {
	  this.skills = skills;
      }

}
	// Operations class inherited student class.
	class Operations extends Student
	{
		//constructor for subclass Operations
		public Operations(String name,int id,double percentage,String[] skills)
		{
			super(name,id,percentage,skills);
		}
	    // Method to change the name of the student.
	    public void changeName(String name)
	    {
	        this.name = name;
	    }
	   
	    // Method to change name as per user input.
	    public void changeName()
	    {
	        System.out.print("Enter New Name : ");
	        Scanner in = new Scanner(System.in);
	        String new_name = in.nextLine();
	        this.name = new_name;
	    }
	    //method to add additional 5 skills
	    public void addskill()
	    {
	    	//variable to store current size of skills array
	    	int t=skills.length;
	    	//user inputs new skills and append to skills array
	    	for(int i=0;i<5;i++)
	    	{
	    		
	    		System.out.println("Enter a skill");
	    		Scanner in = new Scanner(System.in);
		        String new_skill = in.nextLine();
		        skills[t+i]=new_skill;
	    	}
	    }
	}

