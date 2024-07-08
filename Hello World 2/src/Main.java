import java.util.*;
public class Main {
    public static ArrayList<Integer> fibMethod(int x) {
        if (x == 0) {
            ArrayList<Integer> baseList = new ArrayList<>();
            baseList.add(0);
            return baseList;
        } else if (x == 1) {
            ArrayList<Integer> baseList = new ArrayList<>();
            baseList.add(1);
            return baseList;
        } else {
            ArrayList<Integer> previous = fibMethod(x - 1);
            ArrayList<Integer> current = fibMethod(x - 2);
            int nextNumber = previous.get(previous.size() - 1) + current.get(current.size() - 1);
            previous.add(nextNumber);
            return previous;
        }
    }

    public static void main(String[] args)
    {
        int n;
        Scanner snr = new Scanner(System.in);
        n=snr.nextInt();
        snr.close();
        System.out.println(fibMethod(n));
    }
}