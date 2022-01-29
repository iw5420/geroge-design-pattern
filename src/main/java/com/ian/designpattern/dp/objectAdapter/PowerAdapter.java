package com.ian.designpattern.dp.objectAdapter;

public class PowerAdapter implements Power12V {
	
	private Power220V power220V;
	
	public PowerAdapter(Power220V power) {
		power220V = power;
	};
	
	@Override
	public void getPower12V() {
		power220V.getPower220();
		transform();
		System.out.println("輸出12V的電");
	}

	private void transform() {
		System.out.println("把電壓從220V轉化為12V!");		
	}

}
