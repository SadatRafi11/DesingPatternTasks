package compositePattern;

public class Index {

	public static void main(String[] args) {
		Node sem_dir = new Directory("Semester");
		
		Node designPattern_dir = new Directory("Design Pattern");
		Node os_dir = new Directory("Operating System");
		
		INode desing_assignment = new File("Assignment_2", "this is assignment 2");
		INode routine = new File("Routine", "this is the routine");
		
		designPattern_dir.addNode(desing_assignment);
		sem_dir.addNode(designPattern_dir);
		sem_dir.addNode(os_dir);
		sem_dir.addNode(routine);
		
		System.out.println(sem_dir.singleClick());
		System.out.println(sem_dir.doubleClick());
		
		System.out.println(routine.singleClick());
		System.out.println(routine.doubleClick());
		
		System.out.println(designPattern_dir.doubleClick());
		
		System.out.println(desing_assignment.doubleClick());
		
	}

}
