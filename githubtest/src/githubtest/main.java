package githubtest;

import javax.swing.*;

public class main
{

    public main ()
    {
        // TODO Auto-generated constructor stub
    }

    public static void main (String[] args)
    {
        window window = new window();
        

    }

}

class window extends JFrame
{
    private int num;
    public window()
    {
        this.setTitle("test");
        this.setSize(480, 480);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(content());
        this.setVisible(true);
    }
    
    private JPanel content()
    {
        JPanel content = new JPanel();
        
        JButton J = new JButton("come on");
        
        content.add(J);
        return content;
    }
    
    
    
}
