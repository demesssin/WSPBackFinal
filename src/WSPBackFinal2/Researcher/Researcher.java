package WSPBackFinal.Researcher;

import WSPBackFinal.User.User;

public class Researcher{
    Integer indexH;
    boolean superVisor = false;
    public Researcher(Integer indexH){
        this.indexH = indexH;
    }
    {
        if(indexH >= 3){
            superVisor = true;
        }
    }
}
