package de.mathisneunzig.zug.list;

public class List<V> {
	
	private Node<V> header;
	private Node<V> current;
	public int size;
	
	public List() {
		size = 0;
	}
	
	public void add(V data) {
		if(header != null) {
			current = header;
			while(current.nextNode != null) {
				current = current.nextNode;
			}
			current.nextNode = new Node<>(data, null);
		} else {
			header = new Node<>(data, null);
		}
		size ++;
	}
	
	public void remove(V data) {
		if(header != null) {
			current = header;
			while (current.nextNode != null) {
				if(current.nextNode.data.equals(data)) {
					current.nextNode = current.nextNode.nextNode;
					size--;
					return;
				}
			}
		} else {
			if(header.data.equals(data)) {
				header = null;
				size--;
			}
		}
	}
	
	public boolean contains(V data) {
		if(header != null) {
			if(header.data.equals(data))
				return true;
			current = header;
			while(current.nextNode != null) {
				current = current.nextNode;
				if(current.data.equals(data))
					return true;
			}
		} 
		return false;
	}
	
	public void print() {
		if(header != null) {
			System.out.println(header.data.toString());
			current = header;
			while(current.nextNode != null) {
				current = current.nextNode;
				System.out.println(current.data.toString());
			}
		}
	}
	
	public class Node<D> {
		private D data;
		private Node<D> nextNode;
		public Node(D data, Node nextNode) {
			this.data = data;
			this.nextNode = nextNode;
		}
	}
	
}
