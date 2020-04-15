package BackEnd;

public class Specie {
    
    private int specieId;
    private String specieName; //in spanish
    private String specieSciName;
    private String description;
    
    public Specie(int specieId, String specieName, String specieSciName,
            String description){
        this.specieId = specieId;
        this.specieName = specieName;
        this.specieSciName = specieSciName;
        this.description = description;
    }
    
    public Specie(Specie specie){
        this(
                specie.getSpecieId(), specie.getSpecieName(), 
                specie.getSpecieSciName(), specie.getDescription()
        );
    }
    
    public int getSpecieId() {
        return specieId;
    }

    public void setSpecieId(int specieId) {
        this.specieId = specieId;
    }

    public String getSpecieName() {
        return specieName;
    }

    public void setSpecieName(String specieName) {
        this.specieName = specieName;
    }

    public String getSpecieSciName() {
        return specieSciName;
    }

    public void setSpecieSciName(String specieSciName) {
        this.specieSciName = specieSciName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
