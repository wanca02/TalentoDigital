package stringImport;

public class StringManipulator {
	public String trimAndConcat(String a, String b) {
		return a.trim() + b.trim();
	}
	public int getIndexOrNull(String a, char b) {
		return a.indexOf(b);
	}
	public int getIndexOrNull(String a, String b) {
		return a.indexOf(b);
	}
	public String concatSubstring(String a, int b, int c, String d) {
		return a.substring(b, c)+d;
	}
}

