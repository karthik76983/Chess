package expanion.project1;
import java.util.Scanner;


                         /*DRIVER CLASS*/
public class Main {
                         /*DRIVER METHOD*/
public static void main (String[] args) {
@SuppressWarnings("resource")
Scanner p=new Scanner(System.in);
FindHorseposition ob=new FindHorseposition();
byte start_row,start_col,end_row,end_col;
System.out.println("Enter the initial positions");
start_row=p.nextByte();
start_col=p.nextByte();
System.out.println("Enter the moving position");
end_row=p.nextByte();
end_col=p.nextByte();
System.out.print(ob.horseposition(start_row, start_col, end_row, end_col));
}

}
