package de.htw_berlin.ai_bachelor.kbe.tree;

public class Tree<T> {
	private final T value;
	private final Tree left;
	private final Tree right;

	public Tree(T v, Tree l, Tree r) {
		this.value = v;
		this.left = l;
		this.right = r;
	}

	public T getValue() {
		return this.value;
	}

	public Tree getLeft() {
		return this.left;
	}

	public Tree getRight() {
		return this.right;
	}
}
