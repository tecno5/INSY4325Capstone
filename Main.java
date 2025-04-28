import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Show splash, then launch main app once splash finishes
        SwingUtilities.invokeLater(() -> {
            SplashScreen splash = new SplashScreen();
            splash.showSplash(() -> {
                MainApp app = new MainApp();
                app.setVisible(true);
            });
        });
    }
}
