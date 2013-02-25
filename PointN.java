public class PointN
{
	private int n;
	private float[] points;

	public PointN(int n)
	{
		this.n = n;
		this.points = new float[n];
	}
	
	public int getN()
	{
		return this.n;
	}

      public float[] getPoints()
	{
		return this.points;
	}
	
	public void setPoints(float[] points)
	{
		this.points = points;
	}

	public String toString()
	{
		String str = "";
		for (int i = 0; i < n; i++)
		{
			str += points[i];
			if (i != n - 1)
				str += ", ";
		}
		return str;
	}
}