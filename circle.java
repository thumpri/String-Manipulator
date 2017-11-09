package level2;
import java.io.*;

public class circle
{
	
	static char start, end;
	static int start1, end1;
	static public int count=0, flag=0;


	public static int count_visited(int visited[] )
	{
		int i,j,temp_count=0;
		for(i=0;i<26;i++)
		{
          if(visited[i]==1)
          	temp_count++;
		}
        if(temp_count==count)
        	return 1;
        else
        	return 0;
	}

	public static void circleBacktrack(int index, int matrix[][],int visited[])
	{
		int i,j,k,val;
		visited[index]=1;
		for(j=0;j<26;j++)
		{
          if(matrix[index][j]==1)
          { 
          	//System.out.println(index+" "+j);
          	if(visited[j]==0)
          	  circleBacktrack(j,matrix,visited);
            else
          {
          	val=count_visited(visited);
          	if(val==1)
          	{
          		flag=1;
          		//System.out.println("circle formed");
          		return; 
          	}

          }

          }
		}

	}
     public static void find_start_end(String s, int matrix[][],int visited[])
     {
        int i,j;
     	int len=s.length();
     	start=s.charAt(0);
     	end=s.charAt(len-1);
     	start1=(int)start-97;
     	end1=(int)end-97;
     	for (i=0;i<26;i++)
     	{
     		if(i==start1)
     		{
     			visited[i]=0;
     		for(j=0;j<26;j++)
     		{
              if(j==end1)
              	{
              		//count++;
              		visited[j]=0;
              		matrix[i][j]=1;
              	}

     		}
     	    }
     	}
     	
     	//System.out.println(start1+" "+end1);
     }

}