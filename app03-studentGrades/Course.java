
/**
 * Course class to create modules and grades.
 *
 * @author (Max Roe)
 * @version (2020/24/10)
 */
public class Course
{
    // course code
    private String codeNo;
    //course title
    private String title;
    //module names
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    //calculating final mark
    private int finalMark;
    private String finalGrade;
    

    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        this.codeNo = codeNo;
        this.title = title;
        
        this.finalMark = 0;
        this.finalGrade = null;
        
        createModules();
    }
    
    public void createModules()
    {
        module1 = new Module("C0452", "Programming");
        module2 = new Module("C0451", "Web Development");
        module3 = new Module("C0450", "Computer Architecture");
        module4 = new Module("C0453", "Digital Technologies");
    }
    
    public void addModule(Module module, int moduleNo)
    {
        if(moduleNo == 1)
        {
            this.module1 = module;
        }
    }
    
    public void setMark(int mark, String codeNo)
    {
        if(module1.getCodeNo() == codeNo)
        {
            module1.awardMark(mark);
        }
    }
    
    public void calculateFinalMark()
    {
        if(courseCompleted())
        {
        int totalMark = module1.getMark() + module2.getMark() +
        module3.getMark() + module4.getMark();
        
        finalMark = totalMark / 4;
        print();
       } 
       else
       {
           
       }
    }
    
    public boolean courseCompleted()
    {
        if((module1.isCompleted()) && (module2.isCompleted()))
        {
            return true;
        }
        else return false;
    }
    
    /**
     * Prints out the details of a course
     */
    public void print()
    {
        System.out.println("Course " + codeNo + " - " + title);
    }
    
    public void printModules()
    {
        //print all the individual marks 
        if(courseCompleted())
       {
    
        System.out.println("Final Mark = " + finalMark);
       }
    }
}
