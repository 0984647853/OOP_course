public class PrintDis {
    private Distribution distribution;

    //Constructor sets the Distribution object
    public PrintDis(Distribution distribution) {
        this.distribution = distribution;
    }

    public void displayDistribution(int value) {
        Distribution dis = distribution;
        System.out.println("Frequencies of value: "+dis.frequency(value));
        System.out.println("Average: "+dis.average());
    }
}
