package transport;

public interface Diagnosticable {
    void runDiagnostic() throws DiagnosticNotAllowedException;
}
