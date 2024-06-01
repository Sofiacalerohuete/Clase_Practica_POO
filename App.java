public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! :/ ");

        Empleado [] empleados= new Empleado[2];

        empleados [0] = new EmpleadoTiempoCompleto("Juan Perico", 123,48000.0);
        empleados [1]= new EmpleadoMedioTiempo("Maria Del Carmen", 345, 15.0, 20);


        for (Empleado empleado : empleados){
            System.out.println("Empleados: " + empleado.getNombre() + ", Salario Mensual: $" + empleado.calcularSalario());
        } 

        for (empleados i = 0; i < empleados.length; i++) {
            System.out.println("Si le soy sincera, no me acuerdo que tenia que poner aca");
        }

        
    }
}
