package BackEnd;

public class Habitat {

    private int id;
    private String habitatName;
    private String weather;
    private String vegetation;
    private String continent;
    
    public Habitat(){}
    
    public Habitat(int id, String habitatName, String weather, 
           String vegetation, String continent){
        this.id = id;
        this.habitatName = habitatName;
        this.weather = weather;
        this.vegetation = vegetation;
        this.continent = continent;
    }
    
    public Habitat(Habitat habitat){
        this(habitat.getId(), habitat.getHabitatName(), 
            habitat.getWeather(), habitat.getVegetation(), habitat.getContinent());
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHabitatName() {
        return habitatName;
    }

    public void setHabitatName(String habitatName) {
        this.habitatName = habitatName;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getVegetation() {
        return vegetation;
    }

    public void setVegetation(String vegetation) {
        this.vegetation = vegetation;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
    
}