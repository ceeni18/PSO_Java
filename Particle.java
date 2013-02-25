import java.util.Random;

public class Particle
{
	private PointN position;
	private PointN velocity;

	public Particle(float[] min, float[] max, Random random)
	{
		int n = min.length;
		position = new PointN(n);
		velocity = new PointN(n);

		for (int i = 0; i < n; i++)
		{
			position.getPoints()[i] = min[i] + (max[i] - min[i]) * random.nextFloat();
		}
	}

	public PointN getPosition()
	{
		return this.position;
	}

	public PointN getVelocity()
	{
		return this.velocity;
	}

	public String toString()
	{
		String str = "";
		str += "Position:\n";
		str += position.toString();
		str += "\nVelocity:\n";	
		str += velocity.toString();
		
		return str;
	}

	public static void main (String[] args)
	{
		Particle p = new Particle(new float[]{0.0f, 0.0f, 0.0f}, new float[]{1.0f, 2.0f, 3.0f}, new Random());
		System.out.println(p);
	}
}

