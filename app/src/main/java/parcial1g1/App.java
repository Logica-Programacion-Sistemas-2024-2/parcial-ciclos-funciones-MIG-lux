
public static void main(String[] args) {

    public class CalculoConsumoCombustible {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Preguntar cuántos vehículos participaron
            System.out.print("Ingrese el número de vehículos que participaron: ");
            int numVehiculos = scanner.nextInt();
    
            double consumoTotal = 0;
    
            for (int i = 0; i < numVehiculos; i++) {
                // Preguntar cuántos metros recorrió cada vehículo
                System.out.print("Ingrese la distancia recorrida por el vehículo " + (i + 1) + " en metros: ");
                double distanciaMetros = scanner.nextDouble();
    
                
                while (distanciaMetros <= 0) {
                    System.out.print("La distancia debe ser un número positivo. Ingrese nuevamente: ");
                    distanciaMetros = scanner.nextDouble();
                }
    
                
                double distanciaKilometros = distanciaMetros / 1000;
    
               
                double consumoCombustible = distanciaKilometros * 0.1; 
    
                // Mostrar resultados para cada vehículo
                System.out.println("Vehículo " + (i + 1) + ":");
                System.out.println("Distancia recorrida: " + distanciaKilometros + " km");
                System.out.println("Consumo de combustible: " + consumoCombustible + " litros");
    
                // Sumar consumo total
                consumoTotal += consumoCombustible;
            }
    
            // Mostrar consumo total general
            System.out.println("Consumo total de combustible: " + consumoTotal + " litros");
        }     
    }
}


    

    @Test
    void testCalcularConsumoGasolina() {
        // Definimos un margen de error para las comparaciones de decimales
        float delta = 0.1f;

        // Caso de prueba 1: 750 km debe consumir exactamente 55 litros
        float resultado1 = App.calcularConsumoGasolina(750);
        assertEquals(55.0f, resultado1, delta, "Error en el cálculo para 750 km");

        // Caso de prueba 2: 600 km debe consumir aproximadamente 44 litros
        float resultado2 = App.calcularConsumoGasolina(600);
        assertEquals(44.0f, resultado2, delta, "Error en el cálculo para 600 km");

        // Caso de prueba 3: 800 km debe consumir aproximadamente 58.67 litros
        float resultado3 = App.calcularConsumoGasolina(800);
        assertEquals(58.67f, resultado3, delta, "Error en el cálculo para 800 km");

        // Caso de prueba 4: 0 km debe consumir 0 litros
        float resultado4 = App.calcularConsumoGasolina(0);
        assertEquals(0.0f, resultado4, delta, "Error en el cálculo para 0 km");

        // Caso de prueba 5: 1000 km debe consumir aproximadamente 73.33 litros
        float resultado5 = App.calcularConsumoGasolina(1000);
        assertEquals(73.33f, resultado5, delta, "Error en el cálculo para 1000 km");
        
    }

}
