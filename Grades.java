import java.util.Scanner;
import java.util.ArrayList;

public class Grades {
	static Scanner scan = new Scanner(System.in);
	public static int readGrades(int[] grades) {
		int numGrades = grades.length;
		return numGrades;

	}
	public static int sum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; ++i) {
			sum += arr[i];
		}
		return sum;
	}
	public static int sum(int[] arr, int firstIndex, int lastIndex) {
		if (arr.length - 1 < lastIndex || arr.length - 1 < firstIndex || firstIndex < 0) {
			return -666;
		}
		int sum = 0;
		for(int i = firstIndex; i <= lastIndex; ++i) {
			sum += arr[i];
		}
		return sum;
	}
	public static double average(int[] arr) {
		int sumVals = sum(arr);
		int avg = sumVals / arr.length;
		return avg;
	}
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int maxValue(int[] arr, int firstIndex, int lastIndex) {
		if (arr.length - 1 < lastIndex || arr.length - 1 < firstIndex || firstIndex < 0) {
			return -666;
		}
		int max = arr[firstIndex];
		for (int i = firstIndex + 1; i <= lastIndex; ++i) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int indexOfFirstMaxValue(int[] arr) {
		int max = arr[0];
		int index = 0;
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] == max) {
				index = i;
				break;
			}
		}
		return index;
	}
	public static int minValue(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int minValue(int[] arr, int firstIndex, int lastIndex) {
		if (arr.length - 1 < lastIndex || arr.length - 1 < firstIndex || firstIndex < 0) {
			return -666;
		}
		int min = arr[firstIndex];
		for (int i = firstIndex + 1; i <= lastIndex; ++i) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int indexOfFirstMinValue(int[] arr) {
		int min = arr[0];
		int index = 0;
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] == min) {
				index = i;
				break;
			}
		}
		return index;
	}
	public static int numberOfBelowAverageElements(int[] arr) {
		double avg = average(arr);
		int numElements = 0;
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] < avg) {
				++numElements;
			}
		}
		return numElements;
	}
	public static int numberOfAboveAverageElements(int[] arr) {
		double avg = average(arr);
		int numElements = 0;
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] > avg) {
				++numElements;
			}
		}
		return numElements;
	}
	public static void rotateElements(int[] arr) {
		int last = arr[arr.length - 1];
		for (int i = 1; i < arr.length; ++i) {
			arr[i] = arr[i-1]; 
		}
		arr[0] = last;
	}
	public static void rotateElements(int[] arr, int rotationCount) {
		int index = 0;
		if (rotationCount > arr.length) {
			rotationCount %= arr.length;
		}
		for (int i = 0; i < rotationCount; ++i) {
			arr[i] = arr[(rotationCount - 1) + i]; 
		}
		for (int i = rotationCount; i < arr.length; ++i) {
			arr[i] = arr[index]; 
			++index;
		}

	}
	public static void reverseArray(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; ++i) {
			temp = arr[i];
			arr[i] = arr[arr.length - (1 + i)];
			arr[arr.length - (1 + i)] = temp;
		}
	}
	public static void main(String [] args) {
		int userNum;
		boolean go = true;
		ArrayList<Integer> userGrades = new ArrayList<Integer>();
		while (go) {
			System.out.println("Enter a grade : ");
			userNum = scan.nextInt();
			if (userNum >= 0) {
				userGrades.add(userNum);

				continue;
			}
			else {
				go = false;
			}
		}
		if (userGrades.size() != 0) {
			int[] grades = new int[userGrades.size()];
			for(int i = 0;i < grades.length; ++i) {
			    grades[i] = userGrades.get(i);
			}
			int numGrades = readGrades(grades);
			int maxValue = maxValue(grades);
			int minValue = minValue(grades);
			System.out.println("Number of grades = " + numGrades);
			System.out.println("Maximum exam grade = " + maxValue);
			System.out.println("Minimum exam grade = " + minValue);
			go = true;
		}
	}

}
