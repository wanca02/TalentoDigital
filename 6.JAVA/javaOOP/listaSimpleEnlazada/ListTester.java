package listaSimpleEnlazada;

public class ListTester {
	public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.add(20);
        sll.add(13);
        sll.printValues();
        System.out.println("Lista Original........\n");
        sll.remove(13);
        //sll.remove();
        System.out.println("Lista Nueva........");
        sll.printValues();
        System.out.println(sll.find(5));
        sll.removeAt(6);
        System.out.println("Lista Nueva........");
        sll.printValues();
    }
}
