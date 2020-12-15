import java.awt.*;
class AWTComponent extends Frame{
    AWTComponent(){
        Button b =new Button("Click me!"); //creating a button object
        b.setBounds(30,100,80,30); // setting button position
        add(b); //adding button into frame
        setSize(300,300); // frame size 300 x 300
        setLayout(null);
//        setTitle("AWTComponent");
//        setBackground(Color.black);
//        setForeground(Color.red);
        setVisible(true);//now frame will be visible, by default not visible
    }

    public static void main(String[] args) {
        AWTComponent c = new AWTComponent();
    }
}