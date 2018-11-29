package main;

public class encriptacion {

    //Método para encriptar y ejecutar desde la clase main(Encriptación)
    public String encriptacion(String password) {
        String msgEncriptado = "";
        password = psswToAscii(password);
        for (int i = 0; i < password.length(); i++) {
            msgEncriptado = msgEncriptado + abcd_araujo(password.charAt(i));
        }
        return msgEncriptado;
    }

    public String encriptacionLoca(String password) {
        String psswEncriptadoFinal = "";
        password = encriptacion(password);

        for (int i = 0; i < password.length(); i++) {
            psswEncriptadoFinal = psswEncriptadoFinal + burla_araujo(password.charAt(i));
        }
        return psswEncriptadoFinal;
    }

    private String rarosToNumber(String numDelTexto) {
        String numeroDelTexto = "";
        for (int i = 0; i < numDelTexto.length(); i++) {
            numeroDelTexto = numeroDelTexto + dcba_araujo(numDelTexto.charAt(i));
        }
        return numeroDelTexto;

    }

    public String abcdescencriptar(String contraUserIs) {
        String psswVisible = "";
        contraUserIs = rarosToNumber(contraUserIs);
        for (String numero : contraUserIs.split(":")) {
            psswVisible = psswVisible + ((char) (Integer.valueOf(numero) + 1));
        }
        return psswVisible;
    }

    private String psswToAscii(String password) {
        String msgPrimerCifrado = "";
        for (int i = 0; i < password.length(); i++) {
            msgPrimerCifrado = msgPrimerCifrado + ((int) password.charAt(i) - 1) + ":";
        }
        msgPrimerCifrado = msgPrimerCifrado.substring(0, msgPrimerCifrado.length() - 1);

        return msgPrimerCifrado;
    }

    private String abcd_araujo(char abcd) {
        switch (abcd) {
            case '0':
                return "㊜";
            case '1':
                return "㊝";
            case '2':
                return "㊮";
            case '3':
                return "㊯";
            case '4':
                return "㊑";
            case '5':
                return "㊓";
            case '6':
                return "㊔";
            case '7':
                return "㊕";
            case '8':
                return "㊗";
            case '9':
                return "㊙";
            case ':':
                return "㊩";
            case '-':
                return "㊤";
            default:
                return String.valueOf(abcd);
        }

    }

    private String dcba_araujo(char abcd) {
        switch (abcd) {
            case '㊜':
                return "0";
            case '㊝':
                return "1";
            case '㊮':
                return "2";
            case '㊯':
                return "3";
            case '㊑':
                return "4";
            case '㊓':
                return "5";
            case '㊔':
                return "6";
            case '㊕':
                return "7";
            case '㊗':
                return "8";
            case '㊙':
                return "9";
            case '㊩':
                return ":";
            case '㊤':
                return "-";
            default:
                return String.valueOf(abcd);
        }

    }

    private String burla_araujo(char abcd) {
        switch (abcd) {
            case '㊜':
                return "1";
            case '㊝':
                return "si";
            case '㊮':
                return "or";
            case '㊯':
                return "les";
            case '㊑':
                return "|";
            case '㊓':
                return "ij";
            case '㊔':
                return "ap";
            case '㊕':
                return "xs";
            case '㊗':
                return "jpq";
            case '㊙':
                return "que";
            case '㊩':
                return "m";
            case '㊤':
                return "l";
            default:
                return String.valueOf(abcd);
        }

    }

}
