package PracticePackage;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class PracticeClass {
    public static void main(String[] args) {
        String dogBreed=new String("          Best Breed is Doberman Pincher");

        System.out.println(dogBreed.length());
        System.out.println(dogBreed.toLowerCase());
        System.out.println(dogBreed.toUpperCase());
        System.out.println(dogBreed.concat(" and this breed required so much more experience"));
        System.out.println(dogBreed.concat(" Furthermore this breed is so strong"));

        System.out.println(dogBreed.trim());

        int length=dogBreed.length();
        System.out.println(length);

        String s="I'm getting more experienced about coding";

        int len=s.length();
        System.out.println(len);

        System.out.println("==============================");

        String str="Hello all friends how are you!";

        System.out.println(str.isEmpty());

        boolean condition=str.isEmpty();

        if(condition){
            System.out.println("Text is not empty!");
        }else {
            System.out.println("Text is unfortunately empty!");
        }

        System.out.println("==============================");

        String trim="    We need to trim this sentences      ";
        System.out.println(trim);
        System.out.println(trim.trim());

        trim=trim.trim();
        System.out.println(trim);

        System.out.println("==============================");


        String heal="I Keep Learning Java and I'm getting better everyday";

        System.out.println(heal.startsWith("I"));
        System.out.println(heal.endsWith("everyday"));
        System.out.println(heal.contains("Keep"));
        System.out.println(heal.contains("keep"));
        System.out.println(heal.contains("better"));
        System.out.println(heal.contains("learning"));
        System.out.println(heal.contains("I'm"));
        System.out.println(heal.contains("g"));

        System.out.println("==============================");


        String st="Java";

        if(st.equals("java")){
            System.out.println("Yes this condition is true");
        }else{
            System.out.println("occur mistake for uppercase and lowercase!");
        }

        System.out.println("==============================");


        String str1="What is going on there dude!";

        System.out.println(str1.charAt(2));
        System.out.println(str1.charAt(9));
        System.out.println(str1.substring(9));
        System.out.println(str1.charAt(5));

        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));

        }
        System.out.println();

        int count=0;

        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i)=='d'){
                count++;
            }

        }
        System.out.println(count);


        System.out.println("==============================");

        String strr="Masserati";

        System.out.println(strr.indexOf('M'));
        System.out.println(strr.indexOf('i'));
        System.out.println(strr.charAt(4));
        System.out.println(strr.indexOf('r'));
        System.out.println(strr.indexOf('a'));

        for (int i = 0; i < strr.length(); i++) {
            if(strr.charAt(i)=='r'){
                System.out.println(i);
            }


        }


        System.out.println("======================================");

        String java="Learning java is so easy";

        String newstr=java.substring(0,8);
        System.out.println(newstr);

        String newstr2=java.substring(9,13);
        System.out.println(newstr2);

        String newstr3=java.substring(14,16);
        System.out.println(newstr3);

        String newstr4=java.substring(17,19);
        System.out.println(newstr4);

        String newstr5=java.substring(20,24);
        System.out.println(newstr5);

        System.out.println("======================================");

        String car="good job for every one and good job to teacher that is good colaborate";

        System.out.println(car.replace("job","work is done"));

        System.out.println("======================================");


        String str2="Java is easy. I keep learning the java";
        String[]str2Arr=str2.split("[.]");
        System.out.println(str2Arr.length);







    }
}
