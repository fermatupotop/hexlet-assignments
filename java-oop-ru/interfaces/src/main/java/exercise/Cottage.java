package exercise;

// BEGIN
class Cottage implements Home{

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    private double area;
    private int floorCount;

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compateTo(Home another) {
        return getArea() > another.getArea() ? 1 : getArea() < another.getArea() ? -1 : 0;
    }

    public String toString(){
        String toString = this.floorCount + " этажный коттедж площадью " + getArea() + " метров";
        return toString;
    }
}
// END
