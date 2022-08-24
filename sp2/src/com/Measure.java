package com;

public class Measure extends DataSet
	{
		

		public Measure(double time, double distance) {
			super(time, distance);
		}

		void run()
		{
			 double c=distance/time;
			System.out.println("Time="+time+"Hr"+" , "+"Distance="+distance+"Km");
			System.out.println("Speed =" +c+"Km/Hr");
			System.out.println(" ");
		}
	}


