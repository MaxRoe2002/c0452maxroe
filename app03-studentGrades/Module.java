
/**
 * Class to create modules and awarding student with marks.
 *
 * @author (Max Roe)
 * @version (2020.24.10)
 */
public class Module
{
// Fields
private String title;

private String codeNo;

private int mark;

private int credit;

private boolean completed;

private boolean passed;

/**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
        
        mark = -1;
        credit = 15;
        
        passed = false;
        completed = false;
    }
    
    /**
     * Awarding a mark
     */
    public void awardMark(int mark)
   { 
       this.mark = mark;
   } 
   
   /**
    * Returns the module mark
    */
   public int getMark()
   {
       return mark;
   }
   
   /**
    * Returns the module code number
    */
   public String getCodeNo()
   {
       return codeNo;
   }
    
   /**
    * Boolean to return a mark
    */
   public boolean isCompleted()
   {
       return mark >= 0;
   }
   
   /**
    * Print module title and mark
    */
   public void print()
   {
      System.out.println("Module: " + title + " " + codeNo + " Mark = " + mark);
   }
}