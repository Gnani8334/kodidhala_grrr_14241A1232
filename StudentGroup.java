import java.util.Date;
import java.lan.String;
java.io.*;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
try{
int n;

Scanner s=new Scanner(System.in);
Student[]=s.next();
for(int i=0;i<n;i++)
int index=Student.length();
if(index<0||index>=n) throws IllegalArgumentException

		// Add your implementation here
	}
}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
try
{
int n=Student.length();
if(index<0||index>=n) throws IllegalArgumentException
		return null;

	}
}

	
@Override
	public void setStudent(Student student, int index) {
try
{

Student[index]=student;
int d=Student.length();
if(index<0||index>=d) throws IllegalArgumentException
		// Add your implementation here
	}
}
	@Override
	public void addFirst(Student student) {
try
{
if(student==null) throws IllegalArgumentException
else
{
for(int i=0;i<=Student.length();i++)
{
Student[i+1]=Student[i];
Student[0]=student;

}
}
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
try
{
if(student==null) throws IllegalArgumentException
else{
	
int n=Student.length();	
Student[n]=student;// Add your implementation here
	}
}
}
	@Override
	public void add(Student student, int index) {
try
{
		// Add your implementation here
if(student==null) throws IllegalArgumentException
else
{Student[index]=student;
int n=index;
for(int i=n;i<=Student.length();i++)

Student[i+1]=Student[i];

	}
}
}

	@Override
	public void remove(int index) {
try
{
if(index<0||index>=Student.length()) throws IllegalArgumentException
	else{
for(i=index;i<=Student.length();i++)
index[i]=index[i+1];
}
}
	// Add your implementation here
	}

	@Override
	public void remove(Student student) {
try
{
Scanner s=new Scanner(System.in);
String st=s.next();
if(student==null) throws IllegalArgumentException
else
{ for( int i=0;i<=Student.length();i++)
if(Student[i]==st)
{
st==null;




		// Add your implementation here
	}
}}
	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
catch( IllegalArgumentException i)
{
System.out.println("error"+i);
}
