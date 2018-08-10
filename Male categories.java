package bjj.java Java;


import java.util.Scanner;
class BJJweight {
    public static void main(String[] args) {

        Scanner in = new Scanner( System.in );
System.out.print("Enter your weight in KG ");
int Weight=in.nextInt();
String weightClass=null;

if (Weight < 57.5) {
            weightClass = "Rooster (Upto 57.5kg)";
        } else if (Weight < 64) {
            weightClass = "LightFeather (Upto 64kg)";
        } else if (Weight < 70) {
            weightClass = "Feather (Upto 70kg)";
        } else if (Weight < 76) {
            weightClass = "Light (Upto 76kg)";
        } else if (Weight < 82.3) {
            weightClass = "Middle (Upto 82.3kg)";
        }
        else if (Weight < 88.3) {
            weightClass = "Medium Heavy (Upto 88.3kg)";
        }
        else if (Weight < 94.3) {
            weightClass = "Heavy (Upto 94.3kg";
        }
        else if (Weight < 100.5) {
            weightClass = "Super Heavy (Upto 100.5kg)";
        }
        else if (Weight > 100.5) {
            weightClass = "Ultra Heavy (Over 100.5kg)";
        }
        System.out.println("Your weight class is: Male, " + weightClass);
    }
}