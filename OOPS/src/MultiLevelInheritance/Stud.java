package MultiLevelInheritance;

public class Stud extends Teacher{
	public void about() {
		System.out.println("\n");
		System.out.println("RCB");
		System.out.println("---------");
			}
        public void details(String n) {
        	System.out.println("Student");
        	System.out.println("  Student Name " +n);
        }
}
