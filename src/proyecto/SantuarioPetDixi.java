/*
UNIVERSIDAD FIDELITAS
INTRODUCCION A PROGRAMACION1
PROFESORA KHRISTY AGUERO VALVERDE
ESTUDIANTE VERONICAPEREZSEGURA
PROYECTO
 */
package proyecto;

import javax.swing.JOptionPane;

public class SantuarioPetDixi {

    public static void main(String[] args) {
        int opcion = 0;
        Cliente clientes = new Cliente();
        Servicios servicio = new Servicios();
        Cita solicitar = new Cita();
        Adopcion mascota = new Adopcion();
        Productos arreglo = new Productos();
        Facturacion total = new Facturacion();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Crearcliente, 2. VerCliente,3.Socio 4.VerSocio 0. Salir"));
            switch (opcion) {
                case 1:
                    clientes.solicitar();
                    break;
                case 2:
                    clientes.verinformacion();
                    break;
                case 3:
                    clientes.sersocio();
                    break;
                case 4:
                    clientes.verificarclave();
                    break;
            }
        } while (opcion != 0);
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.ConsultarServicio,2.VerServicio , 0. Salir"));
            switch (opcion) {
                case 1:
                    servicio.agregarservicio();
                    break;
                case 2:
                    servicio.mostrarDatos();

                    break;
            }
        } while (opcion != 0);
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Cita, 2. VerCita, 0. Salir"));
            switch (opcion) {
                case 1:
                    solicitar.crearcita();
                    break;
                case 2:
                    solicitar.informacioncita();
                    break;
            }
        } while (opcion != 0);
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.BuscarMascota,2. InformacionDueño,3.ObservarInformacion 4.Condicion,0. Salir"));
            switch (opcion) {
                case 1:
                    mascota.cargarDatosanimal();
                    break;
                case 2:
                    mascota.cargarDatosadoptante();
                    break;
                case 3:
                    mascota.mostrardatos();
                    break;
                case 4:
                    mascota.mostrarcondicion();
                    break;
            }
        } while (opcion != 0);

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Tipoproducto,2.Cantidades, 0. Salir"));
            switch (opcion) {
                case 1:
                    arreglo.tipodeproducto(opcion);
                    break;
                case 2:
                    arreglo.llenardatos();
                    break;
            }
        } while (opcion != 0);
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Escoger Sedes,2. MostrarSedes,3.HacerFacturacion4.Facturar 0. Salir"));
            switch (opcion) {
                case 1:
                    total.Llenar_Arreglo();
                    break;
                case 2:
                    total.Recorrer_Arreglo();
                    break;
                case 3:
                    total.Facturacion();

                    break;
                case 4:
                    total.facturar();

                    break;
            }
        } while (opcion != 0);
    }
}
