package boom;

public class HeapBoom {
	public static void main(String args[]) {
		int size = Integer.MAX_VALUE - 1024;
		String[] s = new String[size];
		System.out.println(s.getClass());
	}
}
