import java.util.*;
public class CollegeStudent
{
	private String FirstName;
	private String LastName;
	private GregorianCalendar EnrollmentDate;
	private GregorianCalendar GraduationDate;
	public CollegeStudent(String fn, String ln, GregorianCalendar ed)
	{
		FirstName = fn;
		LastName = ln;
		EnrollmentDate = new GregorianCalendar(ed.get(ed.YEAR),ed.get(ed.MONTH), ed.get(ed.DAY_OF_MONTH));
		int Month = EnrollmentDate.get(EnrollemntDate.MONTH);
		int Day = EnrollmentDate.get(EnrollmentDate.DAY_OF_MONTH);
		int Year = EnrollmentDate.get(EnrollmentDate.YEAR);
		Year = Year + 4;
		GraduationDate = new GregorianCalendar(Year, Month, Day);
	}
	public void setFirstName(String fn)
	{
		FirstName = fn;
	}
	public void setLastName(String ln)
	{
		Lastname = ln;
	}
	public void setEnrollDate(GregorianCalendar ed)
	{
		EnrollmentDate = ed;
	}
	public String getLastName()
	{
		return LastName;
	}
	public String getFirstName()
	{
		return FirstName;
	}
	public GregorianCalendar getEnrollDate()
	{
		return EnrollmentDate;
	}
	public GregorianCalendar getGraduationDate()
	{
		return GraduationDate;
	}}