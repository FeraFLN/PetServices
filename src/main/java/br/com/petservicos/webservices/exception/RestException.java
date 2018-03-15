package br.com.petservicos.webservices.exception;

/**
 * RestException Servi�o Rest para tratamento de exce��o
 * 
 * @author Fernando Neto � Portfolio Java Team 
 * 
 * <pre>
 * History: 
 *    28/04/2015 - Fernando Neto
 * </pre>    
 */
public class RestException extends Exception{
    private static final long serialVersionUID = 1L;

    public RestException(Throwable cause) {
        super(cause);
    }

    public RestException(String message, Throwable cause) {
        super(message, cause);
    }

    public RestException(String message) {
        super(message);
    }

    public RestException() {
    }
    
}
