/* 
 * Copyright 2020 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    public static final Random RND = new Random();

    public static void main(String[] args) {
//      Variable tipo fecha
        Date d = new Date();

//      Constantes numero factura
        final int NUM_MAX = 9999999;
        final int NUM_MIN = 0000001;

//      Random numero factura
        int serie = RND.nextInt(NUM_MAX - NUM_MIN + 1) - NUM_MIN;

//      Variables factura
        String producto1, producto2, producto3;
        int cantidad1, cantidad2, cantidad3;
        double precioU1, precioU2, precioU3;
        double precioT1, precioT2, precioT3;

        try {
//          Introducr nombre, cantidad y precio
//          Producto 1
            System.out.print("Introduce Nombre 1 .....: ");
            producto1 = SCN.nextLine();
            System.out.print("Introduce Cantidad .....: ");
            cantidad1 = SCN.nextInt();
            System.out.print("Introduce Precio .......: ");
            precioU1 = SCN.nextDouble();

            SCN.nextLine();

//          Producto 2
            System.out.print("Introduce Nombre 2 .....: ");
            producto2 = SCN.nextLine();
            System.out.print("Introduce Cantidad .....: ");
            cantidad2 = SCN.nextInt();
            System.out.print("Introduce Precio .......: ");
            precioU2 = SCN.nextDouble();

            SCN.nextLine();

//          Producto 3
            System.out.print("Introduce Nombre 3 .....: ");
            producto3 = SCN.nextLine();
            System.out.print("Introduce Cantidad .....: ");
            cantidad3 = SCN.nextInt();
            System.out.print("Introduce Precio .......: ");
            precioU3 = SCN.nextDouble();

            SCN.nextLine();

//          Total unidades
            precioT1 = precioU1 * cantidad1;
            precioT2 = precioU2 * cantidad2;
            precioT3 = precioU3 * cantidad3;

//          Total factura
            double total = precioT1 + precioT2 + precioT3;

//          Salir por pantalla
            System.out.printf("%n---%n");
            System.out.printf("%nMERCADOLLARS SA.%n");
            System.out.printf("Fecha expedición .........: %1$td/%1$tm/%1$tY "
                    + "%n", d);
            System.out.printf("Hora expedición ..........: %tT%n", d);
            System.out.printf("Num. Factura .............: %d%n", serie);

            System.out.printf("%n---%n%n");

            System.out.println("Uds   Articulos             Precio    Total");
            System.out.println("---------------------------------------------");

            System.out.printf(Locale.ENGLISH, "%-3d x %-12s .......: %-6.2f€u "
                    + " %.2f€%n", cantidad1, producto1, precioU1, precioT1);
            System.out.printf(Locale.ENGLISH, "%-3d x %-12s .......: %-6.2f€u "
                    + " %.2f€%n", cantidad2, producto2, precioU2, precioT2);
            System.out.printf(Locale.ENGLISH, "%-3d x %-12s .......: %-6.2f€u "
                    + " %-6.2f€%n", cantidad3, producto3, precioU3, precioT3);

            System.out.println("---------------------------------------------");
            System.out.printf(Locale.ENGLISH,
                    "TOTAL ..............................: %-6.2f€%n", total);

//          Excepcion
        } catch (Exception e) {
            System.out.println("ERROR. Entrada incorrecta.");
        }

    }

}
