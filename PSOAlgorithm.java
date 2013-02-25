import java.util.Random;

public class PSOAlgorithm
{
	private float omega;
	private float phiLocal;
	private float phiGlobal;
	private int n;
	private float[] min;	
	private float[] max;

	private PSOParticle[] particles;
	
	public PSOAlgorithm(int n, float[] min, float[] max,  float omega, float phiLocal, float phiGlobal)
	{
		this.n = n;
		this.omega = omega;
		this.phiLocal = phiLocal;
		this.phiGlobal = phiGlobal;
		this.min = min;
		this.max = max;
		
		this.initSwarm();
	}

	private void initSwarm()
	{
		particles = new PSOParticle[n];

		for (int i = 0; i < n; i++)
		{
			particles[i] = new PSOParticle();
		}
		
	}
}