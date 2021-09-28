package com.company.controlstatement;

public class SwitchMain {
    public static void main(String[] arr)
    {
        int condition=2;
        switch (condition)
        {
            case 1:
                System.out.println("Case 1");
                break;// without break, along with matching case all the below cases output also display
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("default");
        }
    }


}
