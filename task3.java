
public class task3 {
	
	public static void printArray(int[][] a) {
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void makeRandom(int[][] a) {
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				a[i][j] = (int)(Math.random()*11)+10;
			}
		}
	}
	
	public static int[][] rotate90(int[][] a) {
		int[][] b = new int[a[0].length][a.length];
		for (int i=0 ; i<b.length; i++) {
			for (int j=0, l=a[j].length-1; j<b[i].length; j++, l--) {
				b[j][i] = a[i][l];
			}
		}
		return b;
	}
	
	public static int[][] rotate180(int[][] a) {
		a = rotate90(a);
		a = rotate90(a);
		return a;
	}
	
	public static int[][] rotate270(int[][] a) {
		a = rotate90(a);
		a = rotate90(a);
		a = rotate90(a);
		return a;
	}
	
	public static int[][] deleteMaxElements(int[][] a) {
		int maxElem = 0;
		int line = 0;
		int column = 0;
		boolean cicle;
		do {
			cicle = false;
			for (int i=0; i<a.length; i++) {
				for (int j=0; j<a[i].length; j++) {
					if (maxElem < a[i][j]) {
						maxElem = a[i][j];
						line = i;
						column = j;
					}
				}
			}
			a = del(a, maxElem, line, column);
			for (int i=0; i<a.length; i++) {
				for (int j=0; j<a[i].length; j++) {
					if (a[i][j] == maxElem) {
						cicle = true;
					}
				}
			}
		} while (cicle);
		
		return a;
	}
	
	public static int[][] del(int[][] a, int maxElem, int line, int column) {
		int[][] b = new int[a.length-1][a[0].length-1];

		for (int i=0, k=0; k<b.length; i++, k++) {
			if (i == line) {
				i++;
			}
			for (int j=0, l=0; l<b[k].length; j++, l++) {
				if (j == column) {
					j++;
				}
				b[k][l] = a[i][j];
			}
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		int[][] array = new int[4][4];
		makeRandom(array);
		printArray(array);
		array = rotate270(array);
		printArray(array);
		array = deleteMaxElements(array);
		printArray(array);
	}
}
