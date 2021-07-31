package com.creatosoft.playermanagement.client;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.creatosoft.playermanagement.service.World;
import com.creatosoft.playermanagement.service_impl.India;


public class Test 
{

public static void main(String[] args) throws IOException 
	{
		File f=new File("D:\\ide\\Player Record System project","Player Data");
		f.mkdir();
		
		Scanner sc=new Scanner(System.in);
		World wrl=new India();
		
		while(true)
		{
			System.out.println("enter 1 for addPlayer");
			System.out.println("enter 2 for viewPlayer");
			System.out.println("enter 3 for viewScore");
			System.out.println("enter 4 for updateScore");
			System.out.println("enter 5 for exit");
			
			int i=sc.nextInt();
			
			switch(i)
			{
			case 1:
				wrl.addPlayer();
				break;
				
			case 2:
				wrl.viewPlayer();
				break;
			
			case 3:
				wrl.viewScore();
				break;
				
			case 4:
				wrl.updateScore();
				break;
				
			case 5:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid");	
			}
			
			System.out.println("");
			
		}
		
		
		
	}

}
