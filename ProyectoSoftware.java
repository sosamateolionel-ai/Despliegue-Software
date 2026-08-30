public class ProyectoSoftware {

    private String nombreProyecto;
    private String clienteEmpresa;
    private int faseActual;

    ProyectoSoftware(String nombreProyecto, String clienteEmpresa) {
        this.nombreProyecto = nombreProyecto;
        this.clienteEmpresa = clienteEmpresa;
        this.faseActual = 1;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public String getClienteEmpresa() {
        return clienteEmpresa;
    }

    public int getFaseActual() {
        return faseActual;
    }

    // Avanza la fase en 1, hasta un máximo de 3
    void avanzarFase() {
        if (faseActual < 3) {
            faseActual++;
            System.out.println("El proyecto \"" + nombreProyecto + "\" avanzó a la fase: " + obtenerEstado());
        } else {
            System.out.println("El proyecto \"" + nombreProyecto + "\" ya se encuentra en la fase final: " + obtenerEstado());
        }
    }

    String obtenerEstado() {
        switch (faseActual) {
            case 1:
                return "Análisis";
            case 2:
                return "Desarrollo";
            case 3:
                return "Despliegue";
            default:
                return "Fase desconocida";
        }
    }

    void mostrarEstado() {
        System.out.println("===== Estado del proyecto =====");
        System.out.println("Proyecto: " + nombreProyecto);
        System.out.println("Cliente: " + clienteEmpresa);
        System.out.println("Fase actual (" + faseActual + "): " + obtenerEstado());
        System.out.println("");
    }

    public static void main(String[] args) {

        ProyectoSoftware proyecto1 = new ProyectoSoftware("Sistema de Facturación", "Bodega Los Alamos");

        proyecto1.mostrarEstado();

        proyecto1.avanzarFase(); 
        proyecto1.avanzarFase();
        proyecto1.avanzarFase();

        proyecto1.mostrarEstado();
    }
}