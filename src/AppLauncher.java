import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // display our weather app gui
            new WeatherAppGui().setVisible(true);
            //System.out.println(WeatherApp.getLocationData("Tokyo"));
            //System.out.println(WeatherApp.getCurrentTime());
        });
    }
}
