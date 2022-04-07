package day36_Inheritance.planetTask;

public class Planet {

    private String name, mass;
    private double radius;
    private String surfaceGravity, surfaceArea;
    private double volume;
    private int population;

    public void setInfo(String name, String mass, double radius, String surfaceGravity, String surfaceArea, double volume, int population) {
       setName(name);
       setMass(mass);
       setRadius(radius);
       setSurfaceGravity(surfaceGravity);
       setSurfaceArea(surfaceArea);
       setVolume(volume);
       setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getSurfaceGravity() {
        return surfaceGravity;
    }

    public void setSurfaceGravity(String surfaceGravity) {
        this.surfaceGravity = surfaceGravity;
    }

    public String getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(String surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass='" + mass + '\'' +
                ", radius=" + radius +
                ", surfaceGravity='" + surfaceGravity + '\'' +
                ", surfaceArea='" + surfaceArea + '\'' +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}

/*
create a class called Planet
			variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			methods:
				setInfo()
				toString()
 */