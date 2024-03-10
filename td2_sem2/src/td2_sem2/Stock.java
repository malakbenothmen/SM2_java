package td2_sem2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

public class Stock {
		private HashSet<Article> articlesMg = new HashSet<Article>() ;
		private HashMap<String, Integer>stockMg = new HashMap<String,
		Integer>();
	
		public boolean addNouvArticle(Article a, int qt )
		{
		if(stockMg.containsKey(a.getNom()))
		return false;
		articlesMg.add(a) ;
		stockMg.put(a.getNom(), qt);
		return true;
		}
	
		public boolean verifArticle(String a )
		{
				return this.stockMg.containsKey(a);
	     			}

			
		public Article getArticle(String a )
		{ for(Article art : articlesMg)
		   { if(art.getNom().equals(a))
			  return art ; }
		   return null ;}
		
	
		public boolean removeArticle(String a )
		{
		if(!this.verifArticle(a))
		return false;
		Iterator<Article> it= this.articlesMg.iterator();
		while(it.hasNext())
		{if(it.next().getNom().equals(a))
		{
		it.remove();
		this.stockMg.remove(a);
		return true ;
		}
		}
		return false;
		}
		
		
		
		public int getQt(String a)
		{
		if(!stockMg.containsKey(a))
		return -1;
		else
		return stockMg.get(a);

		}
		
		
		public Boolean changeQt(String a, int i)
			{
			if(!stockMg.containsKey(a))
			return false;
			int qt =stockMg.get(a);
			qt = qt +i;
			if(qt<0)
			return false;
			else
			stockMg.put(a, qt);
			return true ; }
		
		
		public void sortStock()
		{
			TreeMap<String,Integer> triStock = new TreeMap<String,Integer> (this.stockMg);
			for(String a : triStock.keySet() )
			{
				System.out.println("Nom Article : " +a+ "  , qte :"+ triStock.get(a));
			}

		}
		
}
