public class Multidos{
	private int num;

	public Multidos (int num){
		this.num=num;
	}
	public void setNum(int num){
		num=num;
	}
	public int getNum(){
		return num;
	}

	public void Multiplo(){
		if (num%2==0){
			System.out.println("Es multiplo de 2. ");
		}else
			System.out.println("No es multiplo de 2.");
		}
	}
