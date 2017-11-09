package game1;
import level1.*;
import level2.*;
import level3.*;
import level4.*;
import java.util.*;
import java.io.*;
import java.util.HashSet;

public class game
{
	public static void main(String[] args)throws IOException
  {
     
     int lives=3,ret,val;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   	 System.out.println("\033[0:1m"+ "~!Welcome to String Manipulator!~");
  	 System.out.println("This game consists of 4 levels related to strings, you have 3 lives to win the game");
     WordBreak obj1= new WordBreak();


		int flag=1;

     //String h=object.s;
		int p=1;
     while(lives>0 && flag==1)
     {
     	switch(p)
     	{
     		case 1 :
     	System.out.println("~!Welcome to Level 1 - Wordbreaker!~");
     	System.out.println("If the given string can be broken down into words enter 1 else enter 0");
     	System.out.println("String = " +obj1.s);

        HashSet<String> hs = new HashSet<String>();
		hs.add("i");
		hs.add("care");
		hs.add("car");
		hs.add("are");
		hs.add("for");
		hs.add("you");
		hs.add("cared");
		hs.add("caring");

     	HashSet<String> memoization = new HashSet<String>();
		ret=obj1.findUsingDP(obj1.s, hs, memoization, "");

		System.out.println("Enter your answer ");
        val=Integer.parseInt(br.readLine());
		if(val==ret)
			{
				System.out.println((char)27 + "[32mlevel 1 completed" +(char)27 +"[0m");
			}
         else
         	{
         		lives--;
         		System.out.println((char)27 + "[31mWrong answer! remaining lives "+lives + (char)27 + "[0m");
         		p=1;
         		break;
            }

         case 2 : System.out.println("\033[0:1m"+ "~!Welcome to Level 2 - WordCircle!~");
          System.out.println("If the given strings of words forms a circle, then enter 1 else enter 0");
          	String s1,s2,s3,s4,s5;
		int i,j,k,val2;
		circle obj2= new circle();
       	 int visited[]=new int[26];
       	 int matrix[][]=new int[26][26];
		for(i=0;i<26;i++)
		{
			for(j=0;j<26;j++)
			{
				matrix[i][j]=0;
			}
		}
		for(j=0;j<26;j++)
			{
				visited[j]=-1;
			}

		s1="abc";
         obj2.find_start_end(s1,matrix,visited);
		s2="azz";
		 obj2.find_start_end(s2,matrix,visited);
		s3="ijk";
		 obj2.find_start_end(s3,matrix,visited);
		s4="kaa";
		 obj2.find_start_end(s4,matrix,visited);
		s5="cdi";
		 obj2.find_start_end(s5,matrix,visited);
		 System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5);
		 for(i=0;i<26;i++)
		 {
		 	if(visited[i]==0)
		 		obj2.count++;
		 }
        
		obj2.circleBacktrack(0,matrix,visited);
		 val2=Integer.parseInt(br.readLine());
		if(obj2.flag==val2)
		{
			System.out.println("level 2 completed");
		}
		else
		{
			lives--;
				System.out.println("Wrong answer! remaining lives "+lives);
				p=2;
			break;
		}

		case 3 : 


		       System.out.println("~!Welcome to Level 3 - Anagram Finder!~");
		       System.out.println("Enter the anagrams of the following word - sweat");
		
			
			BufferedReader in = new BufferedReader(new FileReader("dic.txt"));
			
			//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("set"));
			

            MakeHash obj=new MakeHash();
			
			String value = in.readLine();
			while (value != null)
/* 1 */		{	
	            obj.set.add(value.toLowerCase());
				value = in.readLine();	
			}
			
			out.writeObject(obj.set); // Create the output file. 

   
            

			//System.out.println("Enter word for checking ");
			String input="ogd";
			
		    
			
            String p1="";int n,i1;
			//System.out.println("Searching anagrams ....");
	      
	        	n=input.length();
	        	obj.permute(input, 0, n-1);
	        	System.out.println("Enter your answer ");
	        	String answer=br.readLine();
			  for(i1=1;i1<obj.count;i1++)
			  {
				p1=obj.a[i1];
                
				boolean ass=obj.spellCheck(p1);

                if(ass==true)
                	{
                		//System.out.println("FOUnD "+p1);
                		System.out.println("ANSWER "+answer);
                		
                	}
			   }
           
			   if(p1.equals(answer))
			   {
			   	
            	System.out.println("Level 3 completed! ");
                 
			   }
			   else
			   	{

			   		lives--;
				System.out.println("Wrong answer! remaining lives "+lives);
				p=3;
				break;
			   	}
           
		case 4 :   System.out.println("~!Welcome to Level 4 - Word Ladder - Length of shortest chain to reach a target word!~");
		System.out.println("Given a dictionary, and two words start and target both of same length,  Find length of the smallest chain from start to target if it exists, such that adjacent words in the chain only differ by one character and each word in the chain is a valid word that is, it exists in the dictionary, It may be assumed that the target word exists in dictionary and length of all dictionary words is same");
		 int x,val3;
    wordLadder ws = new wordLadder();
    HashSet<String> hs2 = new HashSet<String>();
    hs2.add("hot");
    hs2.add("dot");
    hs2.add("dog");
    hs2.add("lot");
    hs2.add("log");
    hs2.add("cog");
    System.out.println(hs2);
    System.out.println("Start - hit, End - cog");
    x= ws.ladderLength("hit","cog", hs2);
    val3=Integer.parseInt(br.readLine());
    if(val3==x)
    {
      System.out.println("level 4 completed! Congratulations, you've won the game");
      flag=0;
    }
    else
		{
			lives--;
				System.out.println("Wrong answer! remaining lives "+lives);
				p=4;
			break;
		}
    

}
  }
}
}