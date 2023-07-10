public class Main {

    static int totalBoxes = 34;
    static int truckCapacity = 9;
    static int shippedBoxes;

    public static void main(String[] args) {
        moving();
    }

    public static void moving() {
        while (totalBoxes > shippedBoxes) {
            if (shippedBoxes + truckCapacity < totalBoxes) {
                shippedBoxes = shippedBoxes + truckCapacity;
                System.out.println("A trip has been made with " + truckCapacity + " boxes");
            } else {
                System.out.println("A trip has been made with " + (totalBoxes - shippedBoxes) + " boxes");
                shippedBoxes = shippedBoxes + (totalBoxes - shippedBoxes);
            }
        }
    }
}


