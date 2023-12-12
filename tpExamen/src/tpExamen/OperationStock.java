package tpExamen;

abstract public class OperationStock implements MouvementStock{
	
    private static int count;
    protected int idOp;
    protected Article art;
    
    
    public OperationStock(Article art) {
        count ++;
    	this.idOp = count;
        this.art = art;
    }

    public String toString() {
        return this.getClass().getSimpleName()+" : idOp=" + idOp +", art=" + art ;
    }
    
    
    

}
