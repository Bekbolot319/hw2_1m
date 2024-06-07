import java.util.Random;

public class Main {
    public static String permission(int age, int temperature)
    {
        if (((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) ||
            (age < 20 && (temperature >= 0 && temperature <= 28)) || (age >45 && (
                    temperature>=-10 && temperature<=25))) {
        return "Можно идти гулять";
    }else{
            return "Оставайтесь дома";
    }
    }
        public static void main (String[] args) {
        System.out.println(permission(18,29));
        System.out.println(permission(13,23));
        System.out.println(permission(-7,37));
        System.out.println(permission(0,9));
        System.out.println(permission(81,-43));

        System.out.println(permission(generateRandomAge(),17));
    }

      public static int generateRandomAge() {
       Random age = new Random();
       return age.nextInt(100);
    }
}