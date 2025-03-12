
import javax.swing.*;

public class Main{
    public static void main(String[] args) throws Exception{
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        //frame.setVisible (true)
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Flappybird flappybird = new Flappybird();
        frame.add(flappybird);
        frame.pack();
        flappybird.requestFocus();
        frame.setVisible(true);
    }
}

