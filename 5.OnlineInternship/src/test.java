import java.util.Arrays;
import java.util.Scanner;

public class test {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] mas = new int[n];
    int sum = 0;
    for (int i = 0; i < mas.length; i++) {
      mas[i] = sc.nextInt();
    }
    for (int i = 0; i < mas.length; i++) {
      for (int j = 1; j < mas.length; j++) {
        sum = mas[0];
        if (mas[i] != mas[j]) {
          sum = mas[i] + mas[j];
        }
      }
    }

    System.out.println(Arrays.toString(mas));
    System.out.println(sum);
  }
}
