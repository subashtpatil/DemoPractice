package OverRiding;

public class ROIOverriding {


        public static void main(String args[]){
            SBI s=new SBI();
            ICICI i=new ICICI();
            HDFC h=new HDFC();
            System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
            System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
            System.out.println("HDFC Rate of Interest: "+h.getRateOfInterest());
        }
    }

