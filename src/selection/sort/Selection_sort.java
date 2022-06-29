package selection.sort;

public class Selection_sort {
    void selection_sort(int Arr[])
    {
        int len = Arr.length;
        for(int i =0; i < len -1; i++)
        {
            int min_position = i;
            for (int j = i +1; j < len; j++)
            {
                if(Arr[j] < Arr[min_position])
                {
                    min_position = j;
                }
            }
            int temp = Arr[i];
            Arr[i] = Arr[min_position];
            Arr[min_position] = temp;
        }

        System.out.println("The sorted array is: ");
        for (int i =0; i <len; i++)
        {
            System.out.print(Arr[i] + " ");
        }
    }
    public static  void main(String[] args)
    {
        int[] array = {12, 5, 34, 21, 45, 100, 25, 17, 3};
        Selection_sort ss = new Selection_sort();
        ss.selection_sort(array);
    }
}
