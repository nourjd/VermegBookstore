import java.util.Scanner;
import java.sql.*;


public class Main {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			 Scanner clavier= new Scanner(System.in);
		        System.out.println("Quantity=");
		        int quantity= clavier.nextInt();
		        System.out.println("unitPrice=");
		        float unitPrice=clavier.nextFloat();
		        Produit P=new Produit();
		    System.out.println("The total price is="+P.calculateTotalPrice(quantity, unitPrice));
		    
		    Connexion cnx = new Connexion();
			cnx.insertBook();
			cnx.displayBook();
		    
			}

	}


