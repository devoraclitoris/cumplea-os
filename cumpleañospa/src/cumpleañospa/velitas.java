package cumpleañospa;
public class velitas 
{
    public int velas = 0;
    public int velasApagadas = 0;
    public int[] alturaVelas = new int[100]; 
    public int max=alturaVelas[0];
    public void setVelas(int x)
    {
            this.velas=x;
    }
     public int getVelas() 
     {
            return this.velas;
     }
     public void AlturaV()  
     {
        
        for(int i=0;i<velas;i++)
        {
            alturaVelas[i]= (int) (Math.random()*velas+1);
        }      
    }
     public int getAlturaV()    
     {
            return this.alturaVelas[100];
    }
    public void ImpAlturaV()   
    {
        System.out.print("\nALTURA DE LAS VELAS: ");           
        for(int i=0;i<velas;i++)
        {
            System.out.print( + alturaVelas[i] + " ");
        }
    }
    public void ApagarVelas()   
    {
        
        for(int i=0;i<velas;i++)
        {
            if (max<alturaVelas[i])                
                max=alturaVelas[i];                                      
        }
        for (int i=0; i<velas;i++)
        {
            if (max==alturaVelas[i])
                    velasApagadas+=1;           
        }
        System.out.println("\nLA CANTIDAAD DE VELAS APAGADAS FUE: " + velasApagadas);
    }
}