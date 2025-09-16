package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static  int []numerosentradas = new int[100];
    static String[] zona = new String[100];
    static double[] precios = new double[100];
    static String[]tiposcliente= new String[100];
    static int totalentradas = 0;
    static double dinerototal = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("Teatro moro sistema de entradas");
        System.out.println("=================================");
        do {
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {

                case 1 -> venderentrada(scanner);
                case 2 -> mostrarpromociones();
                case 3 -> buscarentradas(scanner);
                case 4 -> eliminarentrada(scanner);
                case 5 -> System.out.println("gracias por usar el sistema");
                default -> System.out.println("opcion no valida");
            }
            while (opcion != 5) ;
            scanner.close();
        }
        System.out.println("menu principal");
        System.out.println("1.vender entrada");
        System.out.println("2.ver promociones");
        System.out.println("3.buscar entradas");
        System.out.println("4.eliminar entrada");
        System.out.println("5.salir");
        System.out.println("elige una opcion (1-5):");

        System.out.println("vender entrada");
        System.out.println("===============");
        String zona;
        int edad;
        double preciobase;
        double descuento = 0;
        String tipo = "normal";
        System.out.println("zonas disponibles:");
        System.out.println("VIP- $20.000");
        System.out.println("platea-$15.000");
        System.out.println("general-$10.000");
        System.out.println("elige zona (vip-platea-general):);

                zona= scanner.nextLine();
        while (!zona.equalsIgnoreCase("VIP")&&
               !zona.equalsIgnoreCase("platea")&&
                !zona.equalsIgnoreCase("general")) {
            System.out.println("zona no valida");
            System.out.println("elige zona (VIP-platea-general):");
            zona = scanner.nextLine();
        }
if (zona.equalsIgnoreCase("vip")) {
    preciobase = 20.000;
} else if (zona.equalsIgnoreCase("platea")) {
    preciobase = 15.000
}else {
    preciobase = 10.000
}

        System.out.println("edad del cliente:");
while (!scanner.hasNextInt()) {
    System.out.println("por favor ingresa un numero");
    scanner.next();
    System.out.println("edad del cliente");
}
edad = scanner.nextInt();
scanner.nextLine();

if (edad>-65) {
    descuento = preciobase * 0.15;
    tipo = "tercera edad";
    System.out.println("descuento del 15% aplicado tercera edad");
}else{
    System.out.println("eres estudiante? (S/N):");
    String respuesta = scanner.nextLine();
    if (respuesta.equalsIgnoreCase("si")) {
        descuento = preciobase * 0.10;
        tipo = "estudiante";
        System.out.println("descuento del 10% aplicado estudiante");
    }
    double preciofinal = preciobase - descuento;

    numerosentradas[totalentradas]= totalentradas +1;
    zona [totalentradas]= zona;
    precios[totalentradas]= preciofinal;
    tiposcliente[totalentradas]= tipo;

    totalentradas++;
    dinerototal+= preciofinal;
    System.out.println("entrada vendidad exitosamente");
    System.out.println("_______________________________");
    System.out.println("numero:" + totalentradas);
    System.out.println("zona:"+ zona);
    System.out.println("tipo:" + tipo);
    System.out.println("precio final:$" + preciofinal);
    System.out.println("______________________________");

    System.out.println("promociones especiales");
    System.out.println("========================");
    System.out.println("estudiantes:10% descuento");
    System.out.println("tercera edad (65+): 15% descuento");
    System.out.println("grupos (+5 personas):20% descuento adicional");
    System.out.println("promo VIP:2 entradas VIP por 30.000");
    System.out.println("======================================");
    System.out.println("BUSCAR ENTRADAS");
    System.out.println("================");
    if (totalentradas == 0) {
        System.out.println("No hay entradas vendidas aun");
        return;
    }
    System.out.println("1.por numero");
    System.out.println("2. por zona");
    System.out.println("3.por tipo cliente");
    System.out.println("elige opcion (1-3):");

    int opcionbusqueda= scanner.nextInt();
    scanner.nextLine();
    switch (opcionbusqueda){
        case 1-> {
            System.out.println("numero de entrada:");
            int numero = scanner.nextInt();

            case 2 -> {
                System.out.println("zona (VIP-platea-general):");
                String zona = Scanner.nexline();

                case 3 -> {
                    System.out.println("tipo (estudiante/tercera edad/ normal):");
                    String tipo = scanner.nextLine();

                    default -> System.out.println("opcion no valida");
                }

                for (int i = 0; i < totalentradas; i ++){
                    if (numerosentradas[i] == numero) {
                        System.out.println("entrada encontrada:");
                        System.out.println("numero" + numerosentradas[i]);
                        System.out.println("zona:" + zona[i]);
                        System.out.println("tipo:" + tiposcliente[i]);
                        System.out.println("precio:$" + precios[i]);
                        return;
                    }

                    }
                System.out.println("entrada no encontrada");
                boolean encontradas = false;
                System.out.println("buscando en zona:"+ zona);
                for (int i = 0; i < totalentradas; i++) {
                    if (zona.equalsIgnoreCase(zona)) {
                        System.out.println("entrada" + numerosentradas[i] + "-" + tiposcliente[i] + "-$" + precios[i]);
                        encontradas = true;
                    }
                    if (!encontradas) {
                        System.out.println("no hay entradas en esta zona");
                    }
                }
                boolean encontradas = false;
                System.out.println("buscando tipo:"+ tipo);
                for (int i = 0; i < totalentradas; i ++){
                    if (tiposcliente[i].equalsIgnoreCase(tipo)) {
                        System.out.println("entrada" + numerosentradas[i] + "-" + zona[i] + "-$" + precios[i]);
                        encontradas = true;
                    }
                    if (!encontradas){
                        System.out.println("no hay entradas de este tipo ");
                        System.out.println("eliminar entrada");
                        System.out.println("=================");

                        if (totalentradas == 0){

                        }
                        System.out.println("no hay entradas para eliminar");
                        return;

                        System.out.println("numero de entrada a eliminar:");
                        int numero = scanner.nextInt();
                        for (int i = 0; i < totalentradas;i++){
                            if (numerosentradas[i] == numero){
                                System.out.println("eliminando entrada:");
                                System.out.println("numero:"+ numerosentradas[i]);
                                System.out.println("zona:"+ zona [i]);
                                System.out.println("precio: $ " + precios[i]);

                                dinerototal -= precios[i];
                                for (int j = i; j < totalentradas -1;j++) {
                                    numerosentradas[j] = numerosentradas[j + 1];
                                    zona[j] = zona[j + 1];
                                    precios[j] = precios[j + 1];
                                    tiposcliente[j] = tiposcliente[j + 1];
                                }
                                totalentradas--;
                                System.out.println("entrada eliminada exitosamente");
                                return;

                                System.out.println("entrada no encontrada");
                                
                                }
                            }
                        }

                    }
                }
            }


}

    }




        }
    }
}