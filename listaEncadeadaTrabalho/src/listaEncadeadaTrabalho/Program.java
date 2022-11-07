package listaEncadeadaTrabalho;

public class Program {

	public static void main(String[] args) {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
		
		list.addElement(1);
		list.addElement(10);
		list.addElement(12);
		list.insertEnd(11);
		list.insertFirst(0);
	
		
		System.out.println("The elements are:"+list);
		System.out.println("Size:" + list.getSize());
		
		System.out.println("---------------------------------");
		
		list.removeFirst();
		System.out.println("The elements are:"+list);
		System.out.println("---------------------------------");
		list.removeLast();
		System.out.println("The elements are:"+list);
		
		
	
		
		

	}

}
