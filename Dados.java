public class Dado{
	private int valor;

	public Dado(){
	}

	public tiraDado(){
		this.valor=(int)(Math.random()*6+1);
		return this.valor;
	}
	public getValor(){
		return this.valor;
	}
	public statis void main(Strings args[]){
		System.out.prinln("Holi");
	}

}