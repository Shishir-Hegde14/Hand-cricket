import java.util.*;
class hand_cric
{
    public static void main(String arg[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("you are Batting ");
       System.out.println("Play:");
       int bat=sc.nextInt(); 
       int boll=(int)(Math.random()*10);
       int score=0;
        while(bat!=boll)
       {
           if(bat<=10)
           {
               System.out.println("bat:"+bat+" boll "+boll);
               score= score+bat;
               bat=sc.nextInt();
               boll=(int)(Math.random()*10);
            }
            else if(bat>10)
            {
                System.out.println("Invalid input");
                bat=sc.nextInt();
            }
            else{
                break;
            }
        }
        if(bat==boll)
        {
            System.out.println("out!!!!"+ "your score was" + score);
        }
    }
}
                
                
                