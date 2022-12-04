import java.util.List;

public class Principal {
    public static void main(String[] args) {
        EnvioMensagem envioMensagem = new Sms();
        envioMensagem.enviarMensagem("Whalyson", "Ola");

        envioMensagem = new Email();
        envioMensagem.enviarMensagem("whalyson@gmail.com", "Ola");

        envioMensagem = new Whatsapp();
        envioMensagem.enviarMensagem("556399919191", "Ola");
    }
}
