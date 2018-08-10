package bjj.java Java;


import java.util.Scanner;
class BJJweight {
    public static void main(String[] args) {

        Scanner in = new Scanner( System.in );
System.out.print("Enter your weight in KG ");
int Weight=in.nextInt();
String weightClass=null;

if (Weight < 57.5) {
            weightClass = "Rooster";
        } else if (Weight < 64) {
            weightClass = "LightFeather";
        } else if (Weight < 70) {
            weightClass = "Feather";
        } else if (Weight < 76) {
            weightClass = "Light";
        } else if (Weight < 82.3) {
            weightClass = "Middle";
        }
        else if (Weight < 88.3) {
            weightClass = "Medium Heavy";
        }
        else if (Weight < 94.3) {
            weightClass = "Heavy";
        }
        else if (Weight < 100.5) {
            weightClass = "Super Heavy";
        }
        else if (Weight > 100.5) {
            weightClass = "Ultra Heavy";
        }
        System.out.println("Your weight class is " + weightClass);
    }
}