/*   Create a class SwingDemo that extends JFrame class and it implements ActionListener
     Add some label and components in it and perform the Addition operation and subtraction operation in it.

Output Format :-

In JFrame, Create two textfield in which we can take input from the user and add a label in which we can display the result.
Similarly create two textfield for which we can take input from the user to perform subtraction operation and add a label in which we can display the result.
*/




import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class SwingDemo extends JFrame implements ActionListener {
    JLabel l1;
    JTextField t1;
    JLabel l2;
    JTextField t2;
    JButton b1;
    JLabel l3;
   JLabel l4;
   JTextField t4;
    JLabel l5;
    JTextField t5;
    JButton b2;
    JLabel l6;

    public SwingDemo() {
        setLayout(new FlowLayout());

        l1 = new JLabel("1st Number:");
        t1 = new JTextField(10);

        l2 = new JLabel("2nd Number:");
        t2 = new JTextField(10);

        b1 = new JButton("Add");

        l3 = new JLabel("Result:  ");

        l4 = new JLabel("1st Number:");
        t4 = new JTextField(10);

        l5 = new JLabel("2nd Number:");
        t5 = new JTextField(10);

        b2 = new JButton("Sub");

        l6 = new JLabel("Result:  ");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(l3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(b2);
        add(l6);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setVisible(true);
        setSize(250,400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());

        int value = n1+n2;
        l3.setText("Total: " +value);

        int n3 = Integer.parseInt(t4.getText());
        int n4 = Integer.parseInt(t5.getText());

       int val = n3-n4;
       l6.setText("Difference: " +val);
    }
}

public class SwingAdd {
    public static void main(String [] args) {
        SwingDemo ob = new SwingDemo();
    }
}
