package Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GausianWhiteNoise {
	private double mean;
	private double var;
	
	public GausianWhiteNoise(double mean, double var){
		this.mean=mean;
		this.var=var;
	}

	public List<Double> getSamples(int size){
		List<Double> list = new ArrayList<>();
		Random rnd = new Random();
		for(int i=0; i<size; i++)
		 list.add(rnd.nextGaussian() * Math.sqrt(this.var) + this.mean);
		return list;
	}
	
	public static void main(String[] args) {
		
		GausianWhiteNoise signal = new GausianWhiteNoise(0,1);
		System.out.println(signal.getSamples(100).toString());
	}

}
