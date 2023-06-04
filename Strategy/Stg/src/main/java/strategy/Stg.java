/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package strategy;

/**
 *
 * @author JCMB
 */
public class Stg {

    public static void main(String[] args) {
        // Criação do objeto Context
        Soldado soldier = new Soldado();

        // Definindo e executando diferentes estratégias
        soldier.setStrategy(new Strategy1());
        soldier.executeStrategy();

        soldier.setStrategy(new Strategy2());
        soldier.executeStrategy();

        soldier.setStrategy(new Strategy3());
        soldier.executeStrategy();

        soldier.setStrategy(new Strategy4());
        soldier.executeStrategy();
        
        soldier.setStrategy(new Strategy5());
        soldier.executeStrategy();
    }
}