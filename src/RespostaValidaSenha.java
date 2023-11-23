public class RespostaValidaSenha extends Comunicado{

    private String mensagem;

    public RespostaValidaSenha(String mensagem)
    {
        this.mensagem = mensagem;
    }
    public String getMensagem() {
        return mensagem;
    }

    public String toString()
    {
        return(""+this.mensagem);
    }
}
