public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(2);
        fan1.setRadius(1);
        fan1.setColor("Black");
        fan1.setOn(true);
        System.out.println(fan1.toString());
    }
}
