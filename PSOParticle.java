import java.util.Random;

public class PSOParticle extends Particle
{
	private PointN bestPosition;

	public PSOParticle(float[] min, float[] max, Random random)
	{
		super(min, max, random);
		this.bestPosition = new PointN(min.length);
		this.setBestPosition(this.getPosition().getPoints());
	}

	public void setBestPosition(float[] best)
	{
		for (int i = 0; i < best.length; i++)
			bestPosition.getPoints()[i] = best[i];
	}

	public String toString()
	{
		String str = super.toString();
		str += "\nBest position:\n";		
		str += bestPosition.toString();	
		return str;
	}

	public static void main (String[] args)
	{
		PSOParticle p = new PSOParticle(new float[]{0.0f, 0.0f, 0.0f}, new float[]{1.0f, 2.0f, 3.0f}, new Random());
		System.out.println(p);
	}
}
