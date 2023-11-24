public class Container {
    private int conta;

    //Constructos
    public Container(){
        this.conta = 0;
    }

    //Methods
    public int contains(){
        return this.conta;
    }

    public void add(int amount){
        this.conta = this.conta + Math.abs(amount);

        if (this.conta >= 100){
            this.conta = 100;
        }
    }

    public void remove(int amount){
        this.conta = this.conta - Math.abs(amount);

        if (this.conta < 0){
            this.conta = 0;
        }
    }

    @Override
    public String toString(){
        return this.conta + "/100";
    }
}
