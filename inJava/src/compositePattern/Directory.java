package compositePattern;

import java.util.List;
import java.util.ArrayList;

public class Directory implements Node {
	
	Node directory;
	String name;
	List<INode> fileSystem = new ArrayList<>();
	
	public Directory(String name) {
		this.name = name;
	}

	@Override
	public void addNode(INode node) {
		fileSystem.add(node);
	}

	@Override
	public void removeNode(INode node) {
		fileSystem.remove(node);
	}
	
	@Override
	public String singleClick() {
		return "file/dir name: " + name;
	}

	@Override
	public String doubleClick() {
		StringBuilder data = new StringBuilder("List of directory: \n");
		for (INode node: fileSystem) {
			data.append("\n" + "\t" + node.singleClick());
		}
		return data.toString();
	}

}
