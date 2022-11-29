/*   In this problem, we are creating a frame with the help of Java components.
    There are some components like panel,Label,button with the help of this we can create a frame in which we can display the data.
    When we execute the code a small window or frame will be open in a layout that we can set and we can also set the size of the frame 
    with setSize() method, we can add the panel and label method also, we can create a button as well with the Jbutton method.                            */




import java.awt.FlowLayout;  
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;  
import javax.swing.JPanel;  

public class JFrame_Ex {  
    public static void main(String s[]) {  
        JFrame frame = new JFrame("JFrame Example");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        JLabel label = new JLabel("JFrame By Example");  
        JButton button = new JButton();  
        button.setText("Button");  
        panel.add(label);  
        panel.add(button);  
        frame.add(panel);  
        frame.setSize(200, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}  
