package chapterEight;

public enum TrafficLight {
    RED("50 seconds"),
    YELLOW("5 seconds"),
    GREEN("60 seconds");
    private final String duration;

    TrafficLight(String duration){
        this.duration = duration;
    }


    public String getDuration() {
        return duration;
    }
}
