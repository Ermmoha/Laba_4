import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку для сортировки: ");
        String input = scanner.nextLine();

        char[] characters = input.toCharArray();
        Sort(characters);
        String sortedString = new String(characters);
        System.out.print("Отсортированный методом расчёски массив:\n\t");
        System.out.printf("Отсортированная строка: %s ",sortedString );
    }

    public static void Sort(char[] array)
    {
        int step = array.length - 1;
        boolean isSorted = false;
        while (step >= 1 || !isSorted)
        {
            isSorted = true;
            for (int i = 0; i + step < array.length; i++)
            {
                if (array[i] > array[i + step])
                {
                    char temp = array[i];
                    array[i] = array[i + step];
                    array[i + step] = temp;
                    isSorted = false;
                }
            }
            step /= 1.247;
        }
    }
}