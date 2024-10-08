import java.util.*;
public class Dijkstrasalgorithm
{
	static int V;
	Dijkstrasalgorithm(int v)
	{
		this.V = v;
	}
	int minDistance(int dist[], Boolean sptSet[])
	{
		int min = Integer.MAX_VALUE, min_index = -1;
		for (int v = 0; v < V; v++)
			if (sptSet[v] == false && dist[v] <= min)
			{
				min = dist[v];
				min_index = v;
			}
		return min_index;
	}

	void print(int dist[], int n)
	{
		System.out.println("Vertex   Distance from Source");
		for (int i = 0; i < V; i++)
			System.out.println(i+"        "+dist[i]);
	}

	void dijkstragraph(int graph[][], int src)
	{
		int dist[] = new int[V]; 
		Boolean sptSet[] = new Boolean[V];
		
		for (int i = 0; i < V; i++)
		{
			dist[i] = Integer.MAX_VALUE;
			sptSet[i] = false;
		}
		dist[src] = 0;

		for (int count = 0; count < V-1; count++)
		{
			int u = minDistance(dist, sptSet);
			sptSet[u] = true;
			for (int v = 0; v < V; v++)
				if (!sptSet[v] && graph[u][v]!=0 && dist[u] != Integer.MAX_VALUE && dist[u]+graph[u][v] < dist[v])
					dist[v] = dist[u] + graph[u][v];
		}
		print(dist, V);
	}	

	public static void main (String[] args)
	{
		System.out.println("V Praneethnadh_21BCE7762");
		int m, n, i, j;
		Scanner sc = null;
		try 
		{
			sc = new Scanner(System.in);
			System.out.print("Enter the number of nodes: ");
			m = sc.nextInt();
			
			n = m;
			Dijkstrasalgorithm d = new Dijkstrasalgorithm(m);
			int graph[][] = new int[m][n];
			System.out.println();
			for (i = 0; i < m; i++)
				for (j = 0; j < n; j++)
					graph[i][j] = sc.nextInt();
			d.dijkstragraph(graph, 0);
		}
		catch (Exception e) 
		{ 
			System.out.println("Check Your input once...!!!");
		}
		finally
		{
			sc.close();
		}
		
		/*
		int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
			{4, 0, 8, 0, 0, 0, 0, 11, 0},
			{0, 8, 0, 7, 0, 4, 0, 0, 2},
			{0, 0, 7, 0, 9, 14, 0, 0, 0},
			{0, 0, 0, 9, 0, 10, 0, 0, 0},
			{0, 0, 4, 14, 10, 0, 2, 0, 0},
			{0, 0, 0, 0, 0, 2, 0, 1, 6},
			{8, 11, 0, 0, 0, 0, 1, 0, 7},
			{0, 0, 2, 0, 0, 0, 6, 7, 0}
		};
		*/
	}
}