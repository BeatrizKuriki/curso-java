package listaEncadeadaTrabalho;

public class DoubleLinkedList<T> {

	private Node<T> beginning;
	private int size;
	private Node<T> ending;
	
	
	
	public void insertFirst(T element) {
		Node<T> node = new Node<T>(element);
		node.element = node.getElement();
		node.previous = null;
		node.next = beginning;
		
		if(beginning != null) {
			beginning.previous = node;
		}		
		beginning = node;
		if(size==0) {
			ending = beginning;
		}
		size++;
	
		
		
	}
	
	public T removeFirst() {
		if(beginning == null) {
			return null;
		}
		
		T out =  beginning.element;
		beginning = beginning.next;
		if(beginning != null) {
			beginning.previous = null;
			
		}else {
			ending = null;
		}
		size--;		
		return (T) out;
	}
	
	public void insertEnd(T element) {
		Node<T> node = new Node<T>(element);
		node.element = node.getElement();
		node.next = null;
		node.previous = ending;
		if(ending != null) {
			ending.next = node;
			
		}	
		ending = node;
		if( size==0) {
			beginning = ending;
			
		}
		size++;		
	}
	
	public T removeLast() {
		if(ending == null) {
			return null;
		}
		T out = ending.element;
		ending = ending.previous;
		if( ending != null) {
			ending.next = null;
			
		}else {
			beginning = null;
		}
		size--;
		return out;
		
	}

	public void addElement(T element) {
		Node<T> content = new Node<T>(element);

		if (size == 0) {
			this.beginning = content;
			this.ending = content;
		} else {
			this.ending.setNext(content);
		}

		this.ending = content;
		this.size++;

	}

	public int getSize() {
		return this.size;
	}

	@Override
	public String toString() {

		if (this.size == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder("[");

		Node<T> current = this.beginning;

		for (int i = 0; i < this.size - 1; i++) {
			builder.append(current.getElement()).append(",");
			current = current.getNext();

		}

		builder.append(current.getElement()).append("]");

		return builder.toString();
	}

	
}
