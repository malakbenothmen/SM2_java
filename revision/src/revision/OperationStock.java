package revision;

abstract public class OperationStock implements MouvementStock {
	
	private static int count;
	protected int idOp;
	protected Article art;
	
	
	OperationStock(Article A)
	{count ++;
	this.idOp=count;
	this.art=A;}
	
	
	public String toString()
	{return "OP de Stock :  idOP="+this.idOp+" Article="+this.art;}
	
	
	

}
