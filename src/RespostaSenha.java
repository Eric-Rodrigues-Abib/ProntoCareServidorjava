public class RespostaSenha extends Comunicado{

    private Boolean mensagem;

    public RespostaSenha(Boolean mensagem)
    {
        this.mensagem = mensagem;
    }
    public Boolean getMensagem() {
        return mensagem;
    }

    public String toString()
    {
        return(" "+this.mensagem);
    }
}
