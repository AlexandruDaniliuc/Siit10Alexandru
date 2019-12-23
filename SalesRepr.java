package ro.siit;

public class SalesRepr {
    private int nrOfSales;
    private int valueOfSales;
    public int revenue;


    public SalesRepr(int nrOfSales, int valueOfSales) {
        this.nrOfSales = nrOfSales;
        this.valueOfSales = valueOfSales;
        this.revenue = nrOfSales * valueOfSales;
    }

    public static void main(String[] args) {
        SalesRepr[] SalesRepresentative = new SalesRepr[4];
        SalesRepresentative[0] = new SalesRepr(10, 500);
        SalesRepresentative[1] = new SalesRepr(20, 600);
        SalesRepresentative[2] = new SalesRepr(30, 40);
        SalesRepresentative[3] = new SalesRepr(11, 700);

        for (SalesRepr salesRepCorrect: SalesRepresentative){
            System.out.println(salesRepCorrect);
        }

        SalesRepresentative = SalesRepresentative[0].bubbleSort(SalesRepresentative);
        for (SalesRepr salesRepr: SalesRepresentative){
            System.out.println(salesRepr);
        }

    }

    SalesRepr[] bubbleSort(SalesRepr[] SalesRepresentative) {
        int n = SalesRepresentative.length;
        int flag;
        SalesRepr item;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (SalesRepresentative[j].revenue > SalesRepresentative[j + 1].revenue) {
                    item = SalesRepresentative[j];
                    SalesRepresentative[j] = SalesRepresentative[j + 1];
                    SalesRepresentative[j + 1] = item;

                }
            }
        }
        return SalesRepresentative;
    }

    @Override
    public String toString() {
        return "" + this.revenue;
    }
}

