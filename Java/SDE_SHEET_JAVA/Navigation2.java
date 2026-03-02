package SDE_SHEET_JAVA;

public class Navigation2 
{
        private int x;
    private int y;
    private int dir=1;

    public void move(int heading ,int steps)
    {
        if(heading==0) y+=steps;
        else if(heading==1) x+=steps;
        else if(heading==2) y-=steps;
        else if(heading==3) x-=steps; 
    }
    public void exe(String[] cmds)
    {
        for(String cmd:cmds)
        {
            if(cmd.startsWith("F"))
            {
                int st=Integer.parseInt(cmd.substring(1));
                move(dir,st);
            }
            else if(cmd.startsWith("U"))
            {
                int st=Integer.parseInt(cmd.substring(1));
                move(0,st);
            }
            else if(cmd.startsWith("D"))
            {
                int st=Integer.parseInt(cmd.substring(1));
                move(2,st);
            }
            else if(cmd.startsWith("TR"))
            {
                dir=(dir+1)%4;
            }
            else if(cmd.startsWith("TL"))
            {
                dir=(dir+3)%4;
            }
            


        }
        

    }
    public void getPosition()
    {
        System.out.
        println(x+" "+y);
    }

        public static void main(String[] args) {
        Navigation nav = new Navigation();
        String[] input = {"F7", "TR", "F3", "TR", "TL", "TL", "F4", "U2", "F1","TR","F2"};
        nav.perform(input);
        System.out.println("Final position: " + nav.getPosition()); 
    
}

}
