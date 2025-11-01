import java.util.Scanner;

public class exercise6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataSet data = new DataSet();

        System.out.print("Enter floating-point values (separated by spaces): ");
        String line = input.nextLine();
        String[] values = line.split(" ");

        for (String s : values) {
            double val = Double.parseDouble(s);
            data.add(val);
        }

        System.out.println("Average: " + data.getAverage());
        System.out.println("Smallest: " + data.getSmallest());
        System.out.println("Largest: " + data.getLargest());
        System.out.println("Range: " + data.getRange());
    }
}

class DataSet {
    private double sum;
    private double smallest;
    private double largest;
    private int count;

    public DataSet() {
        sum = 0;
        count = 0;
        smallest = Double.MAX_VALUE;
        largest = Double.MIN_VALUE;
    }

    public void add(double value) {
        sum += value;
        count++;

        if (value < smallest) {
            smallest = value;
        }

        if (value > largest) {
            largest = value;
        }
    }

    public double getAverage() {
        if (count == 0) return 0;
        return sum / count;
    }

    public double getSmallest() {
        return smallest;
    }

    public double getLargest() {
        return largest;
    }

    public double getRange() {
        return largest - smallest;
    }
}
