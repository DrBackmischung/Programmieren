package de.mathisneunzig.zug.list;

public class Queue<V> {
	
	private Node<V> header;
	private Node<V> current;
	public int size;
	
	public Queue() {
		size = 0;
	}
	
	public void enqueue(V data) {
		header = new Node<>(data, header);
	}
	
	public V dequeue() {
		if(header != null) {
			current = header;
			while (current.nextNode.nextNode != null) {
				current = current.nextNode;
			}
			V cache = current.nextNode.data;
			current.nextNode = null;
			return cache;
		} else {
			return null;
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
