package fr.abbo.septArche.exceptions;

public class ErrorResponse {

    private String errorCode;
    private String errorMessage;
    // erreur personnalisée. Elle a deux attributs errorCode (code d'erreur)
    // et errorMessage (message d'erreur).
    public ErrorResponse(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
