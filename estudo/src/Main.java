import javax.swing.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        Scanner ler= new Scanner(System.in);

        String nome=new String();
        System.out.print("Digite seu nome: ");
        nome=ler.next();

        String palavra=new String();
        System.out.print("Digite uma palavra ");
        palavra=ler.next();

        System.out.println("A plavra tem: "+palavra.length()+" letras");
        System.out.println(palavra.toUpperCase());

        int Nvogais = contarVogais(palavra);
        System.out.println("O numero de Vogais é: "+Nvogais);

        boolean Uno= palavra.toUpperCase().startsWith("UNO");
        if(Uno == true)
        {
            System.out.println("A palavra começa com UNO");
        }
        boolean Ste= palavra.toUpperCase().endsWith("STE");

        if(Ste == true)
        {
            System.out.println("A palavrea termina em STE");
        }
        int numeros= digitos(palavra);

        if (numeros==0)
        {
            System.out.println("Não existe numeros na palavra");
        }
        else
        {
            System.out.println("Existe "+numeros+ " Numero na palavra");
        }
    }

    public static int contarVogais(String palavra)
    {
        String V= new String("aeiouAEIOU");
        int i,cont = 0;

        for(i=0;i<palavra.length();i++)
        {
            if(V.indexOf(palavra.charAt(i)) != -1)
            {
                cont++;
            }
        }


        return cont;
    }
    public static int digitos(String palavra)
    {
        int i,cont=0;

        for (i=0;i<palavra.length();i++)
        {
            if(Character.isDigit(palavra.charAt(i)))
            {
                cont++;
            }
        }
        return cont;
    }
}