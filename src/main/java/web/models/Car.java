package web.models;


import org.springframework.stereotype.Component;

@Component
public class Car {

    private String model;
    private int series;
    private String cost;

    public Car(){
    }

    public Car(String model, int series, String cost) {
        this.model=model;
        this.series=series;
        this.cost=cost;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", cost='" + cost + '\'' +
                '}';
    }
}
