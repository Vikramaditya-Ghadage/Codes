package SDE_SHEET_JAVA;
public class Navigation {

    private int x = 0, y = 0;
    private int dir = 1; // 0=U,1=R,2=D,3=L

    private void move(int heading, int steps) {
        if (heading == 0) y += steps;   // U
        else if (heading == 1) x += steps; // R
        else if (heading == 2) y -= steps; // D
        else if (heading == 3) x -= steps; // L
    }

    public void execute(String[] cmds) {
        for (String cmd : cmds) {
            if (cmd.startsWith("F")) {
                int steps = Integer.parseInt(cmd.substring(1));
                move(dir, steps);
            } else if (cmd.startsWith("U")) {
                int steps = Integer.parseInt(cmd.substring(1));
                move(0, steps); // U in world coords
            } else if (cmd.startsWith("D")) {
                int steps = Integer.parseInt(cmd.substring(1));
                move(2, steps); // D in world coords
            } else if (cmd.equals("TR")) {
                dir = (dir + 1) % 4; // clockwise
            } else if (cmd.equals("TL")) {
                dir = (dir + 3) % 4; // anticlockwise
            }
        }
    }

    public String getPosition() {
        return "(" + x + "," + y + ")";
    }

    public static void main(String[] args) {
        Navigation nav = new Navigation();
        String[] sequence = {"F7", "TR", "F3", "TR", "TL", "TL", "F4", "U2", "F1"};
        nav.execute(sequence);
        System.out.println("Final position: " + nav.getPosition()); // (12, -1)
    }
}
