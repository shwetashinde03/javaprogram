package assignment2;

import java.util.*;
public class IndoorGames {
	
	String gamename;
	String playername;
	IndoorGames(String g,String p)
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
	IndoorGames i1=new IndoorGames("chess","\nramesh");
	IndoorGames i2=new IndoorGames("carrom","\nsuresh");
	IndoorGames i3=new IndoorGames("tabletennis","kalpesh");
	i1.display();
	i2.display();
	i3.display();
	
	
	}
	
	}


