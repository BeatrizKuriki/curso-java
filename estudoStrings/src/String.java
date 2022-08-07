
public class String {

	public static void main(java.lang.String[] args) {
		java.lang.String original = "abcde FGHIJ ABC abc DEFG ";
		java.lang.String s01 = original.toLowerCase();
		java.lang.String s02 = original.toUpperCase();
		java.lang.String s03 = original.trim();
		java.lang.String s04 = original.substring(2);
		java.lang.String s05 = original.substring(2, 9);
		java.lang.String s06 = original.replace('a', 'x');
		java.lang.String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

	}

}
