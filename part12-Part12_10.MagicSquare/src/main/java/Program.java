
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
       MagicSquareFactory msFactory = new MagicSquareFactory();

        System.out.println(msFactory.createMagicSquare(5));

        /*
        MagicSquare ms = new MagicSquare(3);
        ms.placeValue(0, 0, 1);
        ms.placeValue(0, 1, 4);
        ms.placeValue(0, 2, 7);
        ms.placeValue(1, 0, 2);
        ms.placeValue(1, 1, 5);
        ms.placeValue(1, 2, 8);
        ms.placeValue(2, 0, 3);
        ms.placeValue(2, 1, 6);
        ms.placeValue(2, 2, 9);

        System.out.println(ms.sumsOfRows());
        System.out.println(ms.sumsOfColumns());
        */
    }
}
