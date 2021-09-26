package compositePattern;

public class File implements INode {
	private String name;
	private String data;
	
	public File (String name, String data) {
		this.name = name;
		this.data = data;
	}
	
	@Override
	public String singleClick() {
		return "file/dir name: " + name;
	}
	
	@Override
	public String doubleClick() {
		return "Reading Data...\n\t" + data;
	}

}
