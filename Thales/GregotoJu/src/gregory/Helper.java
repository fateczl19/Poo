package gregory;

public class Helper {
	public int GregoriantoJulian(int day, int month, int year){
		int data;
		int resp = 0;
		float a, b, c, d, e, dataJu;
		int base = 15 + 10 + 1582;
		data = day + month + year;
		if(month<3){
			year-=1;
			month+=12;
		}
		if(data >= base){
			a = year / 100;
			b = a / 4;
			c = 2 - a + b;
			d = (float) (365.25 *(year + 4716));
			e = (float) (30.6001 * month +1);
			dataJu = (float) ((d + e + day + 0.5 + c - 1524.5)+30);
			resp = (int) dataJu;
		}
		return resp;
	}
	
}
