package listaSimpleEnlazada;

public class SinglyLinkedList {
	public Node head;
    public SinglyLinkedList() {
        // su codigo aqui
    	this.head=null;
    }
    //Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la lista.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void printValues(){
    	Node n = head;  
    	while (n != null){  
    		System.out.print(n.value+" \n");
    		n = n.next;
    	}
    }
	public void remove(int v) {
		Node a=null;
		Node p = head;
		Node s = p.next;
		if(head.value==v){
			s = p.next;
			head = s;
		}else {
			while (p != null){ 
				if(p.value==v) {
					if(s!=null) p.value=s.value;
					a.next=p.next;
				}
				a=p;
				p = p.next;
				if(s!=null) s = s.next;
	    	}
		}
	}
	public Node find(int v) {
		Node p=head;
		while (p != null && p.value!=v){ 
			p = p.next;
    	}
		return p;
	}
	public void removeAt(int v) {
		Node a=head;
		Node p = a.next;
		Node s = p.next;
		int cc=0;
		while (p != null){ 
			if(cc==v) {
				p.value=a.value;
				a.next=p.next;
			}
			a=p;
			p = p.next;
			if(s!=null) s = s.next;
			cc++;
    	}
	}
}











