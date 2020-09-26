package com.ds.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLinkedList<E> {

	private static Logger logger = LoggerFactory.getLogger(MyLinkedList.class);

	@SuppressWarnings("hiding")
	class Node<E> {
		private E val;
		private Node<E> next;

		public Node() {
			// Empty Constructor
		}

		public Node(E data) {
			this.val = data;
			this.next = null;
		}
	}

	private Node<E> head;
	private Node<E> tail;
	private Long size = 0L;

	public void addLast(E val) {

		Node<E> n = new Node<E>(val);
		if (size() == 0) {
			head = tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
		size++;
	}

	public E findAtIdx(int idx) throws Exception {

		if (size() == 0) {
			logger.error("LinkedList is empty");
			throw new Exception();
		}
		if (idx < 0 || idx > size()) {
			logger.error("Please choose valid index");
			throw new Exception();
		}

		Node<E> temp = head;
		for (int i = 1; i <= idx; i++) {

			temp = temp.next;
		}
		return temp.val;
	}

	public Long size() {
		return this.size;
	}

	public void add(int idx, E val) throws Exception {

		if (idx < 0 || idx > size) {
			logger.error("Please choose valid index");
			throw new Exception();
		}
		Node<E> n = new Node<E>(val);

		if (size() == 0) {
			head = tail = n;
			size++;
			return;
		} else {

			if (idx == 0) {
				n.next = head;
				head = n;
				size++;
				return;
			}
			Node<E> temp = head;
			for (int i = 1; i < idx; i++) {
				temp = temp.next;
			}
			n.next = temp.next;
			temp.next = n;
			size++;
			return;
		}

	}

}
