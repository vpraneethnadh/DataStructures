import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class DFS
{	
	static int ROW = 3;
	static int COL = 3;
	static int dRow[] = { 0, 1, 0, -1 };
	static int dCol[] = { -1, 0, 1, 0 };

	static class pair
	{
		public int first;
		public int second;
		
		public pair(int first, int second)
		{
			this.first = first;
			this.second = second;
		}
	}

	public DFS(int ROW, int COL) 
	{
		this.ROW = ROW;
		this.COL = COL;
	}

	static Boolean isValid(boolean[][] vis, int row, int col)
	{
		if (row < 0 || col < 0 || row >= ROW || col >= COL)
			return false;

		if (vis[row][col])
			return false;

		return true;
	}
	
	void dfs(int grid[][], boolean vis[][], int row, int col)
	{
		Stack<pair> st = new Stack<pair>();
		st.push(new pair(row, col));
		System.out.print("DFS: ");
		while (!st.empty())
		{
			pair curr = st.pop();

			row = curr.first;
			col = curr.second;

			if (!isValid(vis, row, col))
				continue;
			vis[row][col] = true;
			System.out.print(grid[row][col] + " ");
			
			for(int i = 0; i < 4; i++)
			{
				int adjx = row + dRow[i];
				int adjy = col + dCol[i];
				st.push(new pair(adjx, adjy));
			}
		}
		
	}
}

class BFS
{
	static int ROW = 3;
	static int COL = 3;
	static int dRow[] = { 0, 1, 0, -1 };
	static int dCol[] = { -1, 0, 1, 0 };
	
	BFS(int ROW,int COL)
	{
		this.ROW = ROW;
		
		this.COL = COL;
	}
	
	static class pair
	{
		int first, second;

		public pair(int first, int second)
		{
			this.first = first;
			this.second = second;
		}
	}
	
	static boolean isValid(boolean vis[][], int row, int col)
	{
		
		if (row < 0 || col < 0 || row >= ROW || col >= COL)
			return false;

		if (vis[row][col])
			return false;
		return true;
	}
	void bfs(int grid[][], boolean vis[][], int row, int col)
	{
		Queue<pair > q = new LinkedList<>();
		q.add(new pair(row, col));
		vis[row][col] = true;
		System.out.print("BFS: ");
		
		
		
		
		while (!q.isEmpty())
		{
			pair cell = q.peek();
			int x = cell.first;
			int y = cell.second;

			System.out.print(grid[x][y] + " ");

			q.remove();
			for(int i = 0; i < 4; i++)
			{
				int adjx = x + dRow[i];
				int adjy = y + dCol[i];

				if (isValid(vis, adjx, adjy))
				{
					q.add(new pair(adjx, adjy));
					vis[adjx][adjy] = true;
				}
			}
		}
	}
}

public class BFS_DFS
{
	public static void main(String[] args)
	{
		System.out.println("V Praneethnadh_21BCE7762");
		int ROW = 3;
		int COL = 3;
		int m;
		int n;
		DFS d1 = new DFS(ROW, COL);
		BFS b1 = new BFS(ROW, COL);
		
		int i, j;
		
		Scanner sc = null;
		boolean [][]vis = new boolean[ROW][COL];
		boolean [][]vis1 = new boolean[ROW][COL];
		try 
		{
			sc = new Scanner(System.in);
			System.out.print("Enter the number of nodes: ");
			m = sc.nextInt();
			
			n = m;
			int grid[][] = new int[m][n];
			for (i = 0; i < m; i++)
				for (j = 0; j < n; j++)
					grid[i][j] = sc.nextInt();
		
			d1.dfs(grid, vis, 0, 0);
			System.out.println();
			b1.bfs(grid,vis1,0,0);
		}
		catch (Exception e) 
		{ 
			System.out.println("Check Your input once...!!!");
		}
		finally
		{
			sc.close();
		}
	}
}