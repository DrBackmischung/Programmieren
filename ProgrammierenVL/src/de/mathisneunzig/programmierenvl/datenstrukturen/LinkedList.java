package de.mathisneunzig.programmierenvl.datenstrukturen;

public class LinkedList<T> {
	
	private Node<T> head;
	
	public void add(T data) {
		if(head == null)
			head = new Node<T>(data);
		else {
			Node<T> current = head;
			while(current.nextNode != null) {
				current = current.nextNode;
			}
			current.nextNode = new Node<T>(data);
		}
	}
	
	public boolean remove(T data) {
//		if(!contains(data)) {
//			return false;
//		}
		if(head == null) {
			return false;
		}
		if(head.data.equals(data)) {
			head = head.nextNode;
			return true;
		} else {
			Node<T> current = head;
			while(current.nextNode != null) {
				if(current.nextNode.data.equals(data)) {
					if(current.nextNode.nextNode != null) {
						current.nextNode = current.nextNode.nextNode;
						return true;
					} else {
						current.nextNode = null;
						return true;
					}
				} else {
					current = current.nextNode;
				}
			}
		}
		return false;
	}
	
	public boolean contains(T data) {
		if(head == null) {
			return false;
		}
		Node<T> current = head;
		while(current.nextNode != null) {
			if(current.data.equals(data))
				return true;
			current = current.nextNode;
		}
		if(current.data.equals(data))
			return true;
		return false;
	}
	
	private class Node<N> {
		public Node<N> nextNode;
		public N data;
		public Node(N data) {
			this.data = data;
		}
	}

}
