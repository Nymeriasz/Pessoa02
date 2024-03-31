package Pessoa02;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
       Pessoa p1 = new Pessoa("Pamella", 20);
       Pessoa p2 = new Pessoa("Maria", 19);

       ArrayList<Pessoa> nomes = new ArrayList<Pessoa>();
       nomes.add(new Pessoa("lala",2));
       nomes.add(new Pessoa("po", 4));

        for (Pessoa povo:nomes){
            System.out.println(povo);

        }


    }
}