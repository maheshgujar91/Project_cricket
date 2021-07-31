package com.creatosoft.playermanagement.service_impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.creatosoft.playermanagement.model.Player;
import com.creatosoft.playermanagement.service.World;

public class India implements World {
	
	Scanner sc=new Scanner(System.in);
	int count=0;
	
	Player []p=new Player[11];
	Player p1=new Player();
	

	@Override
	public void addPlayer() throws IOException 
	{
		System.out.println("--------Add Player----------");
		
		System.out.println("Enter player rank");
		int prank=sc.nextInt();
		p1.setPrank(prank);
		
		System.out.println("Enter player name");
		String pname=sc.next();
		p1.setPname(pname);
		
		System.out.println("Enter player score");
		int score=sc.nextInt();
		p1.setScore(score);
		
		System.out.println("Enter player Addresss");
		String paddss=sc.next();
		p1.setPaddss(paddss);
		
		System.out.println("Enter player team name");
		String pteam_name=sc.next();
		p1.setPteam_name(pteam_name);
		
		System.out.println("Enter team location");
		String pteam_location=sc.next();
		p1.setPteam_location(pteam_location);
		
		FileWriter fr=new FileWriter(pname);
		BufferedWriter bw=new BufferedWriter(fr);
		
		bw.write("--------Player information----------");
		bw.newLine();
		
		bw.write("player rank :" +prank);
		bw.newLine();
		
		bw.write("player name :" +pname);
		bw.newLine();
		
		bw.write("player score :" +score);
		bw.newLine();
		
		bw.write("player address :" +paddss);
		bw.newLine();
		
		bw.write("player team name :" +pteam_name);
		bw.newLine();
		
		bw.write("player team location :" +pteam_location);
		bw.newLine();
		
		p[count]=p1;
		count++;
		
		bw.flush();
		bw.close();
		
		System.out.println("player details created successfully");
		System.out.println();
		
		
	}

	@Override
	public void viewPlayer() throws IOException
	{
		
		if(count>0)
		{
			System.out.println("Enter player rank no");
			int num=sc.nextInt();
			
			for(int i=0;i<count;i++)
			{
				int plrno=p[i].getPrank();
				if(num==plrno)
				{
				System.out.println("-----------player details----------");
				System.out.println("playre rank :" +p[i].getPrank());
				System.out.println("player name :" +p[i].getPname());
				System.out.println("player name :" +p[i].getScore());
				System.out.println("player address :" +p[i].getPaddss());
				System.out.println("player team name :" +p[i].getPteam_name());
				System.out.println("player team location :" +p[i].getPteam_location());
				}
				
			else
				{
					System.out.println("Enter Valid player rank");
				}
			
			}	
		
		}
		
		}

	@Override
	public void viewScore() throws IOException
	{
		String pname=p1.getPname();
		BufferedWriter br=new BufferedWriter(new FileWriter(pname,true));
		br.newLine();
		br.write("********View Score*********");
		br.newLine();
//		br.write("new Score");
//		br.newLine();
		
		if (count>0)
		{
			System.out.println("Enter player rank");
		    int num=sc.nextInt();
		    for(int i=0;i<count;i++)
	     	{
			 int plrank=p[i].getPrank();
			  if(num==plrank)
			 {
				  System.out.println("Player name :"+p[i].getPname()+": : :Player score :"+p[i].getScore());
		          br.flush();
				  
			 }
			  else
			  {
			   System.err.println("Enter valid player rank");
			 
			   br.close();
	     	  }
	     	}
		}
		
	}

	@Override
	public void updateScore() throws IOException
	{
		String pname=p1.getPname();
		BufferedWriter br=new BufferedWriter(new FileWriter(pname,true));
		br.newLine();
		br.write("********View Score*********");
		br.newLine();
		br.write("new Score");
		br.newLine();
		
		if (count>0)
		{
			System.out.println("Enter player rank");
		    int num=sc.nextInt();
		    for(int i=0;i<count;i++)
	     	{
			 int plrno=p[i].getPrank();
			  if(num==plrno)
			 {
			  System.out.println("Enter new Score");
			  int score=sc.nextInt();
			  
			  br.write("Current score is: "+p[i].getScore());
			  br.newLine();
			  if(score<1)
			  {
				  System.out.println("please enter minimum 1 score");
				  System.out.println("Enter score");
				  score=sc.nextInt(); 
			  }
			  br.write("New score : "+score);
			  br.newLine();
			  
		        int newscore = p[i].getScore()+score;
		         p[i].setScore(newscore);
		         System.out.println("*-------------------------------------------------------*");
		          System.out.println("New score is "+newscore);
		          System.out.println("*-------------------------------------------------------*");
		          
		          br.write("New score is: "+newscore);
		          br.flush();
			 }
		    else
			  {
			   System.out.println("Enter valid rank no");
			   }
	     	}
	
	}
}
		
		
	

}
