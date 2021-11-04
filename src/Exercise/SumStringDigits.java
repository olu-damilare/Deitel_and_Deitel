package Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class Solution {
    public String addStrings(String num1, String num2) {
        int num1Counter = num1.length() - 1;
        int num2Counter = num2.length() - 1;
        int firstVal;
        int secondVal;
        int result;
        int tenth = 0;
        int unit;
        StringBuilder sb = new StringBuilder();


        while(num1Counter >= 0 && num2Counter >=0){
            firstVal = Integer.parseInt(Character.toString(num1.charAt(num1Counter)));
            secondVal = Integer.parseInt(Character.toString(num2.charAt(num2Counter)));
            result = firstVal + secondVal + tenth;

            if(result < 10){
                sb.insert(0, result);
                tenth = 0;
            }
            else{
                tenth = result / 10;
                unit = result % 10;
                sb.insert(0, unit);
            }

            if (num1Counter == 0 && num2Counter == 0 && tenth > 0){
                sb.insert(0, tenth);
            }
            num1Counter--;
            num2Counter--;

        }

        if(num1Counter >= 0){
            calculateForRemnant(num1, num1Counter, tenth, sb);
        }else if(num2Counter >= 0){
            calculateForRemnant(num2, num2Counter, tenth, sb);
        }
        return sb.toString();

    }

    private void calculateForRemnant(String value, int num1Counter, int tenth, StringBuilder sb) {
        String remnant;
        int result;
        int unit;
        remnant = value.substring(0, num1Counter + 1);
        if(tenth == 0) {
            sb.insert(0, remnant);
        }else{
            int remnantCounter = remnant.length() - 1;
            while(remnantCounter >= 0){
                result = Integer.parseInt(Character.toString(remnant.charAt(remnantCounter))) + tenth;
                if(result < 10){
                    sb.insert(0, result);
                    tenth = 0;
                }else{
                    tenth = result / 10;
                    unit = result % 10;
                    sb.insert(0, unit);
                }

                remnantCounter --;
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Account> stuff = new HashMap<>();
        Account account = new Account(5000);
        stuff.put("dami", account);
        Account newAcc = stuff.get("dami");
        System.out.println(newAcc.amount);

        newAcc.amount += 2000;

        System.out.println(newAcc.amount);
        System.out.println(stuff.get("dami").amount);


    }
}

class Account{
    double amount;

    Account(double amount){
        this.amount = amount;
    }
}