public class TratadoraDeLogin extends Comunicado {
    private String senha;

    public TratadoraDeLogin (String senha)
    {
        this.senha = senha;
    }

    public String getSenha()
    {
        return this.senha;
    }

    public String toString()
    {
        return (" "+this.senha);
    }

}
