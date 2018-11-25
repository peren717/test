package githubtest;

import javax.swing.JFrame;

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
    public window()
    {
        this.setTitle("test");
        this.setSize(480, 480);
        this.setVisible(true);
    }
}
