public class Modified {
    private static int count;

    public static void modifiedCar(Car car, Color newColor){
        System.out.println("Renk Değiştiriliyor...");
       // car.setColor(newColor);
        car.changeColor(newColor);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
