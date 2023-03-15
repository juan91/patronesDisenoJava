package com.patrones.demo.singleton;


import java.lang.reflect.Constructor;

public class MainS {

    public static String roll(String s,String[][] op){
        char[] ans=s.toCharArray();
        for(int i=0;i<op.length;i++){
            int a=Integer.parseInt(op[i][0]);
            int b=Integer.parseInt(op[i][1]);
            for(int j=a;j<=b;j++){
                ans[j]=op[i][2].equals("L")?(char)((ans[j]-'a'+26-1)%26+'a'):(char)((ans[j]-'a'+1)%26+'a');
            }
            System.out.println(String.valueOf(ans));
        }
        return String.valueOf(ans);
    }


    public static String rollingString(String s, String[] operations) {
        char[] charArray = s.toCharArray();
        for (String operation : operations) {
            String[] parts = operation.split(" ");
            int start = Integer.parseInt(parts[0]);
            int end = Integer.parseInt(parts[1]);
            String operationType = parts[2];

            for (int i = start; i <= end; i++) {
                switch (operationType) {
                    case "L":
                        charArray[i] = (char) (((charArray[i] - 'a' + 25) % 26) + 'a');
                        break;
                    case "R":
                        charArray[i] = (char) (((charArray[i] - 'a' + 1) % 26) + 'a');
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operation: " + operationType);
                }
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) throws Exception {

        SingletonEager s1 = SingletonEager.getInstance();
        SingletonEager s2 = SingletonEager.getInstance();
        System.out.println("Hashcode of Object s1: " +s1.hashCode());
        System.out.println("Hashcode of Object s2: " +s2.hashCode());

        // Con inflexion podemos violar patron singleton
      /*  Class clazz = Class.forName("com.patrones.demo.singleton.SingletonEager");
        Constructor<SingletonEager> ctr= clazz.getDeclaredConstructor();
        ctr.setAccessible(true);
        SingletonEager s3 = ctr.newInstance();
        System.out.println("Hashcode of Object s3: " +s3.hashCode());

       */

        String[] matriz = {"0 0 L", "2 2 L", "0 2 R"};


        System.out.println(rollingString("abc", matriz));

    }

}
