
public class Bubble {

	public static void main(String[] args) {
		int[] unsorted = {9,5,7,6,8,1,3,2,4};
		unsorted = sort(unsorted);
		for(int i : unsorted) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] sort(int[] arr) {
		// for as many elements in the array
		for(int outer = 0; outer < arr.length; outer++ ) {
			// check each element and swap as needed
			for(int inner = 1; inner < arr.length - outer; inner++) {
				if (arr[inner - 1] > arr[inner]) {
					//swap
					int temp = arr[inner - 1];
					arr[inner - 1] = arr[inner];
					arr[inner] = temp;
				}
			}
		}
		return arr;
	}
}
