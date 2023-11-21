import java.io.*;
import java.net.*;
import java.util.*;
public class SupervisoraDeConexao extends Thread{
    private Parceiro            usuario;
    private Socket              conexao;
    private ArrayList<Parceiro> usuarios;

    public SupervisoraDeConexao
            (Socket conexao, ArrayList<Parceiro> usuarios)
            throws Exception
    {
        if (conexao==null)
            throw new Exception ("Conexao ausente");

        if (usuarios==null)
            throw new Exception ("Usuarios ausentes");

        this.conexao  = conexao;
        this.usuarios = usuarios;
    }

    public void run ()
    {

        ObjectOutputStream transmissor;
        try
        {
            transmissor =
                    new ObjectOutputStream(
                            this.conexao.getOutputStream());
        }
        catch (Exception erro)
        {
            return;
        }

        ObjectInputStream receptor=null;
        try
        {
            receptor=
                    new ObjectInputStream(
                            this.conexao.getInputStream());
        }
        catch (Exception err0)
        {
            try
            {
                transmissor.close();
            }
            catch (Exception falha)
            {} // so tentando fechar antes de acabar a thread

            return;
        }

        //provavelmente fara aqui a parte de pegar o login do usuario

        try
        {
            this.usuario =
                    new Parceiro (this.conexao,
                            receptor,
                            transmissor);
        }
        catch (Exception erro)
        {} // sei que passei os parametros corretos
    }
}