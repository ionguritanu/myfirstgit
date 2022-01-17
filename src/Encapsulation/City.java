package Encapsulation;

public class City {

    private String name;
    private int population;
    private String state;
    private int establishmentYear;
    public String flag;


    //setter
    public void setName(String cityName){
        this.name = cityName;
    }
    public void setPopulation(int populationCity){
        this.population = populationCity;
    }
   public void setState(String stateCity){
        this.state = stateCity;
   }
   public void setEstablishmentYear(int setEstablishmentYear){
        this.establishmentYear = setEstablishmentYear;
   }
   // getters
    public String getName(){
        return this.name;
    }
    public int getPopulation(){
        return this.population;
    }
    public int getEstablishmentYear(){
        return this.establishmentYear;
    }
    public String getState(){
        return this.state;
    }
}
