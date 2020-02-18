package stringImport;

class StringManipulatorTest {
	public static void main(String[] args) {
		StringManipulator manipulator = new StringManipulator();
		String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
		System.out.println(str); // HolaMuno 	
		
		//StringManipulator manipulator = new StringManipulator();
		char letter = 'n';
		int a = manipulator.getIndexOrNull("Coding", letter);
		int b = manipulator.getIndexOrNull("Hola Mundo", letter);
		int c = manipulator.getIndexOrNull("Saludar", letter);
		System.out.println(a); // 4
		System.out.println(b); // 7
		System.out.println(c); // null
		
		
		//StringManipulator manipulator = new StringManipulator();
		String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";
		int a1 = manipulator.getIndexOrNull(word, subString);
		int b1 = manipulator.getIndexOrNull(word, notSubString);
		System.out.println(a1); // 2
		System.out.println(b1); // null
		
		
		//StringManipulator manipulator = new StringManipulator();
		String word1 = manipulator.concatSubstring("Hola", 1, 2, "mundo");
		System.out.println(word1); // omundo
	}
}
