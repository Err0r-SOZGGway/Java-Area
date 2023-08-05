package quickSort;

public class Main {

	public static void main(String[] args) {
		int[] array1 = { 2, 8, 10, 5, 4, 1, 9, 7, 3, 6 };
		int[] array2 = { 3, 7, 1, 6, 10, 9, 2, 4, 5, 8 };

		// メソッドを作成してクイックソートを実装
		print(array1);
		quickSort(array1, 0, array1.length);
		print(array1);
		
		System.out.println();
		
		// ライブラリを使ってクイックソートを実装
		print(array2);
		java.util.Arrays.sort(array2);
		print(array2);
	}

	static void print(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
			if (i==array.length-1) {
				System.out.println();
			}else {
				System.out.print(",");
			}
		}
	}
	
	static void quickSort(int[] array, int start, int end) {
		if (end - start <= 1) {
			return;
		}

		int pivot = array[end - 1];
		int target = start;
		for (int i = start; i < end - 1; i++) {
			if (array[i] < pivot) {
				if (i != target) {
					int tmp = array[target];
					array[target] = array[i];
					array[i] = tmp;
				}
				target++;
			}
		}

		array[end - 1] = array[target];
		array[target] = pivot;

		quickSort(array, start, target);
		quickSort(array, target + 1, end);
	}

}
