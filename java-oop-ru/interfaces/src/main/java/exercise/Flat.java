package exercise;

// BEGIN
class Flat implements Home{

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    private double area;
    private double balconyArea;
    private int floor;

    @Override
    public double getArea() {
        return this.area + this.balconyArea;
    }

    @Override
    public int compateTo(Home another) {
        return getArea() > another.getArea() ? 1 : getArea() < another.getArea() ? -1 : 0;
    }

    public String toString(){
        String toString = "Квартира площадью " + getArea() + " метров на " + this.floor + " этаже";
        return toString;
    }

    public static void main(String[] args) {
        Home flat = new Flat(54.5, 4, 3);
        double area = flat.getArea(); // 58.5
        System.out.println(flat.toString()); 

    }
}
// END
