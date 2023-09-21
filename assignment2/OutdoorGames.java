package assignment2;
import java.util.*;
public class OutdoorGames {
	String gamename;
	String playername;
	OutdoorGames(String g,String p)
	{
		gamename=g;
		playername=p;
		
	}
	public void display()
	{
		System.out.println("gamename is:"+gamename+""+"\nplayername:"+playername);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	OutdoorGames i1=new OutdoorGames("kabaddi","ramesh");
	OutdoorGames i2=new OutdoorGames("kho-kho","suresh");
	OutdoorGames i3=new OutdoorGames("football","kalpesh");
	i1.display();
	i2.display();
	i3.display();
	

	}

}
