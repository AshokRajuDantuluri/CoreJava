package hasARelationShip;

public class Department {
	
	String Department1 = "Mechanical";
	String Department2 = "Electrical";
	String Department3 = "Electronics";
	String Department4 = "ComputerScience";
	
    //University university;


	public static void main(String[] args) {
        
		Department dept = new Department();
		University unv = new University();
		unv.setNoofDepartmentts(5);
		System.out.println(unv.getNoofDepartmentts());
		




		
	}

}
