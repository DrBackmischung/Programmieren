package de.mathisneunzig.zug.list;

public class Tree<V> {

	private Node<V> header;
	private Node<V> current;
	
	public void add(V data) {
		if(header != null) {
			current = header;
			if(((Comparable)data).compareTo(current.data) > 0) {
//				if(current.leftNode != null)
			}
		} else {
			header = new Node<>(data, null, null);
		}
	}
	
	public void add(V data, Node<V> node) {
		
	}
	
	public class Node<D> {
		private D data;
		private Node<V> leftNode;
		private Node<V> rightNode;
		public Node(D data, Node leftNode, Node rightNode) {
			this.data = data;
			this.leftNode = leftNode;
			this.rightNode = rightNode;
		}
	}

}
