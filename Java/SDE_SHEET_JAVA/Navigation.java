package SDE_SHEET_JAVA;
public class Navigation {

    private int x = 0, y = 0;
    private int dir = 1;

    private void move(int heading, int steps) {
        if (heading == 0) y += steps;   
        else if (heading == 1) x += steps; 
        else if (heading == 2) y -= steps; 
        else if (heading == 3) x -= steps; 
    }

    public void perform(String[] cmds) {
        for (String cmd : cmds) {
            if (cmd.startsWith("F")) {
                int steps = Integer.parseInt(cmd.substring(1));
                move(dir, steps);
            } else if (cmd.startsWith("U")) {
                int steps = Integer.parseInt(cmd.substring(1));
                move(0, steps);
            } else if (cmd.startsWith("D")) {
                int steps = Integer.parseInt(cmd.substring(1));
                move(2, steps);
            }
            else if (cmd.equals("TR")) {
                dir = (dir + 1) % 4; 
            } else if (cmd.equals("TL")) {
                dir = (dir +3) % 4; 
            }
        }
    }

    public String getPosition() {
        return "(" + x + "," + y + ")";
    }

    public static void main(String[] args) {
        Navigation nav = new Navigation();
        String[] input = {"F7", "TR", "F3", "TR", "TL", "TL", "F4", "U2", "F1","TR","F2"};
        nav.perform(input);
        System.out.println("Final position: " + nav.getPosition()); 
    }
}
