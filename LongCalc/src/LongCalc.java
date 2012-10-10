import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LongCalc {
    JTextArea display = new JTextArea();
    JPanel buttonPanel = new JPanel(new GridLayout(5,3));
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonSum = new JButton("+");
    JButton buttonBack = new JButton("C");
    JButton buttonDivide = new JButton("/");
    JButton buttonSub = new JButton("-");
    JButton buttonMul = new JButton("*");
    JButton buttonStart = new JButton("=");
    int firstValue = 0;
    String operation = "+";
    JFrame frame = new JFrame();


    LongCalc() {
       frame.setBounds(300, 300, 300, 300);
		frame.setTitle("Long Calculator");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("calc.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		// create font and set parameters
       Font font = new Font("Verdana", Font.BOLD, 30);
		display.setFont(font);
		display.setForeground(Color.BLACK);
		disableKeys(display.getInputMap());

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		         if (!display.getText().equals("0"))
                {
                	display.setText(display.getText() + "0");
           	 }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		         if (!display.getText().equals("0"))
                {
                	display.setText(display.getText()+"1");
           	 }
           	 else
           	 {
           	   display.setText("1");
           	 }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		         if (!display.getText().equals("0"))
                {
                	display.setText(display.getText()+"2");
           	 }
           	 else
           	 {
           	   display.setText("2");
           	 }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		         if (!display.getText().equals("0"))
                {
                	display.setText(display.getText()+"3");
           	 }
           	 else
           	 {
           	   display.setText("3");
           	 }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		         if (!display.getText().equals("0"))
                {
                	display.setText(display.getText()+"4");
           	 }
           	 else
           	 {
           	   display.setText("4");
           	 }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		         if (!display.getText().equals("0"))
                {
                	display.setText(display.getText()+"5");
           	 }
           	 else
           	 {
           	   display.setText("5");
           	 }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		         if (!display.getText().equals("0"))
                {
                	display.setText(display.getText()+"6");
           	 }
           	 else
           	 {
           	   display.setText("6");
           	 }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		         if (!display.getText().equals("0"))
                {
                	display.setText(display.getText()+"7");
           	 }
           	 else
           	 {
           	   display.setText("7");
           	 }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		         if (!display.getText().equals("0"))
                {
                	display.setText(display.getText()+"8");
           	 }
           	 else
           	 {
           	   display.setText("8");
           	 }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
 		         if (!display.getText().equals("0"))
                {
                	display.setText(display.getText()+"9");
           	 }
           	 else
           	 {
           	   display.setText("9");
           	 }
            }
        });
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = display.getText();
                display.setText(temp.substring(0,temp.length()-1));
            }
        });
        buttonSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                display.setText("");
                operation = "+";
            }
        });
        buttonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                display.setText("");
                operation = "*";
            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                display.setText("");
                operation = "/";
            }
        });
        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                display.setText("");
                operation = "-";
            }
        });
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int secondValue = Integer.valueOf(display.getText());
                if("+".equals(operation)){
                    display.setText((firstValue+secondValue)+"");
                }
                if("-".equals(operation)){
                    display.setText((firstValue-secondValue)+"");
                }
                if("*".equals(operation)){
                    display.setText((firstValue*secondValue)+"");
                }
                if("/".equals(operation)){
                    display.setText((firstValue/secondValue)+"");
                }
                firstValue = 0;
                operation = "+";
            }
        });
        frame.setLayout(new BorderLayout());
        frame.add(display, BorderLayout.NORTH);
        frame.add(buttonPanel,BorderLayout.CENTER);
        frame.add(buttonStart,BorderLayout.SOUTH);

        buttonPanel.add(button0);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonSum);
        buttonPanel.add(buttonSub);
        buttonPanel.add(buttonMul);
        buttonPanel.add(buttonBack);
        buttonPanel.add(buttonDivide);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LongCalc();
    }

	private void exitPressed() {
		System.exit(0);
	}

    private void disableKeys(InputMap inputMap) {

        String[] keys = {"UP", "DOWN", "LEFT", "RIGHT"};
        for (String key : keys) {
            inputMap.put(KeyStroke.getKeyStroke(key), "none");
        }
    }
}

