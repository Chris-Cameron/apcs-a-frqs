
/**
 * Tests the Ticket abstract class and the classes that extend it 
 *
 * @Christopher Cameron
 * @v1
 */
public class TicketTester
{
    /** Runs the toString for each possible ticket scenario */
    public static void main(String[] args)
    {
        Walkup w = new Walkup();
        Advance a1 = new Advance(7);
        Advance a2 = new Advance (44);
        StudentAdvance s1 = new StudentAdvance (8);
        StudentAdvance s2 = new StudentAdvance (70);
        
        System.out.println(w.toString() + "\n");
        System.out.println(a1.toString() + "\n");
        System.out.println(a2.toString() + "\n");
        System.out.println(s1.toString() + "\n");
        System.out.println(s2.toString() + "\n");
    }
}
