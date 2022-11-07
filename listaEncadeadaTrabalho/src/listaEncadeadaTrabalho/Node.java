package listaEncadeadaTrabalho;

public class Node <T> {
	
	 T element;
    Node <T> previous;
	Node <T> next;
	
	public Node() {
		
	}
	
	public Node(T element) {
		this.element = element;
		this.next = null;
	}
	
	public Node(T element, Node<T> next) {		
		this.element = element;
		this.next = next;
	}
	
	
	public Node(T element, Node<T> previous, Node<T> next) {
		this.element = element;
		this.previous = previous;
		this.next = next;
	}

	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	
	
	public Node<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Node element=").append(element).append(".next=").append(next).append("]");
		return builder.toString();
	}

	
	

}
