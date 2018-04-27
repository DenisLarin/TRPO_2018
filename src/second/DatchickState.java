package second;

import org.json.simple.JSONArray;

public class DatchickState {
    private String station;
    private String moorning_site_desc;
    private double water_depth;
    private String time;
    private double current_speed;
    private long current_speed_qc;
    private double current_direction;
    private long current_direction_qc;
    private double current_u;
    private long current_u_qc;
    private double current_v;
    private long current_v_qc;
    private double temperature;
    private long temperature_qc;
    private double conductivity;
    private long conductivity_qc;
    private double salinity;
    private long salinity_qc;
    private double sigma_t;
    private long sigma_t_qc;
    private String time_created;
    private String time_modified;
    private double longitude;
    private double latitude;
    private double depth;

    public DatchickState(String station, String moorning_site_desc, double water_depth, String time, double current_speed, long current_speed_qc, double current_direction, long current_direction_qc, double current_u, long current_u_qc, double current_v, long current_v_qc, double temperature, long temperature_qc, double conductivity, long conductivity_qc, double salinity, long salinity_qc, double sigma_t, long sigma_t_qc, String time_created, String time_modified, double longitude, double latitude, double depth) {
        this.station = station;
        this.moorning_site_desc = moorning_site_desc;
        this.water_depth = water_depth;
        this.time = time;
        this.current_speed = current_speed;
        this.current_speed_qc = current_speed_qc;
        this.current_direction = current_direction;
        this.current_direction_qc = current_direction_qc;
        this.current_u = current_u;
        this.current_u_qc = current_u_qc;
        this.current_v = current_v;
        this.current_v_qc = current_v_qc;
        this.temperature = temperature;
        this.temperature_qc = temperature_qc;
        this.conductivity = conductivity;
        this.conductivity_qc = conductivity_qc;
        this.salinity = salinity;
        this.salinity_qc = salinity_qc;
        this.sigma_t = sigma_t;
        this.sigma_t_qc = sigma_t_qc;
        this.time_created = time_created;
        this.time_modified = time_modified;
        this.longitude = longitude;
        this.latitude = latitude;
        this.depth = depth;
    }

    public DatchickState(JSONArray temp) {
        this.station = (String) temp.get(0);
        this.moorning_site_desc = (String) temp.get(1);
        this.water_depth = (double) temp.get(2);
        this.time = (String) temp.get(3);
        this.current_speed = (double) temp.get(4);
        this.current_speed_qc = (long) temp.get(5);
        this.current_direction = (double) temp.get(6);
        this.current_direction_qc = (long) temp.get(7);
        this.current_u = (double) temp.get(8);
        this.current_u_qc = (long) temp.get(9);
        this.current_v = (double) temp.get(10);
        this.current_v_qc = (long) temp.get(11);
        this.temperature = (double) temp.get(12);
        this.temperature_qc = (long) temp.get(13);
        this.conductivity = (double) temp.get(14);
        this.conductivity_qc = (long) temp.get(15);
        this.salinity = (double) temp.get(16);
        this.salinity_qc = (long) temp.get(17);
        this.sigma_t = (double) temp.get(18);
        this.sigma_t_qc = (long) temp.get(19);
        this.time_created = (String) temp.get(20);
        this.time_modified = (String) temp.get(21);
        this.longitude = (double) temp.get(22);
        this.latitude = (double) temp.get(23);
        this.depth = (double) temp.get(24);
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getMoorning_site_desc() {
        return moorning_site_desc;
    }

    public void setMoorning_site_desc(String moorning_site_desc) {
        this.moorning_site_desc = moorning_site_desc;
    }

    public double getWater_depth() {
        return water_depth;
    }

    public void setWater_depth(double water_depth) {
        this.water_depth = water_depth;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getCurrent_speed() {
        return current_speed;
    }

    public void setCurrent_speed(double current_speed) {
        this.current_speed = current_speed;
    }

    public long getCurrent_speed_qc() {
        return current_speed_qc;
    }

    public void setCurrent_speed_qc(long current_speed_qc) {
        this.current_speed_qc = current_speed_qc;
    }

    public double getCurrent_direction() {
        return current_direction;
    }

    public void setCurrent_direction(double current_direction) {
        this.current_direction = current_direction;
    }

    public long getCurrent_direction_qc() {
        return current_direction_qc;
    }

    public void setCurrent_direction_qc(long current_direction_qc) {
        this.current_direction_qc = current_direction_qc;
    }

    public double getCurrent_u() {
        return current_u;
    }

    public void setCurrent_u(double current_u) {
        this.current_u = current_u;
    }

    public long getCurrent_u_qc() {
        return current_u_qc;
    }

    public void setCurrent_u_qc(long current_u_qc) {
        this.current_u_qc = current_u_qc;
    }

    public double getCurrent_v() {
        return current_v;
    }

    public void setCurrent_v(double current_v) {
        this.current_v = current_v;
    }

    public long getCurrent_v_qc() {
        return current_v_qc;
    }

    public void setCurrent_v_qc(long current_v_qc) {
        this.current_v_qc = current_v_qc;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public long getTemperature_qc() {
        return temperature_qc;
    }

    public void setTemperature_qc(long temperature_qc) {
        this.temperature_qc = temperature_qc;
    }

    public double getConductivity() {
        return conductivity;
    }

    public void setConductivity(double conductivity) {
        this.conductivity = conductivity;
    }

    public long getConductivity_qc() {
        return conductivity_qc;
    }

    public void setConductivity_qc(long conductivity_qc) {
        this.conductivity_qc = conductivity_qc;
    }

    public double getSalinity() {
        return salinity;
    }

    public void setSalinity(double salinity) {
        this.salinity = salinity;
    }

    public long getSalinity_qc() {
        return salinity_qc;
    }

    public void setSalinity_qc(long salinity_qc) {
        this.salinity_qc = salinity_qc;
    }

    public double getSigma_t() {
        return sigma_t;
    }

    public void setSigma_t(double sigma_t) {
        this.sigma_t = sigma_t;
    }

    public long getSigma_t_qc() {
        return sigma_t_qc;
    }

    public void setSigma_t_qc(long sigma_t_qc) {
        this.sigma_t_qc = sigma_t_qc;
    }

    public String getTime_created() {
        return time_created;
    }

    public void setTime_created(String time_created) {
        this.time_created = time_created;
    }

    public String getTime_modified() {
        return time_modified;
    }

    public void setTime_modified(String time_modified) {
        this.time_modified = time_modified;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "DatchickState{" +
                "station='" + station + '\'' +
                ", moorning_site_desc='" + moorning_site_desc + '\'' +
                ", water_depth=" + water_depth +
                ", time='" + time + '\'' +
                ", current_speed=" + current_speed +
                ", current_speed_qc=" + current_speed_qc +
                ", current_direction=" + current_direction +
                ", current_direction_qc=" + current_direction_qc +
                ", current_u=" + current_u +
                ", current_u_qc=" + current_u_qc +
                ", current_v=" + current_v +
                ", current_v_qc=" + current_v_qc +
                ", temperature=" + temperature +
                ", temperature_qc=" + temperature_qc +
                ", conductivity=" + conductivity +
                ", conductivity_qc=" + conductivity_qc +
                ", salinity=" + salinity +
                ", salinity_qc=" + salinity_qc +
                ", sigma_t=" + sigma_t +
                ", sigma_t_qc=" + sigma_t_qc +
                ", time_created='" + time_created + '\'' +
                ", time_modified='" + time_modified + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", depth=" + depth +
                '}';
    }
}
