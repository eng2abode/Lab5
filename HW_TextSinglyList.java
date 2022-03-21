import java.util.Scanner;

public class HW_TextSinglyList {
    public static void main(String[] args) {
        SinlyLinkedList<String>list=new SinlyLinkedList<>();
        Scanner in=new Scanner(System.in);
        int choice=-1;
        System.out.println("1 add First\t 2 add last\t 3 remove First");
        while (choice!=0){
            System.out.println("input your choice");
            choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.print("input name");
                    list.addfirst(in.next());
                    break;
                case 2:
                    System.out.print("input name");
                    list.addlast(in.next());
                    break;
                case 3:
                    System.out.println("delete "+list.removeFirst());
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
            System.out.println("  first:" +list.first()+
                    "   last:" +list.last()+
                    "   size:"+list.size());
        }

    }
}
