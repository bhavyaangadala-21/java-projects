package Mypackage;

import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean[] visited = new boolean[str.length()];
		for(int i=0;i<str.length();i++)
		{
			if(visited[i])
				continue;
			int count = 1;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					visited[j] = true;
					count++;
				}
			}
			System.out.print(str.charAt(i)+ " count :" +count);
		}
		
	}

}
