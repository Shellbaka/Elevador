package Vrau;


public class Elevador {

  //parametros
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int quantPessoas;
	
  //construtor
	public Elevador(int capacidade, int totalAndares)
	{
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
		this.andarAtual = 0;
		this.quantPessoas = 0;
	}
	// método (função, ação)
	public void Entrar()
	{
		if(quantPessoas < capacidade)
		{
			quantPessoas++;
			System.out.println("Entrou mais uma pessoa. Quantidade de pessoas: " + quantPessoas + ". Capacidade do elevador: " + capacidade);
		}
		else {
			System.out.println("Não pode entrar mais ninguém nesse elevador. Atingiu a capacidade máxima\n");
		}
		
	}
	// método (função, ação)
	public void Sair()
	{
		if(quantPessoas == 0)
		{
			System.out.println("O elevador já está vazio. Todos já saíram.\n");
		}
		else {
			quantPessoas--;
			System.out.println("Saiu mais uma pessoa. Quantidade de pessoas: " + quantPessoas);
		}
	}
	// método (função, ação)
	public void Subir()
	{
		if(andarAtual < totalAndares)
		{
			andarAtual++;
			System.out.println("Subiu mais um andar. Andar atual: " + andarAtual + ". Total de andares: " + totalAndares);
		}
		else
		{
			System.out.println("O elevador já se encontra no último andar.");
		}
	}
	// método (função, ação)
	public void Descer()
	{
		if(andarAtual == 0)
		{
			System.out.println("O elevador já se encontra no térreo.");
		}
		else
		{
			andarAtual--;
			System.out.println("Desceu mais um andar. Andar atual: " + andarAtual);
		}
	}
	//encapsulamento
	public int getAndarAtual()
	{
		return this.andarAtual;
	}
	
	public void setAndarAtual(int andarAtual)
	{
		if(andarAtual <= totalAndares && andarAtual >= 0)
		{
			this.andarAtual = andarAtual;
		}
		else
		{
			System.out.println("Este elevador vai do térreo até o andar " + totalAndares + "O valor deve estar nessa faixa");
		}
		
	}
	 //capsulamento
	public int getTotalAndares()
	{
		return this.totalAndares;
	}
	
	public void setTotalAndares(int totalAndares)
	{
		this.totalAndares = totalAndares;
	}
	 //capsulamento
	public int getCapacidade()
	{
		return this.capacidade;
	}
	
	public void setCapacidade(int capacidade)
	{
		this.capacidade = capacidade;
	}
	 //capsulamento
	public int getQuantPessoas()
	{
		return this.quantPessoas;
	}
	 //capsulamento
	public void setQuantPessoas(int quantPessoas)
	{
		if(quantPessoas <= capacidade)
		{
			this.quantPessoas = quantPessoas;
		}
		else
		{
			System.out.println("Não é possível adicionar " + quantPessoas + " pessoas num elevador de capacidade máxima de " + capacidade + " pessoas.");
		}
		
	}
	
	
}