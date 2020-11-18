import java.util.Scanner;


public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Scanner clavier= new Scanner(System.in);
		        System.out.println("Quantity:");
		        int quantity= clavier.nextInt();
		        System.out.println("unitPrice:");
		        float unitPrice=clavier.nextFloat();
		        Produit P=new Produit();
		    System.out.println("Total="+P.calculateTotalPrice(quantity, unitPrice));
			}

	}


