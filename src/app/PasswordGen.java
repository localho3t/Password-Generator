package app;

import java.util.Random;

public class PasswordGen implements PasswordGenImpl{

    private Integer length;
    private Integer count;

    public PasswordGen(Integer length, Integer count){
        this.count = count;
        this.length = length;
        this.startApp();
    }

    @Override
    public void startApp() {
        Alphabet alphabet = new Alphabet(true, true, true, true);
        String alpha = alphabet.getAlphabet();
        String[] alpha_array = alpha.split("");

        for (int i = 0; i < this.count; i++) {
            StringBuilder passwd = new StringBuilder();
            for (int j = 0; j < this.length; j++) {
                
                Random rand = new Random();
                int number = rand.nextInt(alpha_array.length);
                passwd.append(alpha_array[number]);
            
            }
            System.out.println(passwd.toString());

        }
    }


    
}
