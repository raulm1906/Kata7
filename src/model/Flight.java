package model;

public class Flight {

    private final int dayOfWeek;
    private final int departureTime;
    private final int departureDelay;
    private final int arrivalTime;
    private final int arrivalDelay;
    private final int cancelled;
    private final int diverted;
    private final int duration;
    private final int distance;

    public Flight(int dayOfWeek, int departureTime, int departureDelay, int arrivalTime, int arrivalDelay, int cancelled, int diverted, int duration, int distance) {
        this.dayOfWeek = dayOfWeek;
        this.departureTime = departureTime;
        this.departureDelay = departureDelay;
        this.arrivalTime = arrivalTime;
        this.arrivalDelay = arrivalDelay;
        this.cancelled = cancelled;
        this.diverted = diverted;
        this.duration = duration;
        this.distance = distance;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public int getDepartureDelay() {
        return departureDelay;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getArrivalDelay() {
        return arrivalDelay;
    }

    public int getCancelled() {
        return cancelled;
    }

    public int getDiverted() {
        return diverted;
    }

    public int getDuration() {
        return duration;
    }

    public int getDistance() {
        return distance;
    }
}