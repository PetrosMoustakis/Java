package gr.aueb.cf.ch15.seminarsinh;

import java.time.Duration;

public class SchedulingPeriod extends TimePeriod {

    private Long minutesDuration;
    private String formattedDuration;

    public SchedulingPeriod() {
        Duration duration = Duration.between(getStart().toInstant(),getEnd().toInstant());
        minutesDuration = duration.toMinutes();
        long hours = duration.toHours();
        long minutes = duration.minusHours(hours).toMinutes();
        if (hours > 0) {
            this.formattedDuration = hours + " " + ((hours == 1) ? "hour " : "hours");
        }
        if (minutes > 0) {
            this.formattedDuration += minutes + " " + ((minutes == 1) ? "minute " : "minutes");
        }
    }

    public Long getMinutesDuration() {
        return minutesDuration;
    }

    public void setMinutesDuration(Long minutesDuration) {
        this.minutesDuration = minutesDuration;
    }

    public String getFormattedDuration() {
        return formattedDuration;
    }

    public void setFormattedDuration(String formattedDuration) {
        this.formattedDuration = formattedDuration;
    }
}
