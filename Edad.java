public class Edad{
	private int num;

	public Edad (int num){
		this.num=num;
	}
	public void setNum(int num){
		num=num;
	}
	public int getNum(){
		return num;
	}

	public void Mayoredad(){
		if (num>=18){
			System.out.println("Es mayor de edad. ");
		}else
			System.out.println("Es menor de edad. ");
		}	
	}
