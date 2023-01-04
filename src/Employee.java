
public class Employee {
	//public static void main(String[] args) {
	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	void display()
	{
System.out.println(eid);
System.out.println(sal);
System.out.println(deptno);
System.out.println(job);
	}
public static void main(String[] args) 
{
Employee emp = new Employee();
emp.eid=101;
emp.ename="akash";
emp.sal=200;
emp.deptno=10;
emp.job="Manager";
emp.display();

 
}
}