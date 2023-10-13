
import Controller.Manager;
import Model.History;
import Model.Worker;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author QuaVi
 */

public class Main {

    public static void main(String[] args) {
        ArrayList<Worker> lw = new ArrayList<>();
        ArrayList<History> lh = new ArrayList<>();
       
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.addWorker(lw);
                    break;
                case 2:
                    Manager.changeSalary(lw, lh, 1);
                    break;
                case 3:
                    Manager.changeSalary(lw, lh, 2);
                    break;
                case 4:
                    Manager.printListHistory(lh);
                    break;
                case 5:
                    return;
            }
        }
    }
}
