package com.oop.task1;

public class TimeInterval {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int totalSeconds) {
        this.hours = totalSeconds / 3600;
        this.minutes = totalSeconds % 3600 / 60;
        this.seconds = totalSeconds % 3600 % 60;
    }

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
    public int totalSeconds() {
        return seconds + minutes * 60 + hours * 3600;
    }

    public TimeInterval sum(TimeInterval second){
        return new TimeInterval(this.totalSeconds() + second.totalSeconds());
    }

    public void print(){
        System.out.println("Часы: " + hours + ", Минуты: " + minutes + ", Секунды: " + seconds);
    }
}
