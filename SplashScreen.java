import javax.swing.*;
import java.awt.*;

/**
 * SplashScreen — displays app title and team roles for a few seconds.
 */
public class SplashScreen extends JWindow {
    private final int DURATION = 3000; // 3 seconds

    public SplashScreen() {
        JPanel content = (JPanel) getContentPane();
        content.setBackground(Color.WHITE);
        content.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

        // Size & center on screen
        int width = 400, height = 300;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(
            (screen.width - width) / 2,
            (screen.height - height) / 2,
            width, height
        );

        // Title at top
        JLabel title = new JLabel("Bookstore System Prototype", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        content.add(title, BorderLayout.NORTH);

        // Team roles in center
        JPanel roles = new JPanel(new GridLayout(0, 1, 5, 5));
        roles.setBackground(Color.WHITE);
        roles.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        roles.add(new JLabel("Isaiah    - Systems Analyst"));
        roles.add(new JLabel("Edwin     - DB Admin"));
        roles.add(new JLabel("Yash      - Programmer"));
        roles.add(new JLabel("Stephanie - Technical Writer"));
        roles.add(new JLabel("Michael   - Project Manager"));
        content.add(roles, BorderLayout.CENTER);
    }

    /**
     * Shows this splash window and, after DURATION ms, hides/disposes and runs <code>after</code>.
     */
    public void showSplash(Runnable after) {
        setVisible(true);
        // Swing Timer will fire on the EDT after DURATION milliseconds
        new Timer(DURATION, e -> {
            ((Timer)e.getSource()).stop();
            setVisible(false);
            dispose();
            after.run();
        }).start();
    }
}