package BackEnd;

public class Itinerary {
    
    private int itineraryId;
    private int code;
    private double duration;
    private double lenght;
    private int maxVisitor;
    private int numSpeciesVisited;
    
    public Itinerary(){}
    
    public Itinerary(int itineraryId, int code, double duration, double lenght,
    int maxVisitor, int numSpeciesVisited){
        this.itineraryId = itineraryId;
        this.code = code;
        this.duration = duration;
        this.lenght = lenght;
        this.maxVisitor = maxVisitor;
        this.numSpeciesVisited = numSpeciesVisited;
    }
    
    public Itinerary(Itinerary itinerary){
        this(
                itinerary.getItineraryId(),
                itinerary.getCode(),
                itinerary.getDuration(),
                itinerary.getLenght(),
                itinerary.getMaxVisitor(),
                itinerary.getNumSpeciesVisited()
          );
    }

    public int getItineraryId() {
        return itineraryId;
    }

    public void setItineraryId(int itineraryId) {
        this.itineraryId = itineraryId;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public int getMaxVisitor() {
        return maxVisitor;
    }

    public void setMaxVisitor(int maxVisitor) {
        this.maxVisitor = maxVisitor;
    }

    public int getNumSpeciesVisited() {
        return numSpeciesVisited;
    }

    public void setNumSpeciesVisited(int numSpeciesVisited) {
        this.numSpeciesVisited = numSpeciesVisited;
    }

}
