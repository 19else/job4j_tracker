package ru.job4j.calculator;

public class Exercise {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human0 = new Human("Chuk");
        Human human3 = new Human("Serg", 5);
           }

    static class Human {
        private String name;
        private int age;

        public Human() {
            System.out.println("Пустой конструктор");
        }

        public Human(String name) {
            this.name = name;
            System.out.println("Конструктор с переменной String " + this.name);
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Привет из третьего конструктора " + this.name + ", " + this.age);
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void getInfo() {
            System.out.println(name + " " + age);
        }
    }

        public static int calculate(int[] hours) {
            int rsl = 0;
            for (int index = 0; index < hours.length; index++) {
                if (hours[index] <= 8) {
                    rsl = rsl + 10 * hours[index];
                }
                if (hours[index] > 8) {
                    rsl = rsl + 8 * 10 + (hours[index] - 8) * 15;
                }
                if (index > 4 && hours[index] != 0)  {
                    rsl = hours[index] <= 8
                           ? rsl + (hours[index] * 10)  : rsl + (8 * 10 + (hours[index] - 8) * 15);
                }
            }
            return rsl;
        }

        public static int calculate1(int[] hours) {
            int sum = 0;
            for (int index = 0; index < hours.length; index++) {
                int hour = hours[index];
                int sumBase = hour * 10;
                int sumHi = (hour - 8) * 15;
                if (index < 5) {
                    sum = hour > 8 ? sum + sumHi + 8 * 10  : sum + sumBase;
                } else  {
                    sum = hour <= 8 ? sum + sumBase * 2 : sum + (sumHi + 8 * 10) * 2;
                }
            }
            return sum;
        }

 /**   public static void main(String[] args) {
        int[] hours = {8, 8, 8, 8, 8, 0, 0};
        int[] hours1= {10, 10, 10, 0, 8, 0, 0};
        int[] hours2= {10, 0, 12, 0, 8, 12, 4};
        int[] hours3= {0, 0, 0, 0, 0, 7, 0};
        System.out.println(calculate(hours));
        System.out.println(calculate(hours1));
        System.out.println(calculate(hours2));
        System.out.println(calculate(hours3));
        System.out.println(calculate1(hours2));
    } **/

    public static boolean check(String left, String right) {
            char l1 = left.charAt(0);
            char l2 = left.charAt(1);
            char r1 = right.charAt(0);
            char r2 = right.charAt(1);
        return l1 == r1 | l2 == r2;
    }

  /**  public static void main(String[] args) {
        System.out.println(check("A8", "E8"));
        System.out.println(check("H4", "H3"));
        System.out.println(check("A1", "B2"));
        System.out.println(check("F5", "C8"));
    } **/

}
