package com.datastructure.one;

public class SinglyLinkedList<T> {

	private Node<T> head = null;
	private Node<T> tail = null;
	private int length = 0;

	public void addAtBegining(T data) {
		if (head == null) {
			head = new Node(data, null);
			tail = head;
			length++;
		} else {
		}
	}

	public void addAtEnd(T data) {
		if (head == null) {
			this.addAtBegining(data);
		} else {
			Node<T> newNode = new Node(data, null);
			tail.setNext(newNode);
			tail = newNode;
			tail.setNext(null);
			length++;
		}
	}

	public void addAtIndex(T data, int index) {
		if(index > length) {
			this.addAtEnd(data);
		}else if(index == 0) {
			this.addAtBegining(data);
		}else if(index < length) {
			 
		}
		
	}
}

class Node<T> {

	private T data;
	private Node<T> next;

	public Node(T data) {
		this.data = data;
	}

	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}
