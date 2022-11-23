

class employee{

    private String myName;
    private int myEmployeeId;
    private double myWage;
    private boolean isFullTime;

     employee(String myName, int myEmployeeId,double myWage, boolean isFullTime) {
        this.myName=myName;
        this.myEmployeeId=myEmployeeId;
        this.myWage=myWage;
        this.isFullTime=isFullTime;
     }
        //mutator
        public void setName(String n){     
            this.myName = n;   
        }   
        public void setWage(double w){     
            this.myWage = w;   
        }   
        public void setFullTime(boolean f){     
            this.isFullTime = f;   
        }  
        public void setEmployeeId(int id){
             this.myEmployeeId = id;   
        }   
        //accessor
        public String getName(){     
            return this.myName;   
        } 
        public int getEmployeeId(){     
            return this.myEmployeeId;   
        }   
        public double getWage(){     
            return this.myWage;   
        }   
        public boolean getFullTime(){     
            return this.isFullTime;   
        }   
    
  
        public void printDetails(){     
            String out="";     
            if(this.isFullTime){       
                out=out+"The name of the employee is "+this.myName + ". The employee id is "+this.myEmployeeId;       
                out=out+". The wage of the employee is $"+this.myWage+" per hour. The employee is not full-time.";     
            }     
            else{       
                out=out+"The name of the employee is "+this.myName + ". The employee id is "+this.myEmployeeId;       
                out=out+". The wage of the employee is $"+this.myWage+" per hour. The employee is full-time.";     
            }     
            System.out.println(out);   
        } 
    } 
    public class Q1{   
        public static void main(String[] args)   
        {         
            employee w1 = new employee("John Smith", 123456, 25.40, false);     
            w1.printDetails();      
            
            employee w2 = new employee("Aidra Rhodes", 654321, 2500, true);     
            w2.printDetails();    
        } 
    } 