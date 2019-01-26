public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed ;
    private boolean on ;
    private double radius ;
    private String color ;
    public Fan(){
        this.speed =SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "white";
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean TrueORFalse) {
        this.on = TrueORFalse;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public String toString(){
       return "speed " + this.speed + "\n" + "color " + this.color + "\n"
                + "radius " + this.radius + "\n" + (this.on ? "fan is on" : " fan is off");
    }
}
