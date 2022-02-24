import java.awt.*;
import java.awt.event.*;

class EventHandling extends Frame implements ActionListener {

  TextField textField;
    Button button1,button2;;

  EventHandling()
  { 
    textField = new TextField();
    textField.setBounds(60, 50, 180, 25);
    button1 = new Button("Click");
    button1.setBounds(60, 120, 80, 30);
    button1.addActionListener(this);
        button2 = new Button("Clear");
    button2.setBounds(150, 120, 80, 30);
    button2.addActionListener(this);
    add(textField);
    add(button1);
        add(button2);
        setSize(300,300);  
        setLayout(null);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
        if (e.getSource() == button1){    
            textField.setText("Welcome to SSET");   
        }  
        else if (e.getSource() == button2){    
            textField.setText(" ");    
        }    
    
  }
    
  
  public static void main(String[] args)
  {
       
  new EventHandling();
  }
}