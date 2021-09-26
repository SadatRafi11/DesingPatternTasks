package compositePattern;

public interface Node extends INode {
	public void addNode(INode node);
	public void removeNode(INode node);
}