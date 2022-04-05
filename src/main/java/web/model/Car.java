package web.model;

public class Car {
    private String color;
    private int series;
    private String model;

    public Car(String color, int series, String model) {
        this.color = color;
        this.series = series;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", series=" + series +
                ", model=" + model +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}


