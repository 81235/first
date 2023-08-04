package Item;

public class Screen implements ScreenSpec {

    String resolution;
    int refresh_rate;
    int response_time;

    public Screen() {
    }

    public Screen(String resolution, int refresh_rate, int response_time) {
        this.resolution = resolution;
        this.refresh_rate = refresh_rate;
        this.response_time = response_time;
    }

    @Override
    public void getResolution() {
    }

    @Override
    public void getRefreshRate() {
    }

    @Override
    public void getResponseTime() {
    }

    @Override
    public String toString() {
        return "Resolution: " + resolution + "\n" +
                "Refresh Rate: " + refresh_rate + "\n" +
                "Response Time: " + response_time;
    }

//   / public String toString() {
      //  String output = "Resolution: " + resolution + "\n" +
        //        "Refresh Rate: " + refresh_rate + "\n" +
          //      "Response Time: " + response_time;
        //return output;

}
