package Ejercicios_Clase_1.Trabajo_Practico_Diagnostico.Ejercicio_7;
import javax.swing.JOptionPane;

public class CalculadoraPolacaInversaApp {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese los operandos y el operador
        int operando1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer operando:"));
        int operando2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo operando:"));
        String operador = JOptionPane.showInputDialog("Ingrese el operador (+, -, *, /, ^, %):");

        // Realizar la operación correspondiente
        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                resultado = (double) operando1 / operando2;
                break;
            case "^":
                resultado = Math.pow(operando1, operando2);
                break;
            case "%":
                resultado = operando1 % operando2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operador no válido.");
                return; // Salir del programa si el operador no es válido
        }

        // Mostrar el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
}
