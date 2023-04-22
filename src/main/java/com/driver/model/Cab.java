package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name="cab")
public class Cab{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cabId;
    private int perKmRate;
    private boolean available;
    @OneToOne(mappedBy = "cab",cascade = CascadeType.ALL)
    Driver driver;

    public Cab(){

    }

    public Cab(int cabId, int perKmRate, boolean available) {
        this.cabId = cabId;
        this.perKmRate = perKmRate;
        this.available = available;
    }

    public int getCabId() {
        return cabId;
    }

    public void setCabId(int cabId) {
        this.cabId = cabId;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}