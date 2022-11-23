import java.io.*;
class Assignment
{
	private String name;
	private Double mark;
	private Double asmark;
	private String grade;
	private Double grades;
	
	Assignment(String name,Double mark,Double asmark)	
	{
		
		this.name=name;
		this.mark=mark;
		this.asmark=asmark;

	}
	public String getStudMark()
	{
		if((mark>asmark) || (mark==0) )
		{
			String temp="Invalid answer";
			return temp;
		}
		else
		{	
			String temp="Student marks are "+this.mark;
			return temp;
		}	
	}
	public void setStudMark(double mark)
	{
		
			this.mark=mark;	
			
	}
	
    public String getGrades()
    {
        grades=(this.mark/this.asmark)*100;
		if(grades>85)
		{
			grade="High Distinction";
			return grade;	
		}
		else if((grades >=75) && (grades <=84))
		{
			grade="Distinction";
			return grade;
		}
		else if((grades >=65) && (grades <=74))
		{
			grade="Credit";
			return grade;
		}
		else if((grades >=50) && (grades <=64))
		{
			grade="Pass";
			return grade;
		}
		else
		{
			grade="Fail";
			return grade;
		}
    }
	
	public String printdet()
	{
		String str="Name of the student is "+this.name+" and the grade is "+getGrades()+" and the  "+getStudMark();
		return str;
	}
		
}
class Q2{
	public static void main(String args[]) throws IOException{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter student name");
		String name=br.readLine();
		System.out.println("Enter student mark");
		Double mark=Double.parseDouble(br.readLine());	
		System.out.println("Enter assignment mark");
		Double asmark=Double.parseDouble(br.readLine());	
		Assignment a1=new Assignment(name,mark,asmark);
		
		a1.setStudMark(mark);
		System.out.println(a1.printdet());
}
}