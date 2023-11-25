public class RespostaSenha extends Comunicado{

    private String mensagem;

    public RespostaSenha(String mensagem)
    {
        this.mensagem = mensagem;
    }
    public String getMensagem() {
        return mensagem;
    }

    public String toString()
    {
        return(" "+this.mensagem);
    }
}
