import java.util.*;
class Remove
 {
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
         {
            list.add(sc.nextInt());
        }
        List<Integer> result = removeDuplicates(list);
        System.out.println("List after removing duplicates: " + result);
    }

    public static <T> List<T> removeDuplicates(List<T> list) 
   {
        List<T> result = new ArrayList<>();
        Set<T> seen = new HashSet<>();
        for (T item : list) 
         {
            if (!seen.contains(item)) 
            {
                seen.add(item);
                result.add(item);
            }
        }
        return result;
    }
}