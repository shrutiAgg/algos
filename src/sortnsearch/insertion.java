package sortnsearch;

public class insertion {

	private int empNo;
	private String empFname;
	private String empLname;
	private int empId;
	
	public insertion(int empNo, String firstName, String lastName, int id)
	{
		this.empNo = empNo;
		this.empFname = firstName;
		this.empLname = lastName;
		this.empId = id;
	}
	
	public insertion()
	{
		this.empNo = 0;
		this.empFname = null;
		this.empLname = null;
		this.empId = 0;
	}
	
	public static void main(String[] args) {
		
		insertion obj1 = new insertion(12345, "Laura", "Scott", 1);
		insertion obj2 = new insertion(23145, "Amy", "Evans", 2);
		insertion obj3 = new insertion(97456, "Mia", "Doe", 3);
		insertion obj4 = new insertion(78123, "John", "Smith", 4);
		insertion obj5 = new insertion(24567, "Bob", "Reynolds", 5);
		insertion[] employee = new insertion[] {obj1,obj2,obj3,obj4,obj5}; 
		insertion emp = new insertion();
		System.out.println("Before Sorting");
		for(int i=0;i<=employee.length-1;i++) {
			System.out.print(employee[i].empNo);
			System.out.print(employee[i].empFname);
			System.out.print(employee[i].empLname);
		}
		emp.sort(employee);
		
	}
	
	public void sort(insertion[] employee) {
		
		insertion curr = new insertion();
		int j=0;
		for(int i=0;i<=employee.length-1;i++) {
			curr = employee[i];
			j=i-1;
			while (j>=0 && employee[j].empNo> curr.empNo) {
				employee[j+1] = employee[j];
				j = j-1;
			}
			employee[j+1]= curr;
		}
		System.out.println("After Sorting");
		for(int i=0;i<=employee.length-1;i++) {
			System.out.print(employee[i].empNo);
			System.out.print(employee[i].empFname);
			System.out.print(employee[i].empLname);
		}
		
	}
}