
/**
 * Write a description of class Course here.
 *
 * @author (Max ROe)
 * @version (06/10/20)
 */
public class Course
{
    // course code
    private String moduleNumber;
    //course title
    private String title;
    

    /**
     * Constructor for objects of class Course
     */
    public Course(String moduleNumber, String title)
    {
        this.moduleNumber = moduleNumber;
        this.title = title;
    }

    /**
     * Method that returns title
     * 
     * @return title
     */
    public String getTitle()
    {
        // return title
        return title;
    }
}
