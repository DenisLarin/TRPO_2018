package second;

public class JsonOut {
    String name;
    String start_date;
    String end_date;
    String num_records;
    String min_current_speed;
    String min_time;
    String max_current_speed;
    String max_time;
    String avg_current_speed;

    public JsonOut(String name, String start_date, String end_date, String num_records, String min_current_speed, String min_time, String max_current_speed, String max_time, String avg_current_speed) {
        this.name = name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.num_records = num_records;
        this.min_current_speed = min_current_speed;
        this.min_time = min_time;
        this.max_current_speed = max_current_speed;
        this.max_time = max_time;
        this.avg_current_speed = avg_current_speed;
    }

    @Override
    public String toString() {
        return  name+
                "{start_date='" + start_date + '\'' +
                ", end_date='" + end_date + '\'' +
                ", num_records='" + num_records + '\'' +
                ", min_current_speed='" + min_current_speed + '\'' +
                ", min_time='" + min_time + '\'' +
                ", max_current_speed='" + max_current_speed + '\'' +
                ", max_time='" + max_time + '\'' +
                ", avg_current_speed='" + avg_current_speed + '\'' +
                '}';
    }
}
