public class RespostaInvalidaSenha extends Comunicado{

    private String mensagem;

    public RespostaInvalidaSenha(String mensagem)
    {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String toString()
    {
        return (" "+this.mensagem);
    }
}
